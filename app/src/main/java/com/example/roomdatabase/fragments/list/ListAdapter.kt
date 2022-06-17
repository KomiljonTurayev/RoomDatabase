package com.example.roomdatabase.fragments.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.data.User
import com.example.roomdatabase.databinding.CustomRowBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()

    class MyViewHolder(private val itemViewBinding: CustomRowBinding) : RecyclerView.ViewHolder(itemViewBinding.root) {
        fun bind(currentItem: User) {
            itemViewBinding.idTxt.text =  currentItem.id.toString()
            itemViewBinding.firstNameTxt.text = currentItem.firstName
            itemViewBinding.lastNameTxt.text =  currentItem.lastName
            itemViewBinding.ageTxt.text = currentItem.age.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemBinding =
            CustomRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentItem = userList[position]
        holder.bind(currentItem)

    }

    fun setData(user: List<User>) {
        this.userList = user
        notifyDataSetChanged()
    }
}



























