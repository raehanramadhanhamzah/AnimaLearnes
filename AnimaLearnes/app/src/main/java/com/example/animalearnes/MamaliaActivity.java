package com.example.animalearnes;

import static com.example.animalearnes.source.MamaliaSource.dataMamalia;

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

import com.example.animalearnes.adapter.MamaliaAdapter;

import java.util.ArrayList;

public class MamaliaActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout home,btnMamalia,btnBurung,btnReptil,btnIkan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mamalia);
        RecyclerView rv_mamalia = findViewById(R.id.rv_mamalia);
        MamaliaAdapter mamaliaAdapter = new MamaliaAdapter(dataMamalia);
        rv_mamalia.setHasFixedSize(true);
        rv_mamalia.setAdapter(mamaliaAdapter);
        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        home = findViewById(R.id.home);
        btnMamalia = findViewById(R.id.mamalia);
        btnBurung = findViewById(R.id.burung);
        btnReptil =findViewById(R.id.reptil);
        btnIkan = findViewById(R.id.ikan);
        menu.setOnClickListener(view -> openDrawer(drawerLayout));

        home.setOnClickListener(v -> redirectActivity(this, MainActivity.class));

        btnMamalia.setOnClickListener(v -> recreate());
        btnBurung.setOnClickListener(v -> redirectActivity(this, BurungActivity.class));
        btnReptil.setOnClickListener(v -> redirectActivity(this, ReptilActivity.class));
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