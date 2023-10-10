package org.milaifontanals;


import java.sql.Blob;

public class Tipus {
    

    private int Id;
    private String Nom;
    private Blob Foto;


    public Tipus() {
    }

    
    public Tipus(int id, String nom) {
        Id = id;
        Nom = nom;
    }

    public Tipus(int id, String nom, Blob foto) {
        Id = id;
        Nom = nom;
        Foto = foto;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public Blob getFoto() {
        return Foto;
    }

    public void setFoto(Blob foto) {
        Foto = foto;
    }
}
