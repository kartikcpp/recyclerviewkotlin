package com.example.affirmations.models

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R

class ItemAdapter(private val context: Context, private val affirmationlist:List<Affirmation>):
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textview:TextView=view.findViewById(R.id.item_title)
        val imageView:ImageView=view.findViewById(R.id.item_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterlayout=LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterlayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item=affirmationlist[position]
        holder.textview.text=context.resources.getText(item.stringResourceId)
        holder.imageView.setImageResource(item.ImageResourceId)
    }

    override fun getItemCount(): Int=affirmationlist.size
}