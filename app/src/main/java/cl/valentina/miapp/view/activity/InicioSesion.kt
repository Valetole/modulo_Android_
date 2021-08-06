package cl.valentina.miapp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.valentina.miapp.R
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import cl.valentina.miapp.viewModel.UsuarioObserver
import cl.valentina.miapp.databinding.ActivityInicioSesionBinding
import cl.valentina.miapp.util.toast
import cl.valentina.miapp.viewModel.UsuarioViewModel

class InicioSesion : AppCompatActivity(), UsuarioObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityInicioSesionBinding= DataBindingUtil.setContentView(this, R.layout.activity_inicio_sesion)
        val viewModel = ViewModelProviders.of(this,).get(UsuarioViewModel::class.java)

        binding.viewmodel = viewModel
        viewModel.usuarioObserver= this

    }

    override fun inicio() {
        toast("Iniciando Sesión")

    }

    override fun inicioExitoso() {
        toast("Inicio exitoso")

    }

    override fun inicioFatal(mensaje: String) {
        toast(mensaje)

    }
}