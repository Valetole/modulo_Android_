package cl.valentina.miapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import cl.valentina.miapp.R;

public class PantallaCrearRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_crear_registro);

        ImageButton botonCrearCliente = findViewById(R.id.botonCrearCliente);
        botonCrearCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), FormularioNuevoCliente.class);
                startActivity(intent);
            }
        });
        ImageButton botonCrearVendedor = findViewById(R.id.botonCrearVendedor);
        botonCrearVendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), FormularioNuevoCliente.class);
                startActivity(intent);
            }
        });
    }
}