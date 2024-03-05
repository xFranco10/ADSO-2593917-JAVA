package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class InterfazVerDetalles extends AppCompatActivity {

    TextView etq_nombres, etq_fecha_inicio, etq_fecha_fin, etq_cant_preguntas, etq_cant_ok, etq_cant_error;
    LinearLayout LinearPrincipal;

    Config config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_ver_detalles);
        this.config = new Config(getApplicationContext());

        etq_nombres = findViewById(R.id.etq_nombres);
        etq_fecha_inicio = findViewById(R.id.etq_fecha_inicio);
        etq_fecha_fin = findViewById(R.id.etq_fecha_fin);
        etq_cant_preguntas = findViewById(R.id.etq_cant_preguntas);
        etq_cant_ok = findViewById(R.id.etq_cant_ok);
        etq_cant_error = findViewById(R.id.etq_cant_error);
        LinearPrincipal = findViewById(R.id.LinearPrincipal);
        imprimirDatosIniciales();
        consumoPostDetallesCuestionario();


    }

    public void imprimirDatosIniciales(){
        Bundle datos = getIntent().getExtras();
        String id_cuestionario = datos.getString("id_cuestionario");
        String nombres = datos.getString("nombres");
        String fecha_inicio = datos.getString("fecha_inicio");
        String fecha_fin = datos.getString("fecha_fin");
        String cant_preguntas = datos.getString("cant_preguntas");
        String cant_ok = datos.getString("cant_ok");
        String cant_error = datos.getString("cant_error");

        etq_nombres.setText(nombres);
        etq_fecha_inicio.setText(fecha_inicio);
        etq_fecha_fin.setText(fecha_fin);
        etq_cant_preguntas.setText(cant_preguntas);
        etq_cant_ok.setText(cant_ok);
        etq_cant_error.setText(cant_error);
    }

    public void consumoPostDetallesCuestionario(){
        Bundle datos = getIntent().getExtras();
        String id_cuestionario = datos.getString("id_cuestionario");
        System.out.println("Este es el id del cuestionario: "+id_cuestionario);


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/verDetallesCuestionario.php?id_cuestionario="+id_cuestionario);

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    extractDetallesGET( jsonObject );
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

                params.put("id_cuestionario", id_cuestionario);

                return params;
            }
        };
        queue.add(solicitud);

    }

    public void extractDetallesGET(JSONObject data){

        try {
            JSONArray array = data.getJSONArray("respuesta");
            for (int i = 0; i < array.length(); i++) {
                JSONObject respuesta = array.getJSONObject(i);
                JSONObject pregunt = respuesta.getJSONObject("pregunta");
                String descripcion = pregunt.getString("descripcion");

                String respuesta_descripcion = pregunt.getString("respuesta");
                String estado = pregunt.getString("estado");


                TextView etq_num_pregunta = new TextView(getApplicationContext());
                etq_num_pregunta.setTextColor(Color.BLACK);
                TextView etq_descripcion = new TextView(getApplicationContext());
                etq_descripcion.setTextColor(Color.BLACK);

                etq_num_pregunta.setText("Pregunta: "+i);
                etq_descripcion.setText(descripcion);

                LinearPrincipal.addView(etq_num_pregunta);
                LinearPrincipal.addView(etq_descripcion);

                //Ciclo para recorrer las opciones respecto a las preguntas. ya que el key opciones es un arreglo
                JSONArray opcion = respuesta.getJSONArray("opciones");
                for (int j = 0; j < opcion.length(); j++) {
                    JSONObject opcionesJson = opcion.getJSONObject(j);
                    String opciones = opcionesJson.getString("descripcion");

                    TextView etq_opciones = new TextView(getApplicationContext());
                    etq_opciones.setTextColor(Color.BLACK);
                    etq_opciones.setText("• "+opciones);

                    //Condicion de comparar si es igual la descripcion de la respuesta a la descripcion de la opcion y el estado es OK que el texto se me ponga en verde si no al reves
                    if (respuesta_descripcion.equalsIgnoreCase(opciones) && estado.equalsIgnoreCase("OK")){
                        etq_opciones.setTextColor(Color.GREEN);
                    }else if (respuesta_descripcion.equalsIgnoreCase(opciones) && estado.equalsIgnoreCase("ERROR")){
                        etq_opciones.setTextColor(Color.RED);
                    }

                    LinearPrincipal.addView(etq_opciones);
                }

                TextView etq_espacio = new TextView(getApplicationContext());
                etq_espacio.setText("\n");
                LinearPrincipal.addView(etq_espacio);

            }

        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnAtras(View vista){
        Intent intencion = new Intent(getApplicationContext(), Resumen.class);
        startActivity(intencion);
        finish();
    }
}