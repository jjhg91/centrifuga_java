/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centrifuga;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author JHG-7
 */
public class Lienzo extends JPanel {
        private ImageIcon icono = null; /** La foto */
        private double rotacion = 0.1; /** Cuanto queremos que se rote la foto, en radianes. */

        /**
         * Devuelve como tamaño preferido el de la foto
         */
//        @Override
//        public Dimension getPreferredSize() {
//            return new Dimension(icono.getIconWidth(), icono.getIconHeight());
//        }

        /**
         * Carga la foto y la guarda
         * @param ficheroImagen
         */
        public Lienzo(String ficheroImagen){
            //icono = new ImageIcon(ficheroImagen);
            icono = new ImageIcon(getClass().getResource(ficheroImagen));
        }
        public void cambImage(String Image){
            icono = new ImageIcon(getClass().getResource(Image)); 
        }
        /**
         * Dibujo de la foto rotándola
         */
        @Override
        public void paint(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            // AffineTransform realiza el giro, usando como eje de giro el centro de la foto (width/2, height/2)
            // y el ángulo que indica el atributo rotación.
            AffineTransform tx = AffineTransform.getRotateInstance(rotacion, icono.getIconWidth()/2, icono.getIconHeight()/2);
            // dibujado con la AffineTransform de rotación
            g2d.drawImage(icono.getImage(), tx, this);      
        }

        /**
         * Devuelve la rotación actual.
         * @return rotación en radianes
         */
        public double getRotacion(){
            return rotacion;
        }

        /**
         * Se le pasa la rotación deseada.
         * @param rotacion La rotación en radianes
         */
        public void setRotacion(double rotacion){
            this.rotacion = rotacion;
        }

    }
