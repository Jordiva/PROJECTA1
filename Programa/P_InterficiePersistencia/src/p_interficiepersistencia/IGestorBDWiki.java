/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p_interficiepersistencia;

import java.sql.Connection;
import java.util.List;

import org.milaifontanals.ExceptionTOT;
import org.milaifontanals.Punts;
import org.milaifontanals.Ruta;
import org.milaifontanals.Tipus;

/**
 *
 * @author jordi
 */
public interface IGestorBDWiki {
    
    
    /**
     * Tanca la connexió amb la base de dades.
     * @throws GestorBDExceptionTOT
     */
    void tancar() throws GestorBDExceptionTOT;
    

    /**
     * Valida els canvis fets a la base de dades.(Commit)
     * @throws GestorBDExceptionTOT
     */
    void validarCanvis() throws GestorBDExceptionTOT;

    /**
     * Desfà els canvis fets a la base de dades.(Rollback)
     * @throws GestorBDExceptionTOT
     */
    void desferCanvis() throws GestorBDExceptionTOT;


    /**
     * Mira el login del usuari i diu si existeix o no.
     * @return True si existeix, false si no.
     * @throws GestorBDExceptionTOT
     */
    Boolean validarLogn(String email, String password) throws GestorBDExceptionTOT;
    
    /**
     * Retorna la llista de rutes del usuari.
     * @throws GestorBDExceptionTOT
     */
    List<Ruta> getRutesDelUsuari(String loginUsuari ) throws GestorBDExceptionTOT , ExceptionTOT;


    /**
     * Retorna la llista de punts de la ruta del usuari.
     * @throws GestorBDExceptionTOT
     */
    List<Punts> getPuntsDeLaRutaDelUsuari(int id_Ruta) throws GestorBDExceptionTOT, ExceptionTOT;

    /**
     * Retorna la llista de tipus total.
     * @throws GestorBDExceptionTOT
     */
    List<Tipus> geTipusllista() throws GestorBDExceptionTOT, ExceptionTOT;


    /**
     * Afegeix una ruta a la base de dades.
     * @throws GestorBDExceptionTOT
     */
    boolean afagirRuta(Ruta ruta) throws GestorBDExceptionTOT, ExceptionTOT;
    
    /**
     * Afegeix un punt a la base de dades.
     * @throws GestorBDExceptionTOT
     */
    boolean afagirPunt(Punts punt) throws GestorBDExceptionTOT, ExceptionTOT;

    /**
     * Modifica una ruta que digui el usuari a la base de dades.
     * @throws GestorBDExceptionTOT
     */
    boolean modificarRuta(Ruta ruta) throws GestorBDExceptionTOT, ExceptionTOT;


    /**
     * Borra una ruta que digui el usuari a la base de dades.
     * @throws GestorBDExceptionTOT
     */

    boolean borraRuta(int idRuta, String usuari) throws GestorBDExceptionTOT, ExceptionTOT;


    /**
     * Borra un punt que digui el usuari a la base de dades.
     * @throws GestorBDExceptionTOT
     */

    boolean borraPunt(int idPunt , int id_ruta ) throws GestorBDExceptionTOT, ExceptionTOT;


    /**
     * Modifica un punt que digui el usuari a la base de dades.
     * @throws GestorBDExceptionTOT
     */
    boolean modificarPunt(Punts punt) throws GestorBDExceptionTOT, ExceptionTOT;
    
}
