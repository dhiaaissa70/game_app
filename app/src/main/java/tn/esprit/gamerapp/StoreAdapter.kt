package tn.esprit.gamerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import tn.esprit.gamerapp.databinding.ListstoreBinding

class StoreAdapter :RecyclerView.Adapter<StoreViewHolder>() {
    var store = mutableListOf<StoreData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoreViewHolder {
      val binding = ListstoreBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return StoreViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return store.size
    }

    override fun onBindViewHolder(holder: StoreViewHolder, position: Int) {

        with(holder){
            with(store[position]){
                binding.storetitle.text = title
                binding.category.text=category
                binding.price.text=price.toString()
                binding.gamestoreimage.setImageResource(img)
                binding.bookmark.setOnClickListener(){
                    val  database = AppDatabase.getDatabase(it.context)
                    val item = database.storeDao().getItemById(id)
                    if (item == null){
                        database.storeDao().insertItem(this)
                    }
                    else{
                        Snackbar.make(binding.root, "L'évenement existe déjà", Snackbar.LENGTH_LONG).show()
                    }
                }
            }
        }

    }
}