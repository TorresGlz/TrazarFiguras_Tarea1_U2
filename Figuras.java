/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_Sesion1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Aldair
 */
public class Figuras extends JPanel {

    private JFrame ventana;
    // contenedor
    private Container contenedor;

    public Figuras() {
// inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);

        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }

    //Dibuja las figuras
    @Override
    public void paint(Graphics t) {
        super.paint(t);
        //Figura rectangulo principal
        t.setColor(Color.black);
        t.drawRoundRect(80, 80, 640, 380, 20, 20);

        //Cuadrados
        ///cuadrado superior izquierdo
        t.drawRect(90, 90, 200, 165);

        ///Cuadrado inferior izquierdo
        t.drawRect(90, 270, 200, 165);

        ///Cuadrado superior mitad
        t.drawRect(300, 90, 200, 165);

        ///Cuadrado inferior mitad
        t.drawRect(300, 270, 200, 165);

        ///Cuadrado superior derecho
        t.drawRect(510, 90, 200, 165);

        ///Cuadrado superior derecho
        t.drawRect(510, 270, 200, 165);

        //Contenido del cuadrado superior izquierdo
        t.setColor(Color.red);
        ///Casa
        t.drawLine(115, 150, 266, 150);
        t.drawLine(115, 150, 115, 205);
        t.drawLine(115, 205, 266, 205);
        t.drawLine(266, 205, 266, 150);
        ///Techo
        t.drawLine(115, 150, 190, 110);
        t.drawLine(190, 110, 266, 150);
        ///Puerta
        t.drawLine(160, 205, 160, 170);
        t.drawLine(160, 170, 185, 170);
        t.drawLine(185, 170, 185, 205);
        ///Camino a la puerta
        t.drawLine(135, 230, 160, 205);
        t.drawLine(165, 230, 185, 205);
        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando Lineas", 150, 250);

        //Contenido del cuadrado inferior izquierdo
        ///Circulo Principal
        t.drawOval(125, 280, 130, 130);
        ///Ojos
        t.drawOval(155, 300, 25, 25);
        t.drawOval(195, 300, 25, 25);
        ////Pupilas
        t.fillOval(164, 306, 10, 10);
        t.fillOval(204, 306, 10, 10);
        ///Boca
        t.drawOval(170, 345, 40, 40);
        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando circulos", 150, 425);

        //Contenido del cuadrado superior mitad
        ///Primer rectangulo
        t.drawRect(330, 180, 20, 45);

        ///Segundo rectangulo
        t.drawRect(365, 155, 20, 70);

        ///Tercer rectangulo
        t.drawRect(400, 130, 20, 95);

        ///Cuarto rectangulo
        t.drawRect(435, 105, 20, 120);

        ///quinto rectangulo
        t.drawRect(470, 95, 20, 130);

        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando Rectangulos", 340, 250);

        //Contenido del cuadrado inferior mitad
        ///Ovalo mitad
        t.drawOval(380, 290, 40, 110);

        ///Ovalo superior
        t.drawOval(360, 300, 80, 35);

        ///Ovalo inferior
        t.drawOval(327, 325, 150, 40);

        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando Ovalos con Circulos", 315, 425);

        //Contenido del cuadrado superior derecho
        ///Ovalo mitad
        t.drawRoundRect(590, 115, 40, 110, 100, 100);

        ///Ovalo superior
        t.drawRoundRect(570, 125, 80, 35, 100, 100);

        ///Ovalo inferior
        t.drawRoundRect(539, 150, 150, 40, 1000, 1000);

        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando Ovalos con rectangulos", 515, 250);

        //Contenido del cuadrado inferior derecho
        ///Triangulo Grande
        t.drawLine(555, 390, 620, 350);
        t.drawLine(620, 350, 680, 390);
        t.drawLine(555, 390, 680, 390);

        ///Triangulo exterior al grande
        t.drawLine(550, 360, 550, 320);
        t.drawLine(550, 320, 580, 360);
        t.drawLine(550, 360, 580, 360);

        ///Triangulo superior al grande
        t.drawLine(620, 350, 620, 330);
        t.drawLine(620, 330, 690, 350);
        t.drawLine(620, 350, 690, 350);

        ///Cadena de texto en ese cuadro
        t.drawString("Dibujando Ovalos con rectangulos", 515, 425);
    }
}
