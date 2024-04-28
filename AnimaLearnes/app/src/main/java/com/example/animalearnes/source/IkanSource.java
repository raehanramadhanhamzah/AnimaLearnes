package com.example.animalearnes.source;

import com.example.animalearnes.DataHewan;
import com.example.animalearnes.R;

import java.util.ArrayList;

public class IkanSource {
    public static ArrayList<DataHewan> dataIkan = generateDatasReptil();

    private static ArrayList<DataHewan> generateDatasReptil() {
        ArrayList<DataHewan> dataIkan = new ArrayList<>();
        dataIkan.add(new DataHewan(R.drawable.tuna,"Ikan Tuna","Tuna adalah ikan laut pelagik yang termasuk tribus Thunnini.daging tuna berwarna merah muda sampai merah tua, bentuk tubuh yang sedikit banyak mirip dengan torpedo, disebut fusiform, sedikit memipih di sisi-sisinya dan dengan moncong meruncing. Sirip punggung (dorsal) dua berkas, sirip punggung pertama berukuran relatif kecil dan terpisah dari sirip punggung kedua. "," mereka hidup di luar landas kontinen di laut terbuka—bukan di dekat terumbu karang, dasar laut, atau garis pantai. Zona pelagis merupakan habitat terluas di Bumi, dengan volume 330 juta mil kubik..","Daging","Memiliki kecepatan berenang yang sangat kencang dibandingkan ikan lain."));
        dataIkan.add(new DataHewan(R.drawable.pari,"Ikan Pari","Ikan pari atau ikan peh adalah jenis ikan laut yang memiliki 560 spesies dan tergolong dalam 13 famili.Memiliki bentuk yang pipih dan datar serta bertulang rawan.ikan bertulang rawan yang mempunyai ekor seperti cambuk.Sirip dada ikan ini melebar menyerupai sayap, dengan sisi bagian depan bergabung dengan kepala.","Habitat ikan pari ini berada di dasar perairan berlumpur, lumpur berpasir, tanah keras, bahkan yang berbatu atau koral.","karnivora dan biasa memakan plankton","Tidak punya kerangka tulang,Pari memiliki tubuh yang terbuat dari tulang rawan, jenis tulang yang sama yang membentuk hidung dan telinga manusia."));
        dataIkan.add(new DataHewan(R.drawable.hiugoblin,"Ikan Hiu Goblin","Hiu goblin memiliki moncong khas panjang dan datar, menyerupai pisau pedang. Panjang proporsional moncong menurun sesuai dengan usia. Mata kecil dan kurang membran pelindung nictitating; di belakang mata spirakel. Mulut besar, Rahang sangat protrusible dan dapat memanjang hampir ke ujung moncong, meskipun biasanya tertahan di bawah kepala. Ia memiliki 35-53 baris gigi di rahang atas dan 31-62 baris gigi yang ada di rahang bawah.","Hiu goblin telah tertangkap diketiga samudera utama, menunjukkan distribusi global yang luas. Di Samudra Atlantik, telah direkam dari Teluk Meksiko utara, Suriname, Guyana Prancis, dan Brasil selatan dibagian barat, dan Prancis, Portugal, Madeira, dan Senegal dibagian timur. ","Makanan utama hiu goblin adalah ikan dan invertebrata laut kecil.hiu biru dan juga parasit sebagai makanannya"
                ,"Punya moncong panjang dan bentuk ini dan dia juga dengan mudah dibedakan dengan hiu lainnya."));
        return dataIkan;
    }
}
