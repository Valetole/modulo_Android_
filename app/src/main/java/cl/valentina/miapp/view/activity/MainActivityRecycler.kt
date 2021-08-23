package cl.valentina.miapp.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cl.valentina.miapp.viewModel.MainAdapter
import cl.valentina.miapp.R


//RECYCLER SIN VIEWMODEL CON KOTLIN
class MainActivityRecycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recycler)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MainAdapter()


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }
}