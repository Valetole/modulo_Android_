package cl.valentina.miapp.room.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import cl.valentina.miapp.room.StockProductosEntity
import cl.valentina.miapp.room.network.RetroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val repository: RetroRepository
): ViewModel() {

    fun getStockProductos(): LiveData<List<StockProductosEntity>> {
        return repository.getStock()
    }

    fun makeApiCall() {
        repository.callApi()
    }
}


//fun makeApiCall(context: Context) {
//        try {
//            repository.callApi()
//        } catch (e: Exception) {
//            Toast.makeText(context, "Sin internet", Toast.LENGTH_LONG).show()
//        }
//
//    }