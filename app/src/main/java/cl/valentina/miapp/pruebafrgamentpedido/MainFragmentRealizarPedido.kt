package cl.valentina.miapp.pruebafrgamentpedido

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels


import cl.valentina.miapp.databinding.FragmentMainRealizarPedidoBinding

//MainFragment
// muestra la interfaz de usuario
// escucha viewModel para obtener actualizaciones en la interfaz de usuario


class MainFragmentRealizarPedido : Fragment() {

    //View Binding
    private var _binding: FragmentMainRealizarPedidoBinding? = null
    private val binding get() = _binding!!

    // Crear View Model
    private val viewModel: MainViewModelRealizarPedido by activityViewModels()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainRealizarPedidoBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupClickListeners()
        fragmentObserver()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Configura el botón en nuestro fragmento para llamar al método getUpdatedText en viewModel
    private fun setupClickListeners() {
        binding.fragmentBotonRealizarPedido.setOnClickListener { viewModel.obtenerTexto() }
    }
      // Observer está esperando que viewModel actualice nuestra interfaz de usuario
    private fun fragmentObserver() {
        viewModel.uiTextLiveData.observe(viewLifecycleOwner,
            { textoActual -> binding.fragmentTextView.text = textoActual })
    }


}