package com.example.home13.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.home13.databinding.ItemRvBinding
import com.example.home13.models.User
import com.squareup.picasso.Picasso

class UserAdapter(val list: List<User>): RecyclerView.Adapter<UserAdapter.Vh>() {
    inner class Vh(val itemRvBinding: ItemRvBinding): RecyclerView.ViewHolder(itemRvBinding.root){
        fun onBind(user: User){
            Picasso.get().load(user.imageLink).into(itemRvBinding.imageView3)

            Picasso.get().load(user.imageLink).into(itemRvBinding.image2)

            Picasso.get().load(user.imageLink).into(itemRvBinding.image1)
    }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}