package org.milaifontanals;
import java.sql.Clob;

public class Ruta {

    private int id_Ruta;
    private String usuari;
    private String titol;
    private String descripcio;
    private Clob text;
    private int distancia;
    private int temps;
    private int desnivellPositiu;
    private int desnivellNegatiu;
    private int dificultat;
    private int numPersones;
    private int sumaValoracions;
    private int numPersonesFetRuta;
    private int sumaValoracioSeguretat;
    private int sumaValoracioPaisatge;
    private int valoracioMitjana;

    public Ruta() {
    }

    

    public Ruta(int id_Ruta, String usuari, String titol, String descripcio, Clob text, int distancia, int temps,
            int desnivellPositiu, int desnivellNegatiu, int dificultat, int numPersones, int sumaValoracions,
            int numPersonesFetRuta, int sumaValoracioSeguretat, int sumaValoracioPaisatge, int valoracioMitjana) throws ExceptionTOT {
        setId_Ruta(id_Ruta);
        setUsuari(usuari);
        setTitol(titol);
        setDescripcio(descripcio);
        setText(text);
        setDistancia(distancia);
        setTemps(temps);
        setDesnivellPositiu(desnivellPositiu);
        setDesnivellNegatiu(desnivellNegatiu);
        setDificultat(dificultat);
        setNumPersones(numPersones);
        setSumaValoracions(sumaValoracions);
        setNumPersonesFetRuta(numPersonesFetRuta);
        setSumaValoracioSeguretat(sumaValoracioSeguretat);
        setSumaValoracioPaisatge(sumaValoracioPaisatge);
        setValoracioMitjana(valoracioMitjana);
    }

    



    public Ruta(int id_Ruta, String usuari, String titol, String descripcio, Clob text, int distancia, int temps,
            int desnivellPositiu, int desnivellNegatiu, int dificultat) throws ExceptionTOT {
        setId_Ruta(id_Ruta);
        setUsuari(usuari);
        setTitol(titol);
        setDescripcio(descripcio);
        setText(text);
        setDistancia(distancia);
        setTemps(temps);
        setDesnivellPositiu(desnivellPositiu);
        setDesnivellNegatiu(desnivellNegatiu);
        setDificultat(dificultat);
    }


    

    public Ruta(int id_Ruta, String usuari, String titol, String descripcio, Clob text, int distancia, int temps,
            int desnivellPositiu, int desnivellNegatiu, int dificultat, int numPersones, int sumaValoracions,
            int numPersonesFetRuta, int sumaValoracioSeguretat, int sumaValoracioPaisatge) throws ExceptionTOT {
        setId_Ruta(id_Ruta);
        setUsuari(usuari);
        setTitol(titol);
        setDescripcio(descripcio);
        setText(text);
        setDistancia(distancia);
        setTemps(temps);
        setDesnivellPositiu(desnivellPositiu);
        setDesnivellNegatiu(desnivellNegatiu);
        setDificultat(dificultat);
        setNumPersones(numPersones);
        setSumaValoracions(sumaValoracions);
        setNumPersonesFetRuta(numPersonesFetRuta);
        setSumaValoracioSeguretat(sumaValoracioSeguretat);
        setSumaValoracioPaisatge(sumaValoracioPaisatge);
        
    }



    public Ruta(String usuari, String titol, String descripcio, Clob text, int distancia, int temps,
            int desnivellPositiu, int desnivellNegatiu, int dificultat, int numPersones, int sumaValoracions,
            int numPersonesFetRuta, int sumaValoracioSeguretat, int sumaValoracioPaisatge, int valoracioMitjana) throws ExceptionTOT {
        setUsuari(usuari);
        setTitol(titol);
        setDescripcio(descripcio);
        setText(text);
        setDistancia(distancia);
        setTemps(temps);
        setDesnivellPositiu(desnivellPositiu);
        setDesnivellNegatiu(desnivellNegatiu);
        setDificultat(dificultat);
        setNumPersones(numPersones);
        setSumaValoracions(sumaValoracions);
        setNumPersonesFetRuta(numPersonesFetRuta);
        setSumaValoracioSeguretat(sumaValoracioSeguretat);
        setSumaValoracioPaisatge(sumaValoracioPaisatge);
        setValoracioMitjana(valoracioMitjana);
    }

    



