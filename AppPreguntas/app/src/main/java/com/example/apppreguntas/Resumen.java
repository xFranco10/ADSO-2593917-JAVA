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

public class Resumen extends AppCompatActivity {

    TextView etq_prueba;
    LinearLayout linearEtqCuestionario;
    Config config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        etq_prueba = findViewById(R.id.etq_prueba);
        linearEtqCuestionario = findViewById(R.id.linearEtqCuestionario);
        this.config = new Config(getApplicationContext());
        imprimirSaludo();
        //imprimirCuestionarios();
        consumo();


    }

    public void imprimirSaludo(){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        etq_prueba.setText("");
        etq_prueba.append("Hola:\n");
        etq_prueba.append(archivo.getString("nombres",""));
    }


    public void consumo(){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("APIenPHPpreguntas/getCuestionarios.php");

        StringRequest solicitud = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    extractCuestionariosGET( jsonObject );
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

                params.put("id_usuario", archivo.getString("id_usuario", null));

                return params;
            }
        };
        queue.add(solicitud);

    }

    public void extractCuestionariosGET(JSONObject data){

        try {
            JSONArray array = data.getJSONArray("resumen");
            for (int i = 0; i < array.length(); i++) {
                JSONObject cuestionario = array.getJSONObject(i);
                String id_cuestionario = cuestionario.getString("id");
                String cant_preguntas = cuestionario.getString("cant_preguntas");
                String cant_ok = cuestionario.getString("cant_ok");
                String cant_error = cuestionario.getString("cant_error");
                String fecha_inicio = cuestionario.getString("fecha_inicio");
                String fecha_fin = cuestionario.getString("fecha_fin");

                TextView etq_cuestionarios = new TextView(getApplicationContext());
                etq_cuestionarios.setTextColor(Color.BLACK);
                TextView etq_separador = new TextView(getApplicationContext());

                etq_cuestionarios.setText("Numero Cuestionario: "+id_cuestionario+"\n");
                etq_cuestionarios.append("Fecha Inicio: "+fecha_inicio+"\n");
                etq_cuestionarios.append("Nº Preguntas: "+cant_preguntas+"\n");
                etq_cuestionarios.append("Nº OK: "+cant_ok+"\n");
                etq_cuestionarios.append("Nº Error: "+cant_error);

                // botón de detalles
                Button btn_detalles = new Button(this);
                btn_detalles.setLayoutParams(new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                ));
                btn_detalles.setText("VER DETALLES");

                // Agregar acción al botón
                btn_detalles.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Acciones que deseas realizar cuando se hace clic en el botón
                        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
                        String nombres = archivo.getString("nombres", null);

                        Intent intencion = new Intent(getApplicationContext(), InterfazVerDetalles.class);
                        intencion.putExtra("id_cuestionario", id_cuestionario);
                        intencion.putExtra("nombres", nombres);
                        intencion.putExtra("fecha_inicio", fecha_inicio);
                        intencion.putExtra("fecha_fin", fecha_fin);
                        intencion.putExtra("cant_preguntas", cant_preguntas);
                        intencion.putExtra("cant_ok", cant_ok);
                        intencion.putExtra("cant_error", cant_error);
                        startActivity(intencion);
                        finish();

                    }
                });

                etq_separador.setText("\n");

                linearEtqCuestionario.addView(etq_cuestionarios);
                linearEtqCuestionario.addView(btn_detalles);
                linearEtqCuestionario.addView(etq_separador);

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }



    public void btnNuevoCuestionario(View vista){
        //Abrir archivo de persistencia y almacenar datos de usuario
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.putString("nombres", archivo.getString("nombres", ""));
        editor.putString("id_usuario", archivo.getString("id_usuario", ""));
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), InterfazIniciarCuestionario.class);
        startActivity(intencion);
        finish();

    }
    public void btnCerrarSesion(View vista){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);
        finish();
    }
}