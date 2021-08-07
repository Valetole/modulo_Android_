package cl.valentina.miapp.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import cl.valentina.miapp.R


class tres : Fragment(), View.OnClickListener {

    var nav: NavController? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.buttonPaso3)?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        nav?.navigate(R.id.action_tres_to_cuatro)
    }


}