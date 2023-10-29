package tn.esprit.gamerapp

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.gamerapp.databinding.ListstoreBinding

class StoreViewHolder(val binding: ListstoreBinding):RecyclerView.ViewHolder(binding.root) {
    val GameTitle:TextView = binding.storetitle
    val GameCategory:TextView = binding.category
    val GamePrice:TextView = binding.price
    val Gameimage :ImageView = binding.gamestoreimage


}