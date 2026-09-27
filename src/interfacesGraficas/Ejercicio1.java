package interfacesGraficas;
/**
 * Ejercicio1:
 * Crear una nueva aplicación que presente dos botones al usuario etiquetados como
 * “rojo” y “azul” de manera que cada uno de ellos cambie el color del fondo del panel
 * al color indicado en el botón.
 */


import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Ejercicio1 extends JFrame{
    //Declaramos las variables de los elementos graficos
    JButton jBAzul, jBRojo;
    JPanel panel;

    public Ejercicio1(){
        setTitle("Cambiar de color");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jBAzul=new JButton();
        jBAzul.setBackground(Color.BLUE);
        jBAzul.setPreferredSize(new Dimension(120, 55));
    

        jBRojo=new JButton();
        jBRojo.setBackground(Color.RED);
        jBRojo.setPreferredSize(new Dimension(120, 55));
        

        panel=new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setBorder(new EmptyBorder(140, 0, 0, 0));
        panel.add(jBAzul);
        panel.add(jBRojo);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        jBAzul.addActionListener(e->{
            panel.setBackground(Color.BLUE);
        });

        jBRojo.addActionListener(e->{
            panel.setBackground(Color.red);
        });
    }
    

}
