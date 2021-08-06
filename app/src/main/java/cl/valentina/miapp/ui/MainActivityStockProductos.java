package cl.valentina.miapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;

import java.util.ArrayList;

import cl.valentina.miapp.R;
import cl.valentina.miapp.adapter.RecyclerViewAdapter;
import cl.valentina.miapp.model.StockProductosModel;
import cl.valentina.miapp.viewModel.MainViewModelStockProductos;

public class MainActivityStockProductos extends AppCompatActivity implements LifecycleOwner {

    MainActivityStockProductos context;
    MainViewModelStockProductos viewModelStockProductos;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_stock_productos);
        context = this;
        recyclerView = findViewById(R.id.rv_main);
        viewModelStockProductos = ViewModelProviders.of(context).get(MainViewModelStockProductos.class);
        viewModelStockProductos.getStockProductosMutableLiveData().observe(context, stockProductosListUpdateObserver);

    }

    Observer<ArrayList<StockProductosModel>> stockProductosListUpdateObserver = new Observer<ArrayList<StockProductosModel>>() {
        @Override
        public void onChanged(ArrayList<StockProductosModel> stockProductosModelArrayList) {
            recyclerViewAdapter = new RecyclerViewAdapter(context, stockProductosModelArrayList);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(recyclerViewAdapter);
        }
    };
}



