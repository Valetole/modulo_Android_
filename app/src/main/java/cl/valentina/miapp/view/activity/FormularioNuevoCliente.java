package cl.valentina.miapp.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import cl.valentina.miapp.R;

public class FormularioNuevoCliente extends AppCompatActivity {

    EditText rut,nombre,apellidos,telefono,email,clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_nuevo_cliente);

        rut=(EditText)findViewById(R.id.editTextRutNuevoCliente);
        nombre=(EditText) findViewById(R.id.eTNombreNuevoCliente);
        apellidos=(EditText) findViewById(R.id.editTextApellidos);
        telefono=(EditText) findViewById(R.id.editTextTelefono);
        email=(EditText) findViewById(R.id.editTextTextEmailAddress);
        clave=(EditText) findViewById(R.id.editTextTextPassword);

        Button botonGuardaDatos = findViewById(R.id.botonGuardarDatosFormulario);
        botonGuardaDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),PantallaInicioSesion.class);
                if(validaDatos()) {
                    startActivity(intent);
                }
            }
        });
    }
    public boolean validaDatos() {
        boolean respuesta = true;

        String r=rut.getText().toString();
        String n=nombre.getText().toString();
        String a=apellidos.getText().toString();
        String t=telefono.getText().toString();
        String e=email.getText().toString();
        String c=clave.getText().toString();
        if(r.isEmpty()) {
            rut.setError("Ingrese su rut");
            respuesta = false;
        }
        if(n.isEmpty()) {
            nombre.setError("Ingrese su nombre");
            respuesta = false;
        }
        if(a.isEmpty()) {
            apellidos.setError("Ingrese al menos un apellido");
            respuesta=false;
        }
        if(t.isEmpty()) {
            telefono.setError("Ingrese su número celular");
            respuesta=false;
        }
        if(e.isEmpty()) {
            email.setError("Ingrese su correo");
            respuesta=false;
        }
        if(c.isEmpty()) {
            clave.setError("Ingrese contraseña");
            respuesta=false;
        }
        return respuesta;
    }
}