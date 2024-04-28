package com.example.animalearnes;

import static com.example.animalearnes.source.ReptilSource.dataReptil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalearnes.adapter.ReptilAdapter;

public class ReptilActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout home,btnMamalia,btnBurung,btnReptil,btnIkan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reptil);
        RecyclerView rv_reptil = findViewById(R.id.rv_reptil);
        ReptilAdapter reptilAdapter = new ReptilAdapter(dataReptil);
        rv_reptil.setHasFixedSize(true);
        rv_reptil.setAdapter(reptilAdapter);
        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        home = findViewById(R.id.home);
        btnMamalia = findViewById(R.id.mamalia);
        btnBurung = findViewById(R.id.burung);
        btnReptil =findViewById(R.id.reptil);
        btnIkan = findViewById(R.id.ikan);
        menu.setOnClickListener(view -> openDrawer(drawerLayout));

        home.setOnClickListener(v -> redirectActivity(this, MainActivity.class));

        btnMamalia.setOnClickListener(v -> redirectActivity(this, MamaliaActivity.class));
        btnBurung.setOnClickListener(v -> redirectActivity(this, BurungActivity.class));
        btnReptil.setOnClickListener(v -> recreate());
        btnIkan.setOnClickListener(v -> redirectActivity(this, IkanActivity.class));



    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public  static void redirectActivity(Activity activity, Class secondActivity){
        Intent intent = new Intent(activity,secondActivity);
        activity.startActivity(intent);
    }
}