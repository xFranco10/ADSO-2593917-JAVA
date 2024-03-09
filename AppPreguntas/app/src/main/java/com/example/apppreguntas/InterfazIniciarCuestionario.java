package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class InterfazIniciarCuestionario extends AppCompatActivity {

    TextView etq_usuario, etq_fecha_inicio;
    String id_usuario, nombres, fecha_inicio;
    Config config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaz_iniciar_cuestionario);
        this.config = new Config(getApplicationContext());

        etq_usuario = findViewById(R.id.etq_usuario);
        etq_fecha_inicio = findViewById(R.id.etq_fecha_inicio);
        imprimirDatosIniciales();
    }

    public void imprimirDatosIniciales(){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        etq_usuario.setText(archivo.getString("nombres",""));
        FormatoFechayHora();

        this.id_usuario = archivo.getString("id_usuario","");
        this.nombres = archivo.getString("nombres", "");
        this.fecha_inicio = etq_fecha_inicio.getText().toString();
    }

    public void FormatoFechayHora(){
        // Obtener la fecha y hora actual
        Date fechaHoraActual = new Date();

        // Formatear la fecha
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String fechaFormateada = formatoFecha.format(fechaHoraActual);

        // Formatear la hora
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String horaFormateada = formatoHora.format(fechaHoraActual);

        // Combinar la fecha y la hora formateadas en un solo texto
        String fechaYHora = fechaFormateada + "\n" + horaFormateada;

        // Establecer el texto en el TextView
        etq_fecha_inicio.setText(fechaYHora);
    }

    public void btnEmpezarCuestionario(View vista){


        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/insertNuevoCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    extractDates( jsonObject );
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
                //ERROR
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<>();

                params.put("id_usuario", id_usuario);
                params.put("fecha_inicio", fecha_inicio);


                return params;
            }
        };

        queue.add(solicitud);
    }



    public void extractDates(JSONObject data) throws JSONException {
        JSONObject id_cuestionario = data.getJSONObject("id_cuestionario");
        int id = id_cuestionario.getInt("id");
        System.out.println("Este es el id del cuestionario: "+String.valueOf(id));

        //Abrir archivo de persistencia y almacenar datos de usuario
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.putString("id_usuario", id_usuario);
        editor.putString("nombres", nombres);
        editor.putString("fecha_inicio", fecha_inicio);
        editor.putString("id", String.valueOf(id));
        editor.commit();


        Intent intencion = new Intent(getApplicationContext(), InterfazCrearCuestionario.class);
        startActivity(intencion);
        finish();



    }


}