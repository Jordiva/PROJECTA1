/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_interficiepersistencia;

/**
 *
 * @author isard
 */
public class GestorBDExceptionTOT extends Exception {
    public GestorBDExceptionTOT(String message) {
        super(message);
    }
    
    public GestorBDExceptionTOT(String message, Throwable cause) {
        super(message, cause);
    }
    
}
