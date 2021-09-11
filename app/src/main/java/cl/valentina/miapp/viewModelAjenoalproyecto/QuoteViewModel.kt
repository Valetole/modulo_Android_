package cl.valentina.miapp.viewModelAjenoalproyecto

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cl.valentina.miapp.modelAjenoAlproyectoPracticas.QuoteModel
import cl.valentina.miapp.modelAjenoAlproyectoPracticas.QuoteProvider

class QuoteViewModel: ViewModel() {
    
    val quoteModel=MutableLiveData<QuoteModel>()
    
    fun randomQuote() {
        val currentQuote: QuoteModel=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}