package cl.valentina.miapp.view

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.transition.Slide
import cl.valentina.miapp.MainActivityRecycler
import cl.valentina.miapp.R
import com.google.android.material.navigation.NavigationView
import cl.valentina.miapp.util.toast

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
            R.id.nav_item_uno -> Toast.makeText(this, "Mis pedidos", Toast.LENGTH_SHORT).show()
            R.id.nav_item_dos -> Toast.makeText(this, "Mis direcciones", Toast.LENGTH_SHORT).show()
            //R.id.nav_item_tres -> {
              //  startActivity(Intent(this, MainActivityRecycler::class.java))
           // }
            R.id.nav_item_tres -> Toast.makeText(this,"Stocks",Toast.LENGTH_SHORT).show()
            //R.id.nav_item_tres -> fun verStock(item: MenuItem) {
            //                val intent=Intent(this,)
            //
            //            }
            //R.id.nav_item_tres -> val intent: Intent = Intent(this, MainActivityRecycler::class.java)
            //startActivity(intent)
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
    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
    //        return when (item.itemId) {
    //            R.id.nav_item_tres -> {
    //              startActivity(Intent (this, MainActivityRecycler::class.java))
    //              true
    //        }
    //        else -> super.onOptionsItemSelected(item)
    //    }
    // }
}