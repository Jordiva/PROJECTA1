package org.milaifontanals;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */;

/**
 *
 * @author isard
 */
public class ExceptionTOT extends Exception {
    public ExceptionTOT(String message) {
        super(message);
    }
    
    public ExceptionTOT(String message, Throwable cause) {
        super(message, cause);
    }
    
}
