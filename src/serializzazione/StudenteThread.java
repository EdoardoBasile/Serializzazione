/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author basile.edoardo
 */
public class StudenteThread implements Runnable{

    @Override
    public void run() {
        while(true){
            String[] s={"Edoardo", "Luca", "Daniele", "Matteo", "Paolo"};
            String []h={"Rossi", "Bianchi", "Verdi", "Viola", "Basile"};
            int z=(int)(Math.random()*4);
            int x=(int)(Math.random()*4);
            int y= (int)(Math.random()*30);
            Studente st= new Studente(y, s[z], h[x]);
            System.out.println(st.toString());
            st.stop();
        }
    }
    
    public void stop(){
        .sleep(1000);
    }
    
    
    
    
}
