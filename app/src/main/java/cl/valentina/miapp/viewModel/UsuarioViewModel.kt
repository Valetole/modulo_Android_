package cl.valentina.miapp.viewModel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cl.valentina.miapp.UsuarioObserver
import cl.valentina.miapp.model.UsuarioDatos
import cl.valentina.miapp.model.UsuarioModel

class UsuarioViewModel : ViewModel() {

    var correoelectronico: String? = null
    var clave: String? = null

    var usuarioObserver: UsuarioObserver? = null

    fun iniciarSesion(view: View) {
        usuarioObserver?.inicio()
        if(correoelectronico.isNullOrEmpty() && clave.isNullOrEmpty()) {
            usuarioObserver?.inicioFatal("datos erroneos")
            return
        }
        usuarioObserver?.inicioExitoso()
    }

}

