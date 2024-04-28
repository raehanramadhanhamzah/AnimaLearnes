package com.example.animalearnes.source;

import com.example.animalearnes.DataHewan;
import com.example.animalearnes.R;

import java.util.ArrayList;

public class ReptilSource {
    public static ArrayList<DataHewan> dataReptil = generateDatasReptil();

    private static ArrayList<DataHewan> generateDatasReptil() {
        ArrayList<DataHewan> dataReptil = new ArrayList<>();
        dataReptil.add(new DataHewan(R.drawable.buaya,"Buaya","Buaya adalah reptil bertubuh besar yang hidup di air, Binatang bertubuh besar dengan tekstur kulit kasar dan liat,Hewan buaya adalah reptil yang berkembangbiak dengan cara bertelur. "," Buaya umumnya menghuni habitat perairan tawar seperti sungai, danau, rawa dan lahan basah lainnya. Namun, ada pula yang hidup di air payau seperti buaya muara.","Daging","bahwa ada 23 spesies buaya berbeda yang hidup di planet ini? Namun, Australia adalah rumah bagi hanya dua spesies, yaitu buaya air tawar yang tidak ditemukan di tempat lain di dunia dan juga buaya muara."));
        dataReptil.add(new DataHewan(R.drawable.biawak,"Biawak","Biawak adalah kelompok kadal berukuran menengah dan besar yang tersebar di daerah beriklim panas dan tropis Afrika, Asia, dan Australia.Memiliki 4 kaki dengan kuku-kuku yang tajam pada jari-jarinya.Rata-rata panjang tubuhnya 1 meter; biawak besar bisa memiliki panjang tubuh hingga 3 meter.","Biawak biasanya tinggal tidak jauh dari perairan, biasanya di hutan lembap, padang rumput, dan sekitar hilir sungai. Di daerah perkotaan, biawak kerap ditemukan di gorong-gorong saluran air yang bermuara ke sungai.","Daging","Menurut Animalia, tubuhnya bisa punya berat 50 kilogram dan panjang 2 meter"));
        dataReptil.add(new DataHewan(R.drawable.ular,"Ular","Ular adalah kelompok reptilia tidak berkaki dan bertubuh panjang yang tersebar luas di dunia. segolongan reptilia-reptilia dengan atau tanpa kaki, bertubuh panjang, dan memiliki fisiologis yang sangat berbeda dengan kadal.","Mereka dapat ditemukan di semua tipe habitat: hutan, padang rumput, gurun/padang pasir, sungai, danau, dataran tinggi, perkebunan, persawahan, laut, dan juga di pemukiman manusia. ","Daging"
                ,"Ada sekitar 500 jenis dan 3.000 spesies ular yang berbeda-beda, dan seluruhnya adalah  predator."));
        return dataReptil;
    }
}
