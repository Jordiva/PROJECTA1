package Programa.P_SQL.test;

import java.util.List;

import org.milaifontanals.BDGeneral;
import org.milaifontanals.Punts;
import org.milaifontanals.Ruta;
import org.milaifontanals.Tipus;

public class Tests {
        private static BDGeneral bd ;
        private static String LoginUsuari  = "usuario1";
    public static void main(String[] args) {
    
        try {
            System.out.println("Intent de creació de la capa...");
            bd = new BDGeneral("Oracle.properties");
            System.out.println("Capa de persistència creada");
            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Problema en crear capa de persistència:");
            System.out.println(ex.getMessage());
            System.out.println("Avortem programa");
            return;
        }

        try{
            List<Tipus> tipus = bd.geTipusllista();
            System.out.println("Tipus:");
            for(Tipus t : tipus){
                System.out.println(t.getNom());
            }
            System.out.println("");
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Problema en obtenir tipus:");
            System.out.println(ex.getMessage());
            System.out.println("Avortem programa");
            return;
        }
        
        try{
            List<Ruta> Ruta = bd.getRutesDelUsuari(LoginUsuari);
            System.out.println("Rutes:");
            for(Ruta t : Ruta){
                System.out.println(t.getTitol() +" "+t.getUsuari());
            }
             System.out.println("");
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Problema en obtenir tipus:");
            System.out.println(ex.getMessage());
            System.out.println("Avortem programa");
            return;
        }
        
        
//        try{
//            List<Punts> Punts = bd.getPuntsDeLaRutaDelUsuari(1);
//            System.out.println("Punts de la ruta 1:");
//            for(Punts t : Punts){
//                System.out.println(t.getNumPunt() +" "+ t.getNom());
//            }
//             System.out.println("");
//        }catch(Exception ex){
//            ex.printStackTrace();
//            System.out.println("Problema en obtenir tipus:");
//            System.out.println(ex.getMessage());
//            System.out.println("Avortem programa");
//            return;
//        }
    }
}
