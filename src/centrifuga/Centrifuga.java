/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrifuga;

import javax.swing.JOptionPane;

/**
 *
 * @author JHG-7
 */
public class Centrifuga extends javax.swing.JFrame {
    public static Lienzo lienzo = new Lienzo("/image/0.png"); 
    public static Datos dat1 = new Datos();
    public static Datos dat2 = new Datos();
    public static Datos dat3 = new Datos();
    public static Datos dat4 = new Datos();
    public static int seg;
    public static double rpm; 
//    private Timer timer = new Timer();
//    public static TimerTask tarea;
    

    /**
     * Creates new form Centrifuga
     */
    public Centrifuga() {
        initComponents();
        myInit();
        
        jLabel1.setText("1. "+dat1.toString());
        jLabel2.setText("2. "+dat2.toString());
        jLabel3.setText("3. "+dat3.toString());
        jLabel4.setText("4. "+dat4.toString());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(608, 728));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Iniciar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 10, 100));

        jButton2.setText("Agregar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel1.setText("1. Vacio");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, -1));

        jLabel3.setText("3. Vacio");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, -1));

        jLabel4.setText("4. Vacio");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, -1));

        jLabel5.setText("RPM:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jLabel6.setText("Tiempo: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 40, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 40, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 110, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 40, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jButton3.setText("E. Ultimo");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel7.setText("Nombre:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel8.setText("Edad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel2.setText("2. Vacio");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 610, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:

//        final TimerTask tarea = new TimerTask(){
//
//            @Override
//            public void run() {
//
//                lienzo.setRotacion(lienzo.getRotacion() -0.3);
//                lienzo.repaint();
//                }
//        };
//        timer.schedule(tarea,10,100);
        try{
            seg = Integer.parseInt(jTextField1.getText());
            rpm = Integer.parseInt(jTextField2.getText());
            rpm /= 8000;
            Prueba pru = new Prueba();
            pru.start();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Solo se admiten segundos y rpm en numeros enteros.");
        }
        
        

 
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code heret:
        int edad = 0;
        
        try{
            edad = Integer.parseInt(jTextField4.getText());
            
            if(dat1.getNombre() == "Vacio"){
                dat1.Agregar(jTextField3.getText(), edad, "M");
                jLabel1.setText("1. "+dat1.toString());
                lienzo.cambImage("/image/1.png");
                lienzo.repaint();

            }else if(dat2.getNombre() == "Vacio"){  
                dat2.Agregar(jTextField3.getText(), edad, "F");  
                jLabel2.setText("2. "+dat2.toString());
                lienzo.cambImage("/image/2.png");
                lienzo.repaint();

            }else if(dat3.getNombre() == "Vacio"){
                dat3.Agregar(jTextField3.getText(), edad, "M");     
                jLabel3.setText("3. "+dat3.toString());
                lienzo.cambImage("/image/3.png");
                lienzo.repaint();

            }else if(dat4.getNombre() == "Vacio"){
                dat4.Agregar(jTextField3.getText(), edad, "Hola");   
                jLabel4.setText("4. "+dat4.toString());
                lienzo.cambImage("/image/4.png");
                lienzo.repaint();
            }else if(dat1.getNombre() != "Vacio" && dat2.getNombre() != "Vacio" && dat3.getNombre() != "Vacio" && dat4.getNombre() != "Vacio"){
                System.out.println("ESTA LLENO");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingresa una edad valida");
        }
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if(Centrifuga.dat4.getNombre() != "Vacio"){            
            dat4.Agregar("Vacio", 0, "Vacio");
            jLabel4.setText("4. Vacio");
        }else if(Centrifuga.dat3.getNombre() != "Vacio"){
            dat3.Agregar("Vacio", 0, "Vacio");
            jLabel3.setText("3. Vacio");
        }else if(Centrifuga.dat2.getNombre() != "Vacio"){
            dat2.Agregar("Vacio", 0, "Vacio");
            jLabel2.setText("2. Vacio");
        }else if(Centrifuga.dat1.getNombre() != "Vacio"){
            dat1.Agregar("Vacio", 0, "Vacio");
            jLabel1.setText("1. Vacio");
        }
    }//GEN-LAST:event_jButton3MouseClicked
    private void myInit(){
        
        //lienzo.setRotacion(lienzo.getRotacion() -0.1);
        lienzo.setOpaque(false);

        getContentPane().add(lienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Centrifuga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Centrifuga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Centrifuga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Centrifuga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Centrifuga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
