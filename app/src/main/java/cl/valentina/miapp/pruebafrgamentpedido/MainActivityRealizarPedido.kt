package cl.valentina.miapp.pruebafrgamentpedido

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import cl.valentina.miapp.R

// Main activity abre nuestro main fragment que tiene la interfaz de usuario

class MainActivityRealizarPedido : AppCompatActivity(R.layout.activity_main_realizar_pedido) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<MainFragmentRealizarPedido>(R.id.fragment_container_view)
            }
        }
    }
}