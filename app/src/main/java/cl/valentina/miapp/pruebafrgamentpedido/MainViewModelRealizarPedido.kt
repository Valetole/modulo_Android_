package cl.valentina.miapp.pruebafrgamentpedido


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//MainViewModel
// viewModel que actualiza MainFragment (la interfaz de usuario visible)
// obtiene los datos del modelo

class MainViewModelRealizarPedido: ViewModel() {


    // crear el modelo que contiene los datos para la ui
    private val modelRealizarPedido = DataModelRealizarPedido(textoForUI = "texto actual")

    //Crear mutable LiveData a lo que fragment puede suscribirse
    //Cuando los datos cambian, se activa la ui para actualizar

    val uiTextLiveData = MutableLiveData<String>()

    // obtener el valor del modelo y actualizarlo en el fragment

    fun obtenerTexto() {
        val textoActual = modelRealizarPedido.textoForUI
        uiTextLiveData.postValue(textoActual)

    }





}