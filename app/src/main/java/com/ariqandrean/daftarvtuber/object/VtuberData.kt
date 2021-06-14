package com.ariqandrean.daftarvtuber.`object`

import com.ariqandrean.daftarvtuber.R
import com.ariqandrean.daftarvtuber.model.VtuberModel

object VtuberData {
    private val vtuberNames = arrayOf(
        "Ayunda Risu hololiveID",
        "Airani Iofifteen hololiveID",
        "Moona Hoshinova hololiveID",
    )

    private val vtuberProfil = arrayOf(
        "Seorang gadis tupai yang berasal dari hutan ajaib. Dia pernah tersesat di alam manusia, tapi kemudian diselamatkan oleh seorang wanita baik hati yang sekarang tinggal dengannya. Dia memperlakukan wanita ini sebagai kakak perempuannya. Dia memulai debutnya sebagai VTuber hanya untuk membalasnya",
        "Iofi - Bukan Anak Alien biasa di sini~ Multilingual Vtuber asal luar angkasa dan sedang kuliah jurusan DKV di Bumi",
        "Seorang mahasiswa yang juga seorang model dan idola. Dia menjadi VTuber karena dia tertarik dengan dunia virtual. Dia tampaknya tenang dan berkepala dingin, tetapi hal-hal menakutkan bukanlah secangkir tehnya."
    )
    private val vtuberDetails = arrayOf(
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia(ID) bersama dengan Airani Iofifteen dan Moona Hoshinova.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia (ID) bersama Moona Hoshinova dan Ayunda Risu.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia (ID) bersama Airani Iofifteen  dan Ayunda Risu."
    )
    private val vtuberYoutube = arrayOf(
        "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
        "https://www.youtube.com/channel/UCAoy6rzhSf4ydcYjJw3WoVg",
        "https://www.youtube.com/channel/UCP0BspO_AMEe3aQqqpo89Dg/channels"
    )
    private val vtuberTwitter = arrayOf(
        "https://twitter.com/ayunda_risu",
        "https://twitter.com/airaniiofifteen?s=09",
        "https://twitter.com/moonahoshinova"
    )

    private val vtuberImages = intArrayOf(
        R.drawable.ayundarisu,
        R.drawable.airaniiofifteen,
        R.drawable.moonahoshinova
    )

    val listData: ArrayList<VtuberModel>
        get() {
            val list = arrayListOf<VtuberModel>()
            for (position in vtuberNames.indices){
                val vtuber = VtuberModel()
                vtuber.photo = vtuberImages[position]
                vtuber.name = vtuberNames[position]
                vtuber.profile = vtuberProfil[position]
                vtuber.detail = vtuberDetails[position]
                vtuber.ytUrl = vtuberYoutube[position]
                vtuber.twitUrl = vtuberTwitter[position]
                list.add(vtuber)
            }
            return list
        }
}