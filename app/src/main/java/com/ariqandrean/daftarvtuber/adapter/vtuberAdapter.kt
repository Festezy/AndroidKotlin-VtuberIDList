package com.ariqandrean.daftarvtuber.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.daftarvtuber.DetailActivity
import com.ariqandrean.daftarvtuber.R
import com.ariqandrean.daftarvtuber.model.VtuberModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class vtuberAdapter(val listVtuber: ArrayList<VtuberModel>, val context: Context) : RecyclerView.Adapter<vtuberAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto = itemView.findViewById<ImageView>(R.id.img_item_photo)
        var tvName = itemView.findViewById<TextView>(R.id.tv_item_name)
        var tvProfile = itemView.findViewById<TextView>(R.id.tv_item_profile)
        var tvDetail = itemView.findViewById<TextView>(R.id.tv_item_detail)
        var tvYtUrl = itemView.findViewById<TextView>(R.id.tv_item_ytlink)
        var tvTwitUrl = itemView.findViewById<TextView>(R.id.tv_item_twitterLink)
//        var btnFavorite = itemView.findViewById<Button>(R.id.btn_set_favorite)
//        var btnShare = itemView.findViewById<Button>(R.id.btn_set_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_vtuber, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listVtuber.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val vtuberModel = listVtuber[position]

        /** method for load the images*/
        Glide.with(holder.itemView.context)
            .load(vtuberModel.photo)
            .apply(RequestOptions().override(300, 350))
            .into(holder.imgPhoto)

        holder.tvName.text = vtuberModel.name
        holder.tvProfile.text = vtuberModel.profile
        holder.tvDetail.text = vtuberModel.detail
        holder.tvYtUrl.text = vtuberModel.ytUrl
        holder.tvTwitUrl.text = vtuberModel.twitUrl

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,
                "Kamu memilih " + listVtuber[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()

            val vtubermodel = listVtuber[position]
            val valueImage: Int = vtubermodel.photo
            val valueName : String = vtuberModel.name
            val valueProfile: String = vtuberModel.profile
            val valueDetail: String = vtuberModel.detail
            val valueYtUrl: String = vtuberModel.ytUrl
            val valueTwitUrl: String = vtuberModel.twitUrl

            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("vImage", valueImage)
            intent.putExtra("vName", valueName)
            intent.putExtra("vProfile", valueProfile)
            intent.putExtra("vDetail", valueDetail)
            intent.putExtra("vYtUrl", valueYtUrl)
            intent.putExtra("vTwitUrl", valueTwitUrl)
            context.startActivities(arrayOf(intent))
        }
    }
}