    public Ruta(int id_Ruta, String usuari, String titol, String descripcio, Clob text, int distancia, int temps,
            int desnivellPositiu, int desnivellNegatiu, int dificultat, int valoracioMitjana) throws ExceptionTOT {
        setId_Ruta(id_Ruta);
        setUsuari(usuari);
        setTitol(titol);
        setDescripcio(descripcio);
        setText(text);
        setDistancia(distancia);
        setTemps(temps);
        setDesnivellPositiu(desnivellPositiu);
    }



    public int getId_Ruta() {
        return id_Ruta;
    }

    public void setId_Ruta(int id_Ruta) {
        this.id_Ruta = id_Ruta;
    }

    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String usuari) {
        this.usuari = usuari;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol)throws ExceptionTOT {
        if (titol == null || titol.isEmpty()) {
            throw new ExceptionTOT("El titol no pot ser null o buit");
        }
        this.titol = titol;
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

    public Clob getText() {
        return text;
    }

    public void setText(Clob text)throws ExceptionTOT{
        if (text == null) {
            throw new ExceptionTOT("El text no pot ser null");
        }
        this.text = text;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia)throws ExceptionTOT{
        if (distancia < 0 ) {
            throw new ExceptionTOT("La distancia no pot ser negativa");
        }
        this.distancia = distancia;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps)throws ExceptionTOT{
        if (temps < 0 ) {
            throw new ExceptionTOT("El temps no pot ser negatiu");
        }
        this.temps = temps;
    }

    public int getDesnivellPositiu() {
        return desnivellPositiu;
    }

    public void setDesnivellPositiu(int desnivellPositiu)throws ExceptionTOT{
        if (desnivellPositiu < 0 ) {
            throw new ExceptionTOT("El desnivellPositiu no pot ser negatiu");
        }
        this.desnivellPositiu = desnivellPositiu;
    }

    public int getDesnivellNegatiu() {
        return desnivellNegatiu;
    }

    public void setDesnivellNegatiu(int desnivellNegatiu)throws ExceptionTOT{ 
        if (desnivellNegatiu < 0 ) {
            throw new ExceptionTOT("El desnivellNegatiu no pot ser negatiu");
        }
        this.desnivellNegatiu = desnivellNegatiu;
    }

    public int getDificultat() {
        return dificultat;
    }

    public void setDificultat(int dificultat)throws ExceptionTOT {
        if (dificultat < 1 || dificultat > 5) {
            throw new ExceptionTOT("La dificultat ha de ser entre 1 i 5");
        }
        this.dificultat = dificultat;
    }

    public int getNumPersones() {
        return numPersones;
    }

    public void setNumPersones(int numPersones) {
        this.numPersones = numPersones;
    }

    public int getSumaValoracions() {
        return sumaValoracions;
    }

    public void setSumaValoracions(int sumaValoracions) {
        this.sumaValoracions = sumaValoracions;
    }

    public int getNumPersonesFetRuta() {
        return numPersonesFetRuta;
    }

    public void setNumPersonesFetRuta(int numPersonesFetRuta) {
        this.numPersonesFetRuta = numPersonesFetRuta;
    }

    public int getSumaValoracioSeguretat() {
        return sumaValoracioSeguretat;
    }

    public void setSumaValoracioSeguretat(int sumaValoracioSeguretat) {
        this.sumaValoracioSeguretat = sumaValoracioSeguretat;
    }

    public int getSumaValoracioPaisatge() {
        return sumaValoracioPaisatge;
    }

    public void setSumaValoracioPaisatge(int sumaValoracioPaisatge) {
        this.sumaValoracioPaisatge = sumaValoracioPaisatge;
    }

    public int getValoracioMitjana() {
        return valoracioMitjana;
    }

    public void setValoracioMitjana(int valoracioMitjana) {
        this.valoracioMitjana = valoracioMitjana;
    }

    


}
