/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p_interficiepersistencia;

import java.sql.Connection;

/**
 *
 * @author jordi
 */
public interface IGestorBDWiki {
    

    void tancar() throws GestorBDExceptionTOT;
    
    void validarCanvis() throws GestorBDExceptionTOT;

    void desferCanvis() throws GestorBDExceptionTOT;

    Connection getConnection() throws GestorBDExceptionTOT;
}
