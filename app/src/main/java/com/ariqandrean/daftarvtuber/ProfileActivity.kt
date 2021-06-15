package com.ariqandrean.daftarvtuber

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "About"

        val ivGithub = findViewById<ImageView>(R.id.github_profile)
        val ivDicoding = findViewById<ImageView>(R.id.dicoding_profile)

        /**link*/
        val dicodingUrl = "https://www.dicoding.com/users/festezy"
        val githubUrl = "https://github.com/Festezy"

        ivGithub.setOnClickListener {
            gotoUrl(githubUrl)
        }
        ivDicoding.setOnClickListener {
            gotoUrl(dicodingUrl)
        }

    }

    private fun gotoUrl(Url: String?) {
        val uri: Uri = Uri.parse(Url)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}