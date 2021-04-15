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
    public static void main(String[] args) {
        Studente io=new Studente("Edoardo", "basile", 7);
        
        try {
            FileOutputStream fo= new FileOutputStream("test.ser");
            ObjectOutputStream os=new ObjectOutputStream(fo);
                os.writeObject("c");
//                os.writeObject("ciao");
//                os.writeObject(0.345);
//                os.writeObject(false);
//                os.writeObject('a');
            os.flush();
            os.close();
            fo.close();
//              FileInputStream fi = new FileInputStream("test.ser");
//              ObjectInputStream is= new ObjectInputStream(fi);
//              int v1 = (int)is.readObject();
//              String v2 = (String)is.readObject();
//              System.out.println("21: "+v2);
              

        } catch (FileNotFoundException ex) {
            System.out.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.out.println("Hai rotto Java");
        }
        
    }
}
