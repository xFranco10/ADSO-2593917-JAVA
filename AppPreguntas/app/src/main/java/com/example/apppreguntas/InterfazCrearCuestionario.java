package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InterfazCrearCuestionario extends AppCompatActivity {

    TextView etq_nombres, etq_fecha_inicio, etq_num_pregunta, etq_descripcion_pregunta;
    RadioGroup radio_group;
    int contador_preguntas, contador_cant_ok, contador_cant_error;
    Random random;
    ArrayList<Integer> numerosUsados;
    String id_cuestionario, id_pregunta, respuestaSeleccionada, id_correcta, fecha;
    String estado = "";
    ImageView img_view;
    Config config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_crear_cuestionario);
        this.config = new Config(getApplicationContext());

        this.etq_nombres = findViewById(R.id.etq_nombres);
        this.etq_fecha_inicio = findViewById(R.id.etq_fecha_inicio);
        this.etq_num_pregunta = findViewById(R.id.etq_num_pregunta);
        this.etq_descripcion_pregunta = findViewById(R.id.etq_descripcion_pregunta);
        this.img_view = findViewById(R.id.img_view);
        radio_group = findViewById(R.id.radio_group);

        this.contador_preguntas = 0;
        this.contador_cant_ok = 0;
        this.contador_cant_error = 0;

        this.random = new Random();
        this.numerosUsados = new ArrayList<>();

        generarNumeroUnico();

        imprimirDatosIniciales();
        consumoApiCreandoCuestionario();
    }

    public void imprimirDatosIniciales(){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        etq_nombres.setText(archivo.getString("nombres",""));
        this.fecha = archivo.getString("fecha_inicio", "");
        etq_fecha_inicio.setText(fecha);

        this.id_cuestionario = archivo.getString("id", "");
        System.out.println("id del cuestionario: "+id_cuestionario);

    }

    // Funcion para generar un número aleatorio único del 1 al 10
    public void generarNumeroUnico() {

        while (true) {
            int numeroAleatorio = random.nextInt(10) + 1;

            if (!numerosUsados.contains(numeroAleatorio)) {
                numerosUsados.add(numeroAleatorio);
                mostrarNumero(Integer.toString(numeroAleatorio));
                break;
            }
        }
    }

    // Funcion para mostrar el almacenar el id y mostrarlo
    public void mostrarNumero(String id) {
        this.id_pregunta = id;
        System.out.println("Número aleatorio único generado: " + this.id_pregunta);
    }

    public void btnSiguiente(View vista){

        // Verificamos y almacenamos la respuesta y el id que el usuario escogio
        int selectedRadioButtonId = radio_group.getCheckedRadioButtonId();
        if (selectedRadioButtonId != -1) {
            RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
            this.respuestaSeleccionada = selectedRadioButton.getText().toString();
            System.out.println("el usuario respondio: " + this.respuestaSeleccionada);
            consumoPostConsultarIdyEstado(respuestaSeleccionada);
        } else {
            // Si ningún RadioButton está seleccionado
            Toast.makeText(getApplicationContext(), "Por favor, selecciona una respuesta", Toast.LENGTH_SHORT).show();
        }

        generarNumeroUnico();
        consumoApiCreandoCuestionario();


        if (this.contador_preguntas == 9){
            System.out.println(" --- SE FINALIZO EL CUESTIONARIO --- ");

            Intent intencion = new Intent(getApplicationContext(), InterfazFinCuestionario.class);
            startActivity(intencion);
            finish();
        }



    }

    public void consumoApiCreandoCuestionario(){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/getOtherPregunta.php?id="+this.id_pregunta);

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    extractAll( jsonObject );
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                params.put("id", id_pregunta);

                return params;
            }
        };
        queue.add(solicitud);
    }

    public void extractAll(JSONObject data){
        try {
            this.contador_preguntas+=1;
            System.out.println("pregunta actual: "+contador_preguntas);
            etq_num_pregunta.setText(String.valueOf(contador_preguntas));
            etq_num_pregunta.setTextColor(Color.BLACK);

            //Limpiar el radio group
            radio_group.removeAllViews();

            JSONObject pregunta = data.getJSONObject("pregunta");
            String descripcion_pregunta = pregunta.getString("descripcion");
            String url_imagen = pregunta.getString("url_imagen");
            this.id_correcta = pregunta.getString("id_correcta");
            System.out.println("Este el id_correcto: "+id_correcta);

            etq_descripcion_pregunta.setText(descripcion_pregunta);
            etq_descripcion_pregunta.setTextColor(Color.BLACK);

            // Cargar y mostrar la imagen usando Glide
            Glide.with(this)
                    .load(url_imagen)
                    .into(img_view);

            System.out.println("Esta es la url de la imagen: "+url_imagen);


            JSONArray array = data.getJSONArray("opciones");
            for (int i = 0; i < array.length(); i++) {
                JSONObject opcion = array.getJSONObject(i);
                String descripcion_respuesta = opcion.getString("descripcion");


                RadioButton radio_button = new RadioButton(getApplicationContext());
                radio_button.setText(descripcion_respuesta);
                radio_button.setTextColor(Color.BLACK);

                radio_group.addView(radio_button);
            }


        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }


    public void consumoPostConsultarIdyEstado(String respuesta){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/consultarEstado.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    extractIdOpcionRespuesta( jsonObject );
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }) {
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();

                params.put("respuesta", respuesta);

                return params;
            }
        };
        queue.add(solicitud);



    }

    public void extractIdOpcionRespuesta(JSONObject data) throws JSONException {
        JSONObject id_opcion = data.getJSONObject("id_opcion");
        String id = id_opcion.getString("id");
        System.out.println("el id la respuesta: "+id);

        if (id.equalsIgnoreCase(id_correcta)){
            this.contador_cant_ok+=1;
            estado = "OK";
            consumoApiregistrarRespuestas();
            System.out.println("Estado: "+estado);
            System.out.println("preguntas ok: "+String.valueOf(contador_cant_ok));

        }else{
            this.contador_cant_error+=1;
            estado = "ERROR";
            consumoApiregistrarRespuestas();
            System.out.println("Estado: "+estado);
            System.out.println("preguntas error: "+String.valueOf(contador_cant_error));
        }
    }

    public void consumoApiregistrarRespuestas(){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/insertRespuestasCuestionario.php");
        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<>();

                params.put("id_cuestionario", id_cuestionario);
                params.put("id_pregunta", id_pregunta);
                params.put("respuesta", respuestaSeleccionada);
                params.put("estado", estado);
                params.put("fecha", fecha);
                params.put("cant_preguntas", String.valueOf(contador_preguntas));
                params.put("cant_ok", String.valueOf(contador_cant_ok));
                params.put("cant_error", String.valueOf(contador_cant_error));

                return params;
            }
        };

        queue.add(solicitud);

    }



}