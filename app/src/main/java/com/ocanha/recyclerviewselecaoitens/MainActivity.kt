package com.ocanha.recyclerviewselecaoitens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ocanha.recyclerviewselecaoitens.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityMainBinding
    private val opcoesAdapter = OpcoesAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        _binding.rvOpcoes.setHasFixedSize(true)
        _binding.rvOpcoes.layoutManager = LinearLayoutManager(this@MainActivity)
        _binding.rvOpcoes.adapter = opcoesAdapter

        opcoesAdapter.setData(getData())

    }

    private fun getData(): MutableList<Opcao> {

        val lista = mutableListOf<Opcao>()

        for (i in 1..100) {
            lista.add(Opcao("$i Comprar café em pó"))
        }

        return lista

    }

}
