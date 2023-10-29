package tn.esprit.gamerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.gamerapp.databinding.SingleItemBookmarkBinding

class ProfileAdapter (val store: MutableList<StoreData>): RecyclerView.Adapter<ProfileAdapter.BookmarksHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookmarksHolder {
            val binding = SingleItemBookmarkBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return BookmarksHolder(binding)
        }

    override fun onBindViewHolder(holder: BookmarksHolder, position: Int) {
        with(holder){
            with(store[position]){
                binding.eventTitle.text = title
                binding.eventDescription.text=price.toString()
                binding.eventImage.setImageResource(img)
                binding.btnRemoveBookmark.setOnClickListener(){
                    AppDatabase.getDatabase(it.context).storeDao().deteleItem(this)
                    store.removeAt(position)
                    notifyItemRemoved(position)
                }
            }
        }

    }



    override fun getItemCount(): Int {
        return store.size
    }



    inner  class BookmarksHolder(val binding: SingleItemBookmarkBinding) : RecyclerView.ViewHolder(binding.root)
    }
