package com.example.callbackmethod

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*
import java.util.zip.Inflater

class DataAdapter(var arrayList: ArrayList<String>, var clickListener: ClickListener) :
    RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return DataViewHolder(view, clickListener)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val data = arrayList[position]
        holder.setData(data)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class DataViewHolder(var view: View, var clickListener: ClickListener) :
        RecyclerView.ViewHolder(view) {
        fun setData(data: String) {
            view.apply {
                textView.text = data
                textView.setOnClickListener {
                    clickListener.onClick(data)
                }
            }
        }
    }
}