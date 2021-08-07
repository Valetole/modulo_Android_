package cl.valentina.miapp.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cl.valentina.miapp.R;

public class MainActivity extends AppCompatActivity {

    EditText email,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=(EditText)findViewById(R.id.editTextCorreo);
        clave=(EditText)findViewById(R.id.editTextTextPassword);

        Button botonInicioSesion = findViewById(R.id.boton_inicioSesion);
        botonInicioSesion.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), PantallaInicioSesion.class);
                if(validarDatos()) {
                    startActivity(intent);
                }

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
    public boolean validarDatos () {

        boolean respuesta = true;

        String e=email.getText().toString();
        String c=clave.getText().toString();
        if(e.isEmpty()) {
            email.setError("Ingrese un email");
            respuesta = false;
        }
        if(c.isEmpty()) {
            clave.setError("El campo no puede estar vacío");
            respuesta=false;
        }

        return respuesta;
    }
}