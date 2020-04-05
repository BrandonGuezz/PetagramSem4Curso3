package com.example.tareapetagramuno;

public class Mascotas {
    private String nombreMascota;
    private String    numLikes;
    private int    fotoMascota;
    private int    imgHuesoAmarillo;
    private int    imgHuesoBlanco;
/*
    public Mascotas(String nombreMascota, int numLikes, int fotoMascota) {
        this.nombreMascota = nombreMascota;
        this.numLikes = numLikes;
        this.fotoMascota = fotoMascota;
    }
*/
    public Mascotas(String nombreMascota, String numLikes, int fotoMascota) {
        this.nombreMascota = nombreMascota;
        this.numLikes = numLikes;
        this.fotoMascota = fotoMascota;
        //this.imgHuesoAmarillo = imgHuesoAmarillo;
        //this.imgHuesoBlanco = imgHuesoBlanco;
    }
/*
    public int getImgHuesoAmarillo() {
        return imgHuesoAmarillo;
    }

    public void setImgHuesoAmarillo(int imgHuesoAmarillo) {
        this.imgHuesoAmarillo = imgHuesoAmarillo;
    }

    public int getImgHuesoBlanco() {
        return imgHuesoBlanco;
    }

    public void setImgHuesoBlanco(int imgHuesoBlanco) {
        this.imgHuesoBlanco = imgHuesoBlanco;
    }
*/
    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(String numLikes) {
        this.numLikes = numLikes;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }
}
