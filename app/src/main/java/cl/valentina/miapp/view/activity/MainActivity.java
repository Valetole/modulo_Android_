package cl.valentina.miapp.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cl.valentina.miapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonInicioSesion = findViewById(R.id.boton_inicioSesion);
        botonInicioSesion.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PantallaInicioSesion.class);
                startActivity(intent);
            }
        });
        Button botonCrearRegistro = findViewById(R.id.boton_CrearRegistro);
        botonCrearRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PantallaCrearRegistro.class);
                startActivity(intent);
            }
        });
        Button botonInvitadx = findViewById(R.id.boton_Invitadx);
        botonInvitadx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), PantallaInvitadx.class);
                startActivity(intent);
            }
        });



    }
}