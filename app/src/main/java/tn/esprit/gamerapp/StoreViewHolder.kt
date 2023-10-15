package tn.esprit.gamerapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoreViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val GameTitle:TextView = itemView.findViewById(R.id.storetitle)
    val GameCategory:TextView = itemView.findViewById(R.id.category)
    val GamePrice:TextView = itemView.findViewById(R.id.price)
    val Gameimage :ImageView = itemView.findViewById(R.id.gamestoreimage)
}