package cl.valentina.miapp.api

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/*Factory  si tengo un ViewModel con múltiples argumentos, entonces necesito usar un Factory que pueda pasar a ViewModelProviders
para usar cuando se requiera
*/
@Suppress("UNCHECKED_CAST")
class StockProductosViewModelFactory (
    private val repository: StockProductosRepository
        ) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return StockProductosViewModel(repository) as T
    }
        }