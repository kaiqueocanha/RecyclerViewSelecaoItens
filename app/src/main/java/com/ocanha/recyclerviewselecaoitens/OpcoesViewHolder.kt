package com.ocanha.recyclerviewselecaoitens

import android.graphics.Color
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.ocanha.recyclerviewselecaoitens.databinding.ResOpcaoBinding

class OpcoesViewHolder(val binding: ResOpcaoBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(opcao: Opcao, marcado: Boolean) {

        binding.cbOpcao.apply {
            text = opcao.nome
            isChecked = marcado
        }

    }

}