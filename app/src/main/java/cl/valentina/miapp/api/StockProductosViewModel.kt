package cl.valentina.miapp.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

class StockProductosViewModel(
    private val repository: StockProductosRepository //le pasamos el repository para manejar los datos
    ) : ViewModel() {

        private lateinit var job: Job

        private val _stocks = MutableLiveData<List<StockProductos>>()
        val stocks: LiveData<List<StockProductos>>
            get() = _stocks


   fun getStockProductos() {
        job = Coroutines.ioThenMain(
            { repository.getStockProductos() },
            { _stocks.value = it }
        )
    }
//Este método se llamará cuando este ViewModel ya no se utilice y se destruirá.
    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}