package interfacesGraficas;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Programar una aplicación grafica en Java que al recibir como datos los tres lados de
 * un triangulo, calcule e imprima su área aplicando la siguiente fórmula:
 */
public class Ejercicio3 extends JFrame{
    JLabel jlLado1, jlLado2, jlLado3, jlArea;
    JTextField jtLado1, jtLado2, jtLado3;
    JButton jbCalcular, jbReiniciar;
    JPanel panelCalculadora;

    public Ejercicio3(){
        setTitle("Calculadora de area de triangulo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jlLado1=new JLabel("Ingresar lado 1: ");
        jtLado1=new JTextField(15);
        jbCalcular=new JButton("Calcular");

        jlLado2=new JLabel("Ingresar lado 2: ");
        jtLado2=new JTextField(15);
        
        jlLado3=new JLabel("Ingresar lado 3: ");
        jtLado3=new JTextField(15);
        jbReiniciar=new JButton("Reiniciar");

        jlArea=new JLabel("Area");

        panelCalculadora = new JPanel(new GridLayout(4, 3, 10, 10));
        panelCalculadora.setBorder(new EmptyBorder(15, 15, 15, 15));

        panelCalculadora.add(jlLado1);
        panelCalculadora.add(jtLado1);
        panelCalculadora.add(jbCalcular);
        panelCalculadora.add(jlLado2);
        panelCalculadora.add(jtLado2);
        panelCalculadora.add(new JLabel());
        panelCalculadora.add(jlLado3);
        panelCalculadora.add(jtLado3);
        panelCalculadora.add(jbReiniciar);
        panelCalculadora.add(jlArea);
        panelCalculadora.add(new JLabel());
        panelCalculadora.add(new JLabel());

        setLayout(new BorderLayout());
        add(panelCalculadora, BorderLayout.CENTER);

        jbCalcular.addActionListener(e->{
            try{
                String txtLado1=jtLado1.getText();
                String txtLado2=jtLado2.getText();
                String txtLado3=jtLado3.getText();

                double lado1=Double.parseDouble(txtLado1);
                double lado2=Double.parseDouble(txtLado2);
                double lado3=Double.parseDouble(txtLado3);

                double aux=(lado1+lado2+lado3)/2;
                double area= Math.sqrt((aux*(aux-lado1)*(aux-lado2)*(aux-lado3)));

                jlArea.setText("Area: "+area);

            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(
                    this,
                    "Introduce solo valores numericos",
                    "Error de datos",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }); 

        jbReiniciar.addActionListener(e->{
            jtLado1.setText("");
            jtLado2.setText("");
            jtLado3.setText("");
            jlArea.setText("Area");
        });
    }

}
