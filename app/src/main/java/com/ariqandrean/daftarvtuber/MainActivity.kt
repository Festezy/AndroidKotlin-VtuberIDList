package com.ariqandrean.daftarvtuber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.daftarvtuber.`object`.VtuberData
import com.ariqandrean.daftarvtuber.adapter.vtuberAdapter
import com.ariqandrean.daftarvtuber.model.VtuberModel

class MainActivity : AppCompatActivity() {
    private lateinit var rvVtuber : RecyclerView
    private var list: ArrayList<VtuberModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvVtuber = findViewById(R.id.rv_heroes)
        rvVtuber.setHasFixedSize(true)

        list.addAll(VtuberData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView(){
        rvVtuber.layoutManager = LinearLayoutManager(this)
        val cardViewVtuberAdapter = vtuberAdapter(list, this)
        rvVtuber.adapter = cardViewVtuberAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_actionbar, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.nav_Profile){
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            return true
        } else {
            return false
        }
    }
}