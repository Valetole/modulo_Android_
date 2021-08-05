package cl.valentina.miapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation


class two : Fragment(), View.OnClickListener {

    var navC: NavController? = null


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?)
    : View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navC = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.botonPaso2)?.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        navC?.navigate(R.id.action_two_to_tres)
    }

}