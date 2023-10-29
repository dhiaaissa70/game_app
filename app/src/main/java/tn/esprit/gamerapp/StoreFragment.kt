package tn.esprit.gamerapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import tn.esprit.gamerapp.databinding.FragmentNewsBinding
import tn.esprit.gamerapp.databinding.FragmentStoreBinding


class StoreFragment : Fragment() {
    private lateinit var binding: FragmentStoreBinding
    private var storeList = mutableListOf<StoreData>()
    private lateinit var storeAdapter: StoreAdapter
    private lateinit var layoutManager : RecyclerView.LayoutManager





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreBinding.inflate(inflater,container,false)
        setupStorRecyclerView()
        return binding.root
    }

    private fun setupStorRecyclerView(){
        storeAdapter= StoreAdapter()
        layoutManager = LinearLayoutManager(requireContext())
        binding.recycleStore.layoutManager=layoutManager
        binding.recycleStore.setHasFixedSize(true)
        dataInitialize()
        storeAdapter.store=storeList
        binding.recycleStore.adapter=storeAdapter

    }


    private fun dataInitialize() {
        storeList = mutableListOf(
            StoreData(
                1,
                getString(R.string.title6),
                resources.getStringArray(R.array.category)[0],
                180,
                R.drawable.ic_fifa
            ),
            StoreData(
                2,
                getString(R.string.title4),
                resources.getStringArray(R.array.category)[1],
                190,
                R.drawable.ic_gow
            ),
            StoreData(
                3,
                getString(R.string.title7),
                resources.getStringArray(R.array.category)[2],
                120,
                R.drawable.ic_counter_strike
            ),
            StoreData(
                4,
                getString(R.string.title2),
                resources.getStringArray(R.array.category)[3],
                200,
                R.drawable.ic_zelda
            ),
            StoreData(
                5,
                getString(R.string.title3),
                resources.getStringArray(R.array.category)[0],
                250,
                R.drawable.ic_red_dead
            ),
            StoreData(
                6,
                getString(R.string.title8),
                resources.getStringArray(R.array.category)[2],
                170,
                R.drawable.ic_league
            ),


            )
    }


}