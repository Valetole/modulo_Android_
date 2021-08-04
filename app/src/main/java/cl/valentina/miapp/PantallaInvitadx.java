package cl.valentina.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaInvitadx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_invitadx);

        Button botonStockProductos = findViewById(R.id.botonStockProductos);
        botonStockProductos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(v.getContext(), MainActivityRecycler.class);
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
    }
}