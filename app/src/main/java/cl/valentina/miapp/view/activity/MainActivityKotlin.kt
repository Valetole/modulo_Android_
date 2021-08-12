package cl.valentina.miapp.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import cl.valentina.miapp.databinding.ActivityMainKotlinBinding

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainKotlinBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonInicioSesionKotlin.setOnClickListener {
            val intent = Intent(this, PantallaInicioSesion::class.java)
            startActivity(intent)
        }
        binding.buttonCreaRegistroKotlin.setOnClickListener {
            val intent = Intent(this, PantallaCrearRegistro::class.java)
            startActivity(intent)
        }
        binding.botonInvitadxKotlin.setOnClickListener {
            val intent= Intent(this, PantallaInvitadx::class.java)
            startActivity(intent)
        }
    }
}