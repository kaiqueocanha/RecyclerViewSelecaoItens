package com.ocanha.recyclerviewselecaoitens

import androidx.recyclerview.widget.RecyclerView
import com.ocanha.recyclerviewselecaoitens.databinding.ResOpcaoBinding

class OpcoesViewHolder(private val binding: ResOpcaoBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(opcao: Opcao) {
        binding.cbOpcao.text = opcao.nome
    }

}