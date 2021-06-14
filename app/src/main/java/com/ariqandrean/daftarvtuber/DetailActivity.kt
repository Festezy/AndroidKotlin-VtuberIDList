package com.ariqandrean.daftarvtuber

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.ariqandrean.daftarvtuber.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val detailImage = findViewById<ImageView>(R.id.img_item_photo_detail)
        val detailName = findViewById<TextView>(R.id.tv_name_detail)
        val detailProfile = findViewById<TextView>(R.id.tv_profile_detail)
        val detailDetail = findViewById<TextView>(R.id.tv_detail_detail)
        val detailYtUrl = findViewById<ImageView>(R.id.iV_youtube)
        val detailTwitterUrl = findViewById<ImageView>(R.id.iV_twitter)

        val intent = intent
        val vImage = intent.getIntExtra("vImage", 0)
        val vName = intent.getStringExtra("vName")
        val vProfile = intent.getStringExtra("vProfile")
        val vDetail = intent.getStringExtra("vDetail")
        val ytUrl = intent.getStringExtra("vYtUrl")
        val twitUrl = intent.getStringExtra("vTwitUrl")

        supportActionBar?.title = vName
        detailImage.setImageResource(vImage)
        detailName.text = vName
        detailProfile.text = vProfile
        detailDetail.text = vDetail

        detailYtUrl.setOnClickListener {
            if (ytUrl == ""){
                Toast.makeText(this, "$vName is not available", Toast.LENGTH_LONG).show()
            } else {
                gotoUrl(ytUrl)
            }
        }

        detailTwitterUrl.setOnClickListener {
            if (twitUrl == ""){
                Toast.makeText(this, "$vName is not available", Toast.LENGTH_LONG).show()
            } else {
                gotoUrl(twitUrl)
            }
        }
    }

    private fun gotoUrl(vUrl: String?) {
        var uri: Uri = Uri.parse(vUrl)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}