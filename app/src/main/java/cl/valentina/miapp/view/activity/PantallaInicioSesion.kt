package cl.valentina.miapp.view.activity

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

import cl.valentina.miapp.R
import cl.valentina.miapp.api.MainActivityApi
import cl.valentina.miapp.prueba2fragmentpedido.MainActivityRealizarPedidoPrueba2
import cl.valentina.miapp.room.MainActivityRoom
import com.google.android.material.navigation.NavigationView

//PANTALLA DE USUARIO REGISTRADO NAVIGATION DRAWER

class PantallaInicioSesion : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio_sesion)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_principal)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer_layout)

        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.nav_item_uno -> startActivity(Intent (this, MainActivityApi::class.java))// MainActivityRecycler::class.java Toast.makeText(this, "Mis pedidos", Toast.LENGTH_SHORT).show()
            R.id.nav_item_dos -> Toast.makeText(this, "Mis direcciones", Toast.LENGTH_SHORT).show()
            R.id.nav_item_tres -> startActivity(Intent(this, MainActivityRealizarPedidoPrueba2::class.java))//Toast.makeText(this, "Otros", Toast.LENGTH_SHORT).show()
            R.id.nav_item_misFavoritos -> startActivity(Intent(this,MainActivityRoom::class.java))
            //Mis pedidos historial
            R.id.nav_item_cinco -> startActivity(Intent(this, MainActivityKotlin::class.java))
        }

        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
