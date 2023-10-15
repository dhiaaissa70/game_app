package tn.esprit.gamerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class StoreAdapter :RecyclerView.Adapter<StoreViewHolder>() {
    var store = mutableListOf<StoreData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
      val itemView =LayoutInflater.from(parent.context).inflate(R.layout.liststore,parent,false)
        return StoreViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return store.size
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {
        val storeItem = store[position]
        holder.GameTitle.text=storeItem.title
        holder.GameCategory.text=storeItem.category
        holder.GamePrice.text=storeItem.price.toString()
        holder.Gameimage.setImageResource(storeItem.img)

    }
}