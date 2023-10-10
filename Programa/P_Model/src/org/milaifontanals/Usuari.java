package org.milaifontanals;

import java.sql.Blob;

public class Usuari {
    
    private String Login;
    private String Email;
    private String Password;
    private String Nom;
    private String Cognom;
    private Blob FotoPerfil;
    

    public Usuari() {
    }
    
    public Usuari(String login, String email, String password, String nom, String cognom) {
        Login = login;
        Email = email;
        Password = password;
        Nom = nom;
        Cognom = cognom;
    }


    public Usuari(String login, String email, String password, String nom, String cognom, Blob fotoPerfil) {
        Login = login;
        Email = email;
        Password = password;
        Nom = nom;
        Cognom = cognom;
        FotoPerfil = fotoPerfil;
    }

    public String getLogin() {
        return Login;
    }
    public void setLogin(String login) {
        Login = login;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getCognom() {
        return Cognom;
    }
    public void setCognom(String cognom) {
        Cognom = cognom;
    }
    public Blob getFotoPerfil() {
        return FotoPerfil;
    }
    public void setFotoPerfil(Blob fotoPerfil) {
        FotoPerfil = fotoPerfil;
    }

    
}
