package org.milaifontanals;


import java.sql.Blob;

public class Punts  {



    private int numPunt;
    private int id_ruta;
    private int id_tipus;
    private String nom;
    private String descripcio;
    private Blob foto;
    private float latitud;
    private float longitud;
    private float altitud;


    public Punts() {
    }


    public Punts(int numPunt, int id_ruta, int id_tipus, String nom, String descripcio, float latitud, float longitud,
            float altitud) {
        setNumPunt(numPunt);

    }





    public Punts(int numPunt, int id_ruta, int id_tipus, String nom, String descripcio, Blob foto, float latitud,
            float longitud, float altitud) throws ExceptionTOT {
        setNumPunt(numPunt);
        setId_ruta(id_ruta);
        setId_tipus(id_tipus);
        setNom(nom);
        setDescripcio(descripcio);
        setFoto(foto);
        setLatitud(latitud);
        setLongitud(longitud);
        setAltitud(altitud);
    }

    public Punts(int id_ruta, int id_tipus, String nom, String descripcio, Blob foto, float latitud,
            float longitud, float altitud) throws ExceptionTOT {
        setId_ruta(id_ruta);
        setId_tipus(id_tipus);
        setNom(nom);
        setDescripcio(descripcio);
        setFoto(foto);
        setLatitud(latitud);
        setLongitud(longitud);
        setAltitud(altitud);
    }




    public int getNumPunt() {
        return numPunt;
    }


    public void setNumPunt(int numPunt) {
        this.numPunt = numPunt;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom)throws ExceptionTOT {
        if (nom == null || nom.isEmpty()) {
            throw new ExceptionTOT("El nom no pot ser null o buit");
        }
        this.nom = nom;
    }


    public String getDescripcio() {
        return descripcio;
    }


    public void setDescripcio(String descripcio)throws ExceptionTOT{
        if (descripcio == null || descripcio.isEmpty()) {
            throw new ExceptionTOT("La descripcio no pot ser null o buit");
        }
        this.descripcio = descripcio;
    }


    public Blob getFoto() {
        return foto;
    }


    public void setFoto(Blob foto) {
        this.foto = foto;
    }


    public float getLatitud() {
        return latitud;
    }


    public void setLatitud(float latitud) throws ExceptionTOT{
        if (latitud < -90 || latitud > 90) {
            throw new ExceptionTOT("La latitud no pot ser 0");
        }
        this.latitud = latitud;
    }


    public float getLongitud() {
        return longitud;
    }


    public void setLongitud(float longitud)throws ExceptionTOT {
        if (longitud < -180 || longitud > 180) {
            throw new ExceptionTOT("La longitud no pot ser 0");
        }
        this.longitud = longitud;
    }


    public float getAltitud() {
        return altitud;
    }


    public void setAltitud(float altitud) {
        this.altitud = altitud;
    }


    public int getId_ruta() {
        return id_ruta;
    }


    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }


    public int getId_tipus() {
        return id_tipus;
    }


    public void setId_tipus(int id_tipus) {
        this.id_tipus = id_tipus;
    }
}
