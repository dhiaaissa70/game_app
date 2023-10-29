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
    private lateinit var storeAdapter: ProfileAdapter
    private lateinit var layoutManager : RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)
        val itemsList = AppDatabase.getDatabase(requireContext()).storeDao().getALLitems()
        val profileAdapter = ProfileAdapter(itemsList)
        binding.recyleBookmarks.adapter = profileAdapter
        binding.recyleBookmarks.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        return binding.root
    }


}