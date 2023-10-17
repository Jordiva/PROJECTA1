package org.milaifontanals;

import java.sql.Blob;

public class Usuari {
    
    private String login;
    private String email;
    private String password;
    private String nom;
    private String cognom;
    private Blob fotoPerfil;
    

    public Usuari() {
    }

    public Usuari(String login, String email, String password, String nom, String cognom, Blob fotoPerfil) throws ExceptionTOT {
        setLogin(login);
        setEmail(email);
        setPassword(password);
        setNom(nom);
        setCognom(cognom);
        setFotoPerfil(fotoPerfil);
    }

    public Usuari(String login, String email, String password, String nom, String cognom) throws ExceptionTOT {
        setLogin(login);
        setEmail(email);
        setPassword(password);
        setNom(nom);
        setCognom(cognom);
    }

    public String getLogin() {
        return login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getCognom() {
        return cognom;
    }


    public void setCognom(String cognom) {
        this.cognom = cognom;
    }


    public Blob getFotoPerfil() {
        return fotoPerfil;
    }


    public void setFotoPerfil(Blob fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
    
    

    
}
