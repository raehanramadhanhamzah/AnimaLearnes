package com.example.animalearnes.source;

import com.example.animalearnes.DataHewan;
import com.example.animalearnes.R;

import java.util.ArrayList;

public class BurungSource {
    public static ArrayList<DataHewan> dataBurung = generateDatasBurung();

    private static ArrayList<DataHewan> generateDatasBurung() {
        ArrayList<DataHewan> dataBurung = new ArrayList<>();
        dataBurung.add(new DataHewan(R.drawable.owl,"Burung Hantu","Burung hantu memiliki tubuh sedang hingga besar dengan kepala besar, mata besar, dan bulu wajah yang mirip cakar. Bulu berwarna coklat atau abu-abu dengan pola yang khas. Mereka memiliki paruh pendek dan kuat serta cakar tajam untuk menangkap mangsa. Kemampuan memutar kepala hingga 270 derajat tanpa memutar tubuh mereka menjadi ciri khas yang menonjol."," Burung hantu bisa ditemui di berbagai habitat, mulai dari hutan, pegunungan, gurun, hingga daerah perkotaan. ","Burung hantu biasanya memangsa hewan kecil seperti tikus, kelinci kecil, burung kecil, dan serangga.","Burung hantu bisa berburu dengan sangat diam berkat bulu-bulu lembut di sayapnya dan pendengaran yang kuat."));
        dataBurung.add(new DataHewan(R.drawable.elang,"Burung Elang","Burung elang adalah burung pemangsa yang besar dengan tubuh kuat, sayap yang lebar, dan cakar yang tajam. Mereka memiliki kepala besar, paruh yang kuat, dan mata tajam yang memungkinkan mereka melihat mangsa dari jarak jauh. Bulu-bulu ekor mereka sering kali panjang dan lancip, memberi mereka stabilitas saat terbang.","Elang biasanya ditemukan di habitat yang beragam seperti hutan terbuka, pegunungan, dan daerah terbuka.","Daging","fakta menarik tentang elang adalah beberapa spesies elang dapat terbang dengan kecepatan yang sangat tinggi, mencapai kecepatan hingga 160 kilometer per jam saat mereka menyergap mangsa "));
        dataBurung.add(new DataHewan(R.drawable.merpati,"Burung Merpati","Merpati adalah burung kecil berwarna abu-abu atau putih dengan bulu halus. Mereka memiliki sayap panjang dan ramping serta paruh kecil untuk mencari makanan. Merpati sering terlihat di lingkungan perkotaan dan pedesaan, terbang dengan lincah dan cepat.","Merpati adalah burung yang sangat beradaptasi, sehingga mereka dapat ditemukan di berbagai habitat, mulai dari perkotaan hingga pedesaan, hutan terbuka, taman, dan sekitar bangunan manusia","Merpati adalah herbivora yang makanannya terutama terdiri dari biji-bijian, seperti biji-bijian dari tanaman seperti gandum, jagung, beras, dan kedelai. ","Merpati memiliki kemampuan mengenali ratusan gambar dan warna, membuat mereka menjadi salah satu burung yang cerdas dan dapat dijinakkan dengan mudah."));
        return dataBurung;
    }
}
