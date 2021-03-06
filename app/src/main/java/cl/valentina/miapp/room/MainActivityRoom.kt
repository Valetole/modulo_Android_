package cl.valentina.miapp.room

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import cl.valentina.miapp.R
import cl.valentina.miapp.room.adapter.RecyclerViewAdapter
import cl.valentina.miapp.room.viewmodel.MainActivityViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main_room.*


@AndroidEntryPoint
class MainActivityRoom : AppCompatActivity() {


    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_room)

        //throw RuntimeException("Crashlytics test")

        initViewModel()
        initMainViewModel()
    }

    private fun initViewModel() {
        recyclerViewRoom.apply {
            layoutManager = LinearLayoutManager(this@MainActivityRoom)


            val decoration = DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL)
            addItemDecoration(decoration)
            recyclerViewAdapter = RecyclerViewAdapter(this@MainActivityRoom)
            adapter = recyclerViewAdapter
        }

    }

    private fun initMainViewModel() {
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        viewModel.getStockProductos().observe(this, Observer<List<StockProductosEntity>>{
            recyclerViewAdapter.setListData(it)
            recyclerViewAdapter.notifyDataSetChanged()

        })

       /* if(isConnected(this)){
           viewModel.makeApiCall()
        } else {
            Toast.makeText(this,"SIn internet", Toast.LENGTH_LONG).show()
        }*/

        viewModel.makeApiCall()
    }
    /*fun isConnected(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork = cm.activeNetworkInfo
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting
    }*/
}