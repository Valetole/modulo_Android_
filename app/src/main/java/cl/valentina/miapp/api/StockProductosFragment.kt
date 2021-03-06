package cl.valentina.miapp.api


import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import cl.valentina.miapp.R
import kotlinx.android.synthetic.main.stock_productos_fragment.*

//Representa la interfaz de usuario, sin ninguna lógica de aplicación. Observa el ViewModel.


class StockProductosFragment : Fragment(), RecyclerViewClickListener {

    private lateinit var  factory: StockProductosViewModelFactory
    private lateinit var viewModel: StockProductosViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.stock_productos_fragment, container, false)

        }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api = StockProductosAPI()
        val repository = StockProductosRepository(api)
        factory = StockProductosViewModelFactory(repository)
        //viewModel = ViewModelProviders.of(this,factory).get(StockProductosViewModel::class.java)
        viewModel = ViewModelProvider(this,factory).get(StockProductosViewModel::class.java)

        if(isNetworkConnected(requireContext())) {
            viewModel.getStockProductos()
        } else {
            Toast.makeText(requireContext(),"SIn internet", Toast.LENGTH_LONG).show()
        }
        //viewModel.getStockProductos()


        viewModel.stocks.observe(viewLifecycleOwner, { stocks ->
            recycler_view_stock_productos.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = StockProductosAdapter(stocks, this)
            }

        })
    }
    fun isNetworkConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }

    override fun onRecyclerItemClick(view: View, stockProductos: StockProductos) {
        when(view.id) {
            R.id.button_book -> {
                Toast.makeText(requireContext(), "producto añadido al carrito", Toast.LENGTH_LONG).show()
            }
        }
    }

}