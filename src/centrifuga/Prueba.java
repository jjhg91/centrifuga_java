/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrifuga;

import static centrifuga.Centrifuga.lienzo;
import static centrifuga.Centrifuga.rpm;
import static centrifuga.Centrifuga.seg;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author JHG-7
 */
public class Prueba extends Thread {
    private Timer timer = new Timer();
    public static TimerTask tarea;
    private int resp ;
    
    @Override
    public void run(){
        final TimerTask tarea = new TimerTask(){

            @Override
            public void run() {

                lienzo.setRotacion(lienzo.getRotacion() + rpm);
                lienzo.repaint();
                }
        };
        System.out.println(""+seg);
        timer.schedule(tarea,10,15);
        try {
            Thread.sleep(seg *1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
        tarea.cancel();
        resp = JOptionPane.showConfirmDialog(lienzo, "Ah Finalizado, se a separado El Plasma Sanguineo y El Suero Sanguinero?");
        if(resp == 0){
            resultado();
        }
    }
    
    
    private void resultado(){
        String re1 = "1. "+Centrifuga.dat1.getNombre()+" Tiene como resultado: "+"Hemoglobina 13.8 ";
        String re2 = "2. "+Centrifuga.dat2.getNombre()+" Tiene como resultado: "+"Hemoglobina 19.2";
        String re3 = "3. "+Centrifuga.dat3.getNombre()+" Tiene como resultado: "+"Hemoglobina 10.2";
        String re4 = "4. "+Centrifuga.dat4.getNombre()+" Tiene como resultado: "+"Hemoglobina 15.1";
        if(Centrifuga.dat4.getNombre() != "Vacio"){
            JOptionPane.showMessageDialog(lienzo, re1+"\n"+re2+"\n"+re3+"\n"+re4+"\n");            
            
        }else if(Centrifuga.dat3.getNombre() != "Vacio"){
            JOptionPane.showMessageDialog(lienzo, re1+"\n"+re2+"\n"+re3+"\n");
        }else if(Centrifuga.dat2.getNombre() != "Vacio"){
            JOptionPane.showMessageDialog(lienzo, re1+"\n"+re2+"\n");
        }else if(Centrifuga.dat1.getNombre() != "Vacio"){
            JOptionPane.showMessageDialog(lienzo, re1+"\n");
        }
        
    
        
    }
}
