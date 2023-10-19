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
    

    void tancar() throws GestorBDExceptionTOT;
    
    void validarCanvis() throws GestorBDExceptionTOT;

    void desferCanvis() throws GestorBDExceptionTOT;

    Boolean validarLogn(String email, String password) throws GestorBDExceptionTOT;
    
    List<Ruta> getRutesDelUsuari(String loginUsuari ) throws GestorBDExceptionTOT , ExceptionTOT;

    List<Punts> getPuntsDeLaRutaDelUsuari(int id_Ruta) throws GestorBDExceptionTOT, ExceptionTOT;

    List<Tipus> geTipusllista() throws GestorBDExceptionTOT, ExceptionTOT;

    boolean afagirRuta(Ruta ruta) throws GestorBDExceptionTOT, ExceptionTOT;
    
    boolean afagirPunt(Punts punt) throws GestorBDExceptionTOT, ExceptionTOT;

    boolean modificarRuta(Ruta ruta) throws GestorBDExceptionTOT, ExceptionTOT;

    boolean borraRuta(int idRuta, String usuari) throws GestorBDExceptionTOT, ExceptionTOT;

    boolean borraPunt(int idPunt , int id_tipus , int id_ruta ) throws GestorBDExceptionTOT, ExceptionTOT;

}
