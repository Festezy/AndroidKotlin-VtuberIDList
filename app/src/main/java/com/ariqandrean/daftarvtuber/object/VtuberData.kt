package com.ariqandrean.daftarvtuber.`object`

import com.ariqandrean.daftarvtuber.R
import com.ariqandrean.daftarvtuber.model.VtuberModel

object VtuberData {
    private val vtuberNames = arrayOf(
        "Ayunda Risu hololiveID",
        "Airani Iofifteen hololiveID",
        "Moona Hoshinova hololiveID",
        "Kureiji Ollie hololiveID",
        "Pavolia Reine hololiveID",
        "Anya Melfissa hololiveID",
        "Andi Adinata MAHA5",
        "Alia Adelia MAHA5",
        "Lumi Celestia MAHA5",
        "Nia Redalion MAHA5",
        "Zen Gunawan MAHA5"
    )

    private val vtuberProfil = arrayOf(
        "Seorang gadis tupai yang berasal dari hutan ajaib. Dia pernah tersesat di alam manusia, tapi kemudian diselamatkan oleh seorang wanita baik hati yang sekarang tinggal dengannya. Dia memperlakukan wanita ini sebagai kakak perempuannya. Dia memulai debutnya sebagai VTuber hanya untuk membalasnya",
        "Iofi - Bukan Anak Alien biasa di sini~ Multilingual Vtuber asal luar angkasa dan sedang kuliah jurusan DKV di Bumi",
        "Seorang mahasiswa yang juga seorang model dan idola. Dia menjadi VTuber karena dia tertarik dengan dunia virtual. Dia tampaknya tenang dan berkepala dingin, tetapi hal-hal menakutkan bukanlah secangkir tehnya.",
        "Ollie sangat hiperaktif dan itu mempengaruhi terhadap debutnya yang agak memprihatinkan. Setelah menghabiskan satu menit untuk mempersiapkan diri untuk tampil di layar, ketika akhirnya dia melakukannya, dia mulai meraung keras dan panik. Sesuai dengan statusnya sebagai zombie, kadang-kadang anggota badan Ollie terlepas dari tubuhnya; lengannya jatuh setidaknya dua kali dalam lima menit pertama debutnya.\n" +
                "\n" +
                "Dia tampaknya sangat sadar akan internet dan budaya meme, karena dia sering menggunakan bahasa gaul internet pada stream debutnya, seperti \"dope\", \"dank\" dan \"pog\", memahami arti dan penggunaannya. Dia juga penggemar berat meme dan berharap penggemarnya membuat meme darinya.\n" +
                "\n" +
                "Dia juga cenderung secara acak menggoda gadis-gadis hololive lainnya.",
        "Sang putri merak yang tertiup angin. Saat belajar di akademi sihir, dia terlibat dalam sebuah insiden dan dipindahkan ke dunia manusia. Sejak itu, dia tidak dapat menggunakan banyak sihirnya.\n" +
                "\n" +
                "Meski tampak anggun dan tenang, dia bisa menjadi sangat emosional saat marah.",
        "Anya merupakan pribadi yang sangat tenang. Dia agak berbeda dengan Ollie, dia tampak sedikit berbicara dan lebih sering bergumam karena dia sering merasa gugup di saat live stream. Dibanding rekan-rekannya seperti Ollie dan Reine, Anya kurang bergaul dengan para senpainya.",
        "Dia suka menyanyi dan pernah menang dalam kontes menyanyi di tingkat kecamatan.\n" +
                "Selain hobi menyanyi, ia juga suka menggambar.\n" +
                "Dia mengaku bukan seorang introver.",
        "Dia berbicara bahasa Indonesia, Inggris dan Jepang.\n" +
                "Dia adalah orang Indonesia asli, tapi dia mampu menggunakan aksen Jepang yang baik ketika berbicara bahasa itu.",
        "Lumi merupakan orang yang agak pemalu dan tidak pandai berbicara dihadapan banyak orang. Dia sangat mudah gugup. Meski begitu, dia tidak begitu membosankan dan mempunyai selera humor yang cukup bagus.",
        "Makanan favoritnya adalah Soto, Bakso dan Sate serta makanan tradisional Indonesia lainnya.\n" +
                "Mimpinya sangat sederhana dan tidak terlalu tinggi, yaitu hanya untuk menghibur pemirsanya.",
        "Zen adalah orang yang humoris, Walau dengan segala kekurangannya, ia mencoba melakukan yang terbaik untuk menghibur penontonnya. Zen dikenal sebagai orang yang sangat ceria dan memiliki lagu cover yang bagus."
    )
    private val vtuberDetails = arrayOf(
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia(ID) bersama dengan Airani Iofifteen dan Moona Hoshinova.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia (ID) bersama Moona Hoshinova dan Ayunda Risu.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi pertama cabang Indonesia (ID) bersama Airani Iofifteen  dan Ayunda Risu.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi kedua cabang Indonesia (ID) bersama Anya Melfissa dan Pavolia Reine.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi kedua cabang Indonesia (ID) bersama Anya Melfissa dan Kureiju Ollie.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan hololive, sebagai bagian dari VTuber generasi kedua cabang Indonesia (ID) bersama Pavolia Reine dan Kureiju Ollie.",
        "adalah Virtual YouTuber laki-laki yang terkait dengan MAHAPANCA, sebagai bagian dari Vtuber generasi pertama cabang Indonesia (ID) bersama Alia Adelia.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan MAHAPANCA, sebagai bagian dari Vtuber generasi pertama cabang Indonesia (ID) bersama Andi Adinata.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan MAHAPANCA, sebagai bagian dari Vtuber generasi kedua cabang Indonesia (ID) bersama Zen Gunawan dan Nia Redalion.",
        "adalah Virtual YouTuber perempuan Indonesia yang terkait dengan MAHAPANCA, sebagai bagian dari Vtuber generasi kedua cabang Indonesia (ID) bersama Zen Gunawan dan Lumi Celestia.",
        "adalah Virtual YouTuber laki-laki Indonesia yang terkait dengan MAHAPANCA, sebagai bagian dari Vtuber generasi kedua cabang Indonesia (ID) bersama Nia Redalion dan Lumi Celestia."
    )
    private val vtuberYoutube = arrayOf(
        "https://www.youtube.com/channel/UCOyYb1c43VlX9rc_lT6NKQw",
        "https://www.youtube.com/channel/UCAoy6rzhSf4ydcYjJw3WoVg",
        "https://www.youtube.com/channel/UCP0BspO_AMEe3aQqqpo89Dg/channels",
        "https://www.youtube.com/channel/UCYz_5n-uDuChHtLo7My1HnQ/videos",
        "https://www.youtube.com/channel/UChgTyjG-pdNvxxhdsXfHQ5Q/about",
        "https://www.youtube.com/channel/UC727SQYUvx5pDDGQpTICNWg/channels",
        "https://www.youtube.com/channel/UC9QnAjC7mT4ggHuedr1_kqQ",
        "https://www.youtube.com/channel/UCK4t1P3Aqqe6NDyRS92Opcg",
        "https://www.youtube.com/channel/UCge_6FJHyeOCxRtWCmaVTAQ",
        "https://www.youtube.com/channel/UCD2W-dcuukl4oChTKATdSiw/featured",
        "https://www.youtube.com/c/ZenGunawanCh/featured"
    )
    private val vtuberTwitter = arrayOf(
        "https://twitter.com/ayunda_risu",
        "https://twitter.com/airaniiofifteen?s=09",
        "https://twitter.com/moonahoshinova",
        "https://twitter.com/kureijiollie",
        "https://twitter.com/pavoliareine",
        "https://twitter.com/anyamelfissa",
        "https://twitter.com/andiadinata_id",
        "https://twitter.com/aliaadelia_v",
        "https://twitter.com/LumiCelestia",
        "https://twitter.com/NiaRedalion",
        "https://twitter.com/ZenGunawan"
    )

    private val vtuberImages = intArrayOf(
        R.drawable.ayundarisu,
        R.drawable.airaniiofifteen,
        R.drawable.moonahoshinova,
        R.drawable.kurejiollie,
        R.drawable.pavoliareine,
        R.drawable.anyamelfissa,
        R.drawable.andiadinata,
        R.drawable.aliaadelia,
        R.drawable.lumicelestia,
        R.drawable.niaredalion,
        R.drawable.zengunawann
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