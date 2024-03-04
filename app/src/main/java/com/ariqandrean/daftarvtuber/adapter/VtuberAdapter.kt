package com.ariqandrean.daftarvtuber.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.ariqandrean.daftarvtuber.DetailActivity
import com.ariqandrean.daftarvtuber.databinding.ItemListvtuberBinding
import com.ariqandrean.daftarvtuber.model.VtuberModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class VtuberAdapter(private val listVtuber: ArrayList<VtuberModel>, private val context: Context) : RecyclerView.Adapter<VtuberAdapter.ListViewViewHolder>() {
    class ListViewViewHolder(var binding: ItemListvtuberBinding): RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewViewHolder {
        val binding = ItemListvtuberBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewViewHolder(binding)
    }

    override fun getItemCount(): Int = listVtuber.size

    override fun onBindViewHolder(holder: ListViewViewHolder, position: Int) {
        val (vtuberNames, vtuberProfile, vtuberDetail, vtuberPhoto,
            vtuberYtUrl, vtuberTwitterUrl) = listVtuber[position]

        /** method for load the images*/
        Glide.with(holder.itemView.context)
            .load(vtuberPhoto)
            .apply(RequestOptions().override(300, 350))
            .into(holder.binding.imgItemPhoto)

        holder.binding.tvItemName.text = vtuberNames
        holder.binding.tvItemProfile.text = vtuberProfile
        holder.binding.tvItemDetail.text = vtuberDetail
        holder.binding.tvItemYtlink.text = vtuberYtUrl
        holder.binding.tvItemTwitterLink.text = vtuberTwitterUrl

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih ${listVtuber[holder.bindingAdapterPosition].name}", Toast.LENGTH_SHORT).show()

            Intent(context, DetailActivity::class.java).also {
                it.putExtra(DetailActivity.EXTRA_IMG, vtuberPhoto)
                it.putExtra(DetailActivity.EXTRA_NAME, vtuberNames)
                it.putExtra(DetailActivity.EXTRA_PROFILE, vtuberProfile)
                it.putExtra(DetailActivity.EXTRA_DETAIL, vtuberDetail)
                it.putExtra(DetailActivity.EXTRA_YTURL, vtuberYtUrl)
                it.putExtra(DetailActivity.EXTRA_TWITTERURL, vtuberTwitterUrl)
                context.startActivity(it)
            }

        }
    }
}