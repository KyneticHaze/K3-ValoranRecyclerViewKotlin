package com.furkanharmanci.kotlinrecyclerview.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.furkanharmanci.kotlinrecyclerview.DetailsActivity
import com.furkanharmanci.kotlinrecyclerview.databinding.AdapterBinding
import com.furkanharmanci.kotlinrecyclerview.model.Valorant
import com.furkanharmanci.kotlinrecyclerview.model.ValorantSingleton

class AgentAdapter(private val agentList : ArrayList<Valorant>) : RecyclerView.Adapter<AgentAdapter.AgentHolder>() {

    class AgentHolder(val binding: AdapterBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgentHolder {
        val binding = AdapterBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AgentHolder(binding)
    }
    override fun onBindViewHolder(holder: AgentHolder, position: Int) {
        holder.binding.recyclerItem.text = agentList[position].agentName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            ValorantSingleton.once = agentList[position]
            holder.itemView.context.startActivity(intent)
        }

    }
    override fun getItemCount(): Int {
            return agentList.size
    }
}