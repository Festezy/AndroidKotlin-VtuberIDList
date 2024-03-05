package com.ariqandrean.daftarvtuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.daftarvtuber.adapter.VtuberAdapter
import com.ariqandrean.daftarvtuber.databinding.ActivityMainBinding
import com.ariqandrean.daftarvtuber.model.VtuberModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvVtuber : RecyclerView
    private var list: ArrayList<VtuberModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvVtuber = binding.rvHeroes
        rvVtuber.setHasFixedSize(true)

        list.addAll(getListVtuber())
        showRecyclerCardView()
    }

    private fun getListVtuber(): ArrayList<VtuberModel>{
//        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val dataVtuberNames = resources.getStringArray(R.array.data_names)
        val dataProfiles = resources.getStringArray(R.array.data_profil)
        val dataDetails = resources.getStringArray(R.array.data_detail)
        val dataYoutubeUrl  = resources.getStringArray(R.array.data_youtube)
        val dataTwitterUrl  = resources.getStringArray(R.array.data_twitter)
        val listedVtuber =ArrayList<VtuberModel>()

        for (i in dataVtuberNames.indices){
            val vtuber = VtuberModel(dataVtuberNames[i], dataProfiles[i], dataDetails[i], dataPhoto[i],
                dataYoutubeUrl[i], dataTwitterUrl[i])
            listedVtuber.add(vtuber)
        }

        return listedVtuber
    }

    private fun showRecyclerCardView(){
        rvVtuber.layoutManager = LinearLayoutManager(this)
        val listVtuberAdapter = VtuberAdapter(list)
        rvVtuber.adapter = listVtuberAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_actionbar, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        return if (id == R.id.nav_Profile){
            Toast.makeText(this, "Go to About, please wait...", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            true
        } else {
            false
        }
    }
}