package tn.esprit.gamerapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val news: ArrayList<NewsData>) : RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listnews, parent, false)
        return NewsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val newsItem = news[position]
        holder.newsTitle.text = newsItem.title
        holder.newsDescription.text = newsItem.description
        holder.newsImg.setImageResource(newsItem.img)
    }
}
