package tn.esprit.gamerapp

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsViewHolder (itemView: View) :RecyclerView.ViewHolder(itemView) {
    val newsTitle:TextView = itemView.findViewById(R.id.newsTitle)
    val newsDescription:TextView = itemView.findViewById(R.id.newsDescription)
    val newsImg :ImageView = itemView.findViewById(R.id.newsImage)

}