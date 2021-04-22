/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basile.edoardo
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        StudenteThread o= new StudenteThread();
        Thread t1= new Thread(o);
        t1.start();
        
//        Studente[] lista= new Studente[3];
//        for(int i=0; i<3;i++){
//            lista[i]=new Studente (i, "Edoardo", "basile");
//        }
//        
//        try {
//            FileOutputStream fo= new FileOutputStream("test.ser");
//            ObjectOutputStream os=new ObjectOutputStream(fo);
//                os.writeObject(lista);
////                os.writeObject("ciao");
////                os.writeObject((float)0.345);
////                os.writeObject(false);
////                os.writeObject('a');
//            os.flush();
//            os.close();
//            fo.close();
//            
//              FileInputStream fi = new FileInputStream("test.ser");
//              ObjectInputStream is= new ObjectInputStream(fi);
//              Studente[] v1 = (Studente[])is.readObject();
//              for(Studente s: lista){
//                  System.out.println("v1: "+s.toString());
//              }
//              
////              
////              String v2 = (String)is.readObject();
////              System.out.println("v2: "+v2);
////              Float v3 = (Float) is.readObject();
////              System.out.println("v3: "+v3);
//              
//        } catch (FileNotFoundException ex) {
//            System.out.println("Impossibile trovare il file");
//        } catch (IOException ex) {
//            System.out.println("Hai rotto Java");
//            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
    }
}
