package cl.valentina.miapp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.valentina.miapp.R
import android.content.Intent
import android.widget.Button
import cl.valentina.miapp.api.MainActivityApi
import cl.valentina.miapp.databinding.ActivityPantallaInvitadxBinding
import cl.valentina.miapp.view.activity.PantallaCrearRegistro
import cl.valentina.miapp.prueba2fragmentpedido.MainActivityRealizarPedidoPrueba2

//Se cambió a Kotlin falta viewBindging
class PantallaInvitadx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaInvitadxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonStockProductos.setOnClickListener {
            val intent = Intent(this, MainActivityApi::class.java)
            startActivity(intent)
        }
        /*setContentView(R.layout.activity_pantalla_invitadx)
        val botonStockProductos = findViewById<Button>(R.id.botonStockProductos)
        botonStockProductos.setOnClickListener { v ->
            val intent = Intent(v.context, MainActivityApi::class.java) //CAMBIE A RECYCLER API
            startActivity(intent)
        }*/
        binding.botonCrearRegistroInvitadx.setOnClickListener {
            val intent = Intent(this, PantallaCrearRegistro::class.java)
            startActivity(intent)
        }
        /*val botonCrearRegistro = findViewById<Button>(R.id.botonCrearRegistroInvitadx)
        botonCrearRegistro.setOnClickListener { v ->
            val intent = Intent(v.context, PantallaCrearRegistro::class.java)
            startActivity(intent)
        }*/
        binding.botonRealizaPedido.setOnClickListener {
            val intent = Intent(this, MainActivityRealizarPedidoPrueba2::class.java)
            startActivity(intent)
        }
    }
}

        /*
        val botonRealizaPedido = findViewById<Button>(R.id.botonRealizaPedido)
        botonRealizaPedido.setOnClickListener { v ->
            val intent = Intent(v.context, MainActivityRealizarPedidoPrueba2::class.java)
            startActivity(intent)
        }
    }*/

/*
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
 */