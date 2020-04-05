package com.example.tareapetagramuno;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.mascotaViewHolder>{

    ArrayList<Mascotas> mascotas;

    public  MascotaAdaptador(ArrayList<Mascotas> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public mascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_card_view,viewGroup,false);
        return new mascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(mascotaViewHolder mascotaViewHolder, int position) {
        Mascotas mascota = mascotas.get(position);
        mascotaViewHolder.imgFoto.setImageResource(mascota.getFotoMascota());
       // mascotaViewHolder.imgHuesitoAmarillo.setImageResource(mascota.getImgHuesoAmarillo());
        mascotaViewHolder.txtViewNombreMascota.setText(mascota.getNombreMascota());
        mascotaViewHolder.txtViewLikes.setText(mascota.getNumLikes());
        //mascotaViewHolder.imgHuesitoBlanco.setImageResource(mascota.getImgHuesoBlanco());


    }

    @Override
    public int getItemCount() {//cantidad de elementos que contiene mi lista
        return mascotas.size();
    }

    public static class mascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private ImageView imgHuesitoAmarillo;
        private ImageView imgHuesitoBlanco;
        private TextView  txtViewLikes;
        private TextView  txtViewNombreMascota;

        public mascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto              = (ImageView) itemView.findViewById(R.id.imgFoto);
            imgHuesitoAmarillo   = (ImageView) itemView.findViewById(R.id.imgHuesitoAmarillo);
            imgHuesitoAmarillo   = (ImageView) itemView.findViewById(R.id.imgHuesitoBlanco);
            txtViewLikes         = (TextView)  itemView.findViewById(R.id.txtViewLikes);
            txtViewNombreMascota = (TextView)  itemView.findViewById(R.id.txtViewNombreMascota);
        }
    }
}
