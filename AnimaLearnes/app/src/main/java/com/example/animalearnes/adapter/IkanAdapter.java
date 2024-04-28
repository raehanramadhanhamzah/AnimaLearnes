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

public class IkanAdapter extends RecyclerView.Adapter<IkanAdapter.ViewHolder>{
    private final ArrayList<DataHewan> dataIkan;
    ImageView imgHewan;
    TextView namaHewan,descHewan,habitatHewan,makananHewan,funfactHewan;

    public IkanAdapter(ArrayList<DataHewan> dataIkan){
        this.dataIkan = dataIkan;
    }

    @NonNull
    @Override
    public IkanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_deskripsi,parent,false);
        return new IkanAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IkanAdapter.ViewHolder holder, int position) {
        DataHewan data = dataIkan.get(position);
        holder.setData(data);
    }

    @Override
    public int getItemCount() {
        return dataIkan.size();
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
