package com.example.animalearnes.source;

import com.example.animalearnes.DataHewan;
import com.example.animalearnes.R;

import java.util.ArrayList;

public class MamaliaSource {
    public static ArrayList<DataHewan> dataMamalia = generateDatasMamalia();

    private static ArrayList<DataHewan> generateDatasMamalia() {
        ArrayList<DataHewan> dataMamalia = new ArrayList<>();
        dataMamalia.add(new DataHewan(R.drawable.sapi,"Sapi","Sapi adalah mamalia besar dengan tubuh berat, kaki pendek, dan tanduk di kepala. Mereka memiliki bulu pendek atau panjang tergantung pada rasnya, dengan warna yang bervariasi dari coklat hingga hitam. Sapi memiliki mulut yang cukup lebar dan gigi yang cocok untuk mengunyah rumput dan dedaunan."," Mereka umumnya ditemukan di padang rumput, sabana, dan daerah bersemak di seluruh dunia.","Rumput","Ada lebih dari 1 miliar sapi di dunia, membuat mereka salah satu mamalia terbanyak di planet ini setelah manusia."));
        dataMamalia.add(new DataHewan(R.drawable.kucing,"Kucing","Kucing adalah mamalia kecil dengan tubuh lentur, kaki yang gesit, dan cakar tajam. Mereka memiliki kepala berbentuk segitiga, telinga yang tegak, dan mata yang seringkali berwarna cerah. Bulu kucing bisa beragam, mulai dari pendek hingga panjang, dengan berbagai pola dan warna yang menarik.","kucing sering ditemukan di lingkungan yang beragam, mulai dari hutan, savana, dan padang rumput hingga perkotaan dan pedesaan","Daging","Kucing memiliki kemampuan yang luar biasa untuk melompat, dan mereka dapat melompat hingga enam kali panjang tubuh mereka dalam satu lompatan!"));
        dataMamalia.add(new DataHewan(R.drawable.kambing,"Kambing","Kambing adalah mamalia berukuran sedang dengan bulu kasar, tanduk melengkung, dan kaki pendek. Mereka memiliki jenggot di leher dan telinga berdiri tegak, serta mata horizontal yang memberikan pandangan luas.","Kambing adalah hewan yang sangat fleksibel dan dapat ditemukan di berbagai habitat di seluruh dunia, mulai dari daerah pegunungan, padang rumput, hingga gurun.","\n" +
                "Kambing adalah hewan herbivora yang biasanya memakan berbagai jenis tumbuhan, termasuk rumput, semak, daun, dan dahan.","Kambing memiliki pupil mata berbentuk horizontal yang unik, memungkinkan mereka memiliki pandangan luas dan lebih waspada terhadap predator."));
        return dataMamalia;
    }
}
