package tn.esprit.gamerapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import tn.esprit.gamerapp.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {
    private lateinit var binding: FragmentNewsBinding
    private var newsList = mutableListOf<NewsData>()
    private lateinit var newsAdapter: NewsAdapter
    private lateinit var layoutManager : LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        setupNewsRecyclerView()
        return binding.root
    }

    private fun setupNewsRecyclerView() {
        newsAdapter = NewsAdapter()
        layoutManager = LinearLayoutManager(requireContext())
        binding.recycleNews.layoutManager = layoutManager
        binding.recycleNews.setHasFixedSize(true)
        dataInitialize()
        newsAdapter.news = newsList
        binding.recycleNews.adapter = newsAdapter
    }

    private fun dataInitialize(){
        newsList = mutableListOf(
            NewsData(getString(R.string.title6), getString(R.string.description6), R.drawable.ic_fifa),
            NewsData(getString(R.string.title4), getString(R.string.description4), R.drawable.ic_gow),
            NewsData(getString(R.string.title7), getString(R.string.description7), R.drawable.ic_counter_strike),
            NewsData(getString(R.string.title2), getString(R.string.description2), R.drawable.ic_zelda),
            NewsData(getString(R.string.title3), getString(R.string.description3), R.drawable.ic_red_dead),
            NewsData(getString(R.string.title8), getString(R.string.description8), R.drawable.ic_league)
        )
    }
}