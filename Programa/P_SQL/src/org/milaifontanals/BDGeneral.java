package org.milaifontanals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import p_interficiepersistencia.GestorBDExceptionTOT;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import p_interficiepersistencia.IGestorBDWiki;

/**
 *
 * @author isard
 */
final public class BDGeneral implements IGestorBDWiki{

    private static Connection conn;

    private BDGeneral() throws GestorBDExceptionTOT {
        this("Oracle.properties");
    }

    private BDGeneral(String nomFitxerPropietats) throws GestorBDExceptionTOT {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream(nomFitxerPropietats));
            String[] claus = {"url", "user", "password"};
            String[] valors = new String[3];
            for (int i = 0; i < claus.length; i++) {
                valors[i] = props.getProperty(claus[i]);
                if (valors[i] == null || valors[i].isEmpty()) {
                    throw new GestorBDExceptionTOT("L'arxiu " + nomFitxerPropietats + " no troba la clau " + claus[i]);
                }
            }
            conn = DriverManager.getConnection(valors[0], valors[1], valors[2]);
            conn.setAutoCommit(false);
        } catch (IOException ex) {
            throw new GestorBDExceptionTOT("Problemes en recuperar l'arxiu de configuració " + nomFitxerPropietats + "\n" + ex.getMessage());
        } catch (SQLException ex) {
            throw new GestorBDExceptionTOT("No es pot establir la connexió.\n" + ex.getMessage());
        }
    }

    public static Connection getConnection() throws GestorBDExceptionTOT {
        if (conn == null) {
            new BDGeneral();
        }
        return conn;

    }

    public void tancar() throws GestorBDExceptionTOT {
        if (conn != null) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                throw new GestorBDExceptionTOT("Error en fer rollback final.\n" + ex.getMessage());
            }
            try {
                conn.close();
            } catch (SQLException ex) {
                throw new GestorBDExceptionTOT("Error en tancar la connexió.\n" + ex.getMessage());
            }
        }
    }

    public void validarCanvis() throws GestorBDExceptionTOT {
        try {
            conn.commit();
        } catch (SQLException ex) {
            throw new GestorBDExceptionTOT("Error en validar els canvis: " + ex.getMessage());
        }
    }

    public void desferCanvis() throws GestorBDExceptionTOT {
        try {
            conn.rollback();
        } catch (SQLException ex) {
            throw new GestorBDExceptionTOT("Error en desfer els canvis: " + ex.getMessage());
        }
    }

    public Boolean validarLogn(String login, String password) throws GestorBDExceptionTOT {
        
        

    }


    
}