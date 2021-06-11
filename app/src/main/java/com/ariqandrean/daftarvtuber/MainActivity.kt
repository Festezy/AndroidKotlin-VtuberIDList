package com.ariqandrean.daftarvtuber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}