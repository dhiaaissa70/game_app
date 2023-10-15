package tn.esprit.gamerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.gamerapp.databinding.FragmentProfileBinding
import tn.esprit.gamerapp.databinding.FragmentStoreBinding


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private var storeList = mutableListOf<StoreData>()
    private lateinit var storeAdapter: StoreAdapter
    private lateinit var layoutManager : RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        setupStorRecyclerView()
        return binding.root
    }

    private fun setupStorRecyclerView(){
        storeAdapter= StoreAdapter()
        layoutManager = LinearLayoutManager(requireContext())
        binding.recyleBookmarks.layoutManager=layoutManager
        binding.recyleBookmarks.setHasFixedSize(true)
        dataInitialize()
        storeAdapter.store=storeList
        binding.recyleBookmarks.adapter=storeAdapter

    }

    private fun dataInitialize() {
        storeList = mutableListOf(
            StoreData(
                getString(R.string.title6),
                resources.getStringArray(R.array.category)[0],
                180,
                R.drawable.ic_fifa
            ),
            StoreData(
                getString(R.string.title4),
                resources.getStringArray(R.array.category)[1],
                190,
                R.drawable.ic_gow
            ),
            StoreData(
                getString(R.string.title7),
                resources.getStringArray(R.array.category)[2],
                120,
                R.drawable.ic_counter_strike
            ),
            StoreData(
                getString(R.string.title2),
                resources.getStringArray(R.array.category)[3],
                200,
                R.drawable.ic_zelda
            ),
            StoreData(
                getString(R.string.title3),
                resources.getStringArray(R.array.category)[0],
                250,
                R.drawable.ic_red_dead
            ),
            StoreData(
                getString(R.string.title8),
                resources.getStringArray(R.array.category)[2],
                170,
                R.drawable.ic_league
            ),


            )
    }
}