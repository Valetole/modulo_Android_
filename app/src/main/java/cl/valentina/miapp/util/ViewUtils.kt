package cl.valentina.miapp.util

import android.content.Context
import android.widget.Toast

fun Context.toast(mensaje:String) {
    Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()

} //R.id.nav_item_tres -> {
//  startActivity(Intent(this, MainActivityRecycler::class.java))
// }

//R.id.nav_item_tres -> fun verStock(item: MenuItem) {
//                val intent=Intent(this,)
//
//            }
//R.id.nav_item_tres -> val intent: Intent = Intent(this, MainActivityRecycler::class.java)
//startActivity(intent)


//override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            R.id.nav_item_tres -> {
//              startActivity(Intent (this, MainActivityRecycler::class.java))
//              true
//        }
//        else -> super.onOptionsItemSelected(item)
//    }
// }


