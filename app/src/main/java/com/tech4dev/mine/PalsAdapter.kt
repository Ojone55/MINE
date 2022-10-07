package com.tech4dev.mine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.tech4dev.mine.model.Pals

class PalsAdapter (val context: Context):
    RecyclerView.Adapter<PalsAdapter.MyViewHolder>() {
    val sampler=SampleData()
    val pallies =sampler.listofpals


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context) .inflate(R.layout.list_of_pals,parent,false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val people=pallies[position]
        holder.image.setImageResource(people.drawableResource)
        holder.name.text=people.name
        holder.address.text=people.address
        holder.number.text=people.number



    }

    override fun getItemCount(): Int {
        return pallies.size


    }
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val image: ImageView =itemView.findViewById(R.id.palsimage)
        val name: TextView =itemView.findViewById(R.id.palsname)
        val address:TextView=itemView.findViewById(R.id.address)
        val number:TextView= itemView. findViewById (R.id.phonenumber)



    }


}
