package cl.valentina.miapp

import android.view.View
import androidx.lifecycle.ViewModel

class InicioSesionViewModel: ViewModel() {

    var correo_rut: String?= null
    var contraseña: String?= null

    fun boton_InicioSesion (view: View) {

        if(correo_rut.isNullOrEmpty() || contraseña.isNullOrEmpty()) {

            return
        }

    }
}