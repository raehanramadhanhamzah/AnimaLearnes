package com.example.animalearnes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalearnes.DataHewan;
import com.example.animalearnes.R;

import java.util.ArrayList;

public class BurungAdapter extends RecyclerView.Adapter<BurungAdapter.ViewHolder>{
    private final ArrayList<DataHewan> dataBurung;
    ImageView imgHewan;
    TextView namaHewan,descHewan,habitatHewan,makananHewan,funfactHewan;

    public BurungAdapter(ArrayList<DataHewan> dataBurung){
        this.dataBurung = dataBurung;
    }

    @NonNull
    @Override
    public BurungAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_deskripsi,parent,false);
        return new BurungAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BurungAdapter.ViewHolder holder, int position) {
        DataHewan data = dataBurung.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return dataBurung.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgHewan = itemView.findViewById(R.id.imgHewan);
            namaHewan = itemView.findViewById(R.id.namaHewan);
            descHewan = itemView.findViewById(R.id.descHewan);
            habitatHewan = itemView.findViewById(R.id.habitatHewan);
            makananHewan = itemView.findViewById(R.id.makananHewan);
            funfactHewan = itemView.findViewById(R.id.funfactHewan);
        }
        public void setData(DataHewan dataHewan){
            imgHewan.setImageResource(dataHewan.getImgHewan());
            namaHewan.setText(dataHewan.getNamaHewan());
            descHewan.setText(dataHewan.getDescHewan());
            habitatHewan.setText(dataHewan.getHabitatHewan());
            makananHewan.setText(dataHewan.getMakananHewan());
            funfactHewan.setText(dataHewan.getFunfactHewan());
        }
    }
}
