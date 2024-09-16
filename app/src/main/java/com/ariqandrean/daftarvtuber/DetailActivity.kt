package com.ariqandrean.daftarvtuber

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.ariqandrean.daftarvtuber.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
//        const val EXTRA_PROFILE = "extra_profile"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_YTURL = "extra_ytUrl"
        const val EXTRA_TWITTERURL = "extra_twitterUrl"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val vImage = intent.getStringExtra(EXTRA_IMG)
        val vName = intent.getStringExtra(EXTRA_NAME)
        val vProfile = intent.getStringExtra(EXTRA_DETAIL)
        val vDetail = intent.getStringExtra(EXTRA_DETAIL)
        val ytUrl = intent.getStringExtra(EXTRA_YTURL)
        val twitUrl = intent.getStringExtra(EXTRA_TWITTERURL)

        supportActionBar?.title = vName

        with(binding) {
            Glide.with(this@DetailActivity).load(vImage).into(imgItemPhotoDetail)
            tvNameDetail.text = vName
            tvProfileDetail.text = vProfile
            tvDetailDetail.text = vDetail

            iVYoutube.setOnClickListener {
                gotoUrl(ytUrl)
            }

            iVTwitter.setOnClickListener {
                gotoUrl(twitUrl)
            }
        }
    }

    private fun gotoUrl(url: String?) {
        val uri: Uri = Uri.parse(url)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.topBarShare){
            val vName = intent.getStringExtra(EXTRA_NAME)
            val vProfile = intent.getStringExtra(EXTRA_DETAIL)
            val ytUrl = intent.getStringExtra(EXTRA_YTURL)
            val twitUrl = intent.getStringExtra(EXTRA_TWITTERURL)
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, """
                    $vName, $vProfile Kunjungi Channel $vName di Youtube $ytUrl atau media sosial $twitUrl 
                """.trimIndent())
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, vName)
            startActivity(shareIntent)
            true
        } else {
            false
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}