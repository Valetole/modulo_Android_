package cl.valentina.miapp.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.valentina.miapp.R;
import cl.valentina.miapp.prueba2fragmentpedido.MainActivityRealizarPedidoPrueba2;

import cl.valentina.miapp.api.MainActivityApi;

//CAMBIAR A VIEWBINDING Y KOTLIN

public class PantallaInvitadx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_invitadx);

        Button botonStockProductos = findViewById(R.id.botonStockProductos);
        botonStockProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), MainActivityApi.class);//CAMBIE A RECYCLER API
                startActivity(intent);
            }
        });
        Button botonCrearRegistro = findViewById(R.id.botonCrearRegistroInvitadx);
        botonCrearRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), PantallaCrearRegistro.class);
                startActivity(intent);
            }
        });
        Button botonRealizaPedido = findViewById(R.id.botonRealizaPedido);
        botonRealizaPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), MainActivityRealizarPedidoPrueba2.class);
                startActivity(intent);
            }
        });
    }
}