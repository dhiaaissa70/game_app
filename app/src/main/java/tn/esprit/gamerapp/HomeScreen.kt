package tn.esprit.gamerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.gamerapp.databinding.ActivityHomeScreenBinding

class HomeScreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomeScreenBinding
    private lateinit var newsList: ArrayList<NewsData>
    private lateinit var recyleview:RecyclerView
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityHomeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragrament(NewsFragment())
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.news -> replaceFragrament(NewsFragment())
                R.id.store -> replaceFragrament(StoreFragment())
                R.id.profile -> replaceFragrament(ProfileFragment())
                else -> {
                }
            }
            true

        }

//        recyleview = findViewById(R.id.recycle_news)
//        recyleview.setHasFixedSize(true)
//            recyleview.layoutManager =LinearLayoutManager(this)
//            val newsList = ArrayList<NewsData>()
//
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//        newsList.add(NewsData("fifa24","description fifi",R.drawable.ic_fifa))
//
//
//
//        val newsAdapter = NewsAdapter(newsList)
//
//        recyleview.adapter = newsAdapter



    }

    private fun replaceFragrament(fragment : Fragment){
        val fragmentManager =  supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container,fragment)
        fragmentTransaction.commit()
    }
}