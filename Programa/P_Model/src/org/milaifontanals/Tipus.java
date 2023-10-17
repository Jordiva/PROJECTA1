package org.milaifontanals;


import java.sql.Blob;

public class Tipus {
    

    private int id;
    private String nom;
    private Blob foto;


    public Tipus() {
    }

    public Tipus(int id, String nom, Blob foto) throws ExceptionTOT {
        setId(id);
        setNom(nom);
        setFoto(foto);
    }
    

    public Tipus(int id, String nom) throws ExceptionTOT {
        setId(id);
        setNom(nom);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom)throws ExceptionTOT {
        if (nom == null || nom.trim().length() == 0) {
            throw new ExceptionTOT("El nom del tipus no pot ser null");
        }
        this.nom = nom;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    
}
