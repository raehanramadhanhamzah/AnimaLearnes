package com.example.animalearnes;

import static com.example.animalearnes.source.BurungSource.dataBurung;
import static com.example.animalearnes.source.MamaliaSource.dataMamalia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

import com.example.animalearnes.adapter.BurungAdapter;
import com.example.animalearnes.adapter.MamaliaAdapter;

public class BurungActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout home,btnMamalia,btnBurung,btnReptil,btnIkan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_burung);
        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        home = findViewById(R.id.home);
        btnMamalia = findViewById(R.id.mamalia);
        btnBurung = findViewById(R.id.burung);
        btnReptil =findViewById(R.id.reptil);
        btnIkan = findViewById(R.id.ikan);

        menu.setOnClickListener(v -> openDrawer(drawerLayout));

        home.setOnClickListener(v -> redirectActivity(this, MainActivity.class));

        btnMamalia.setOnClickListener(v -> redirectActivity(this, MamaliaActivity.class));
        btnBurung.setOnClickListener(v -> recreate());
        btnReptil.setOnClickListener(v -> redirectActivity(this, ReptilActivity.class));
        btnIkan.setOnClickListener(v -> redirectActivity(this, IkanActivity.class));

        RecyclerView rv_burung = findViewById(R.id.rv_burung);
        BurungAdapter burungAdapter = new BurungAdapter(dataBurung);
        rv_burung.setHasFixedSize(true);
        rv_burung.setAdapter(burungAdapter);


    }
    public static void openDrawer(DrawerLayout drawerLayout){
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public  static void redirectActivity(Activity activity, Class secondActivity){
        Intent intent = new Intent(activity,secondActivity);
        activity.startActivity(intent);
    }
}