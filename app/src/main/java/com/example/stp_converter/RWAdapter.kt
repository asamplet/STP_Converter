package com.example.stp_converter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RWAdapter(private val names: List<String>) : RecyclerView
					.Adapter<RWAdapter.MyViewHolder>() {

	class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
		val largeTextView: TextView = itemView.findViewById(R.id.textViewLarge)
	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
		val itemView = LayoutInflater.from(parent.context)
			.inflate(R.layout.rwitem, parent, false)
		return MyViewHolder(itemView)
	}

	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		holder.largeTextView.text = names[position]
	}

	override fun getItemCount() = names.size
}