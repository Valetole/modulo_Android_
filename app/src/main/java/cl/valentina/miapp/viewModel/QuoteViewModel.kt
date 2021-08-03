package cl.valentina.miapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cl.valentina.miapp.model.QuoteModel
import cl.valentina.miapp.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    
    val quoteModel=MutableLiveData<QuoteModel>()
    
    fun randomQuote() {
        val currentQuote: QuoteModel=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}