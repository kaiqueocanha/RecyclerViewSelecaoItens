package com.ocanha.recyclerviewselecaoitens

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ocanha.recyclerviewselecaoitens.databinding.ResOpcaoBinding

class OpcoesAdapter : RecyclerView.Adapter<OpcoesViewHolder>() {

    private var lista = listOf<Opcao>()

    fun setData(lista: MutableList<Opcao>) {
        this.lista = lista
        notifyItemRangeChanged(0, lista.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OpcoesViewHolder =
        OpcoesViewHolder(
            ResOpcaoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: OpcoesViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size

}