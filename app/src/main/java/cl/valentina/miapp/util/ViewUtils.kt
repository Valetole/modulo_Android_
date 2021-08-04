package cl.valentina.miapp.util

import android.content.Context
import android.widget.Toast

fun Context.toast(mensaje:String) {
    Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

}

