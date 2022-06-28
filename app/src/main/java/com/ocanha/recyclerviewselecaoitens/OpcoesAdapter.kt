package com.ocanha.recyclerviewselecaoitens

import android.util.SparseBooleanArray
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ocanha.recyclerviewselecaoitens.databinding.ResOpcaoBinding

class OpcoesAdapter : RecyclerView.Adapter<OpcoesViewHolder>() {

    private var lista = listOf<Opcao>()
    private val checkboxStateArray = SparseBooleanArray()

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

        holder.bind(lista[position], checkboxStateArray[holder.adapterPosition, false])

        holder.binding.cbOpcao.setOnCheckedChangeListener { _, state ->

            checkboxStateArray.put(holder.adapterPosition, state)

        }
    }

    override fun getItemCount(): Int = lista.size

}