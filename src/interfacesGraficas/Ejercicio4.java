package interfacesGraficas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class Ejercicio4 extends JFrame{
    JLabel jlPunto1, jlPunto2, jlPunto3, jlPerimetro, jlCoordenadasX, jlCoordenadasY;
    JTextField jtX1, jtY1, jtX2, jtY2, jtX3, jtY3;
    JButton jbCalcular, jbReiniciar;
    JPanel panelCalculadora;


    public Ejercicio4(){
        setTitle("Calculadora de Perimetro");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jlCoordenadasX=new JLabel("Coordenada X:");
        jlCoordenadasY=new JLabel("Coordenada Y:");

        jlPunto1=new JLabel("Ingrese punto 1: ");
        jtX1=new JTextField(15);
        jtY1=new JTextField(15);

        jlPunto2=new JLabel("Ingrese punto 2: ");
        jtX2=new JTextField(15);
        jtY2=new JTextField(15);

        jlPunto3=new JLabel("Ingrese punto 3: ");
        jtX3=new JTextField(15);
        jtY3=new JTextField(15);

        jbCalcular=new JButton("Calcular");
        jbReiniciar=new JButton("Reiniciar");

        jlPerimetro=new JLabel("Valor de perimetro");

        panelCalculadora=new JPanel(new GridLayout(6, 3, 15, 15));
        panelCalculadora.setBorder(new EmptyBorder(15,15,15,15));

        panelCalculadora.add(new JLabel());
        panelCalculadora.add(jlCoordenadasX);
        panelCalculadora.add(jlCoordenadasY);
        panelCalculadora.add(jlPunto1);
        panelCalculadora.add(jtX1);
        panelCalculadora.add(jtY1);
        panelCalculadora.add(jlPunto2);
        panelCalculadora.add(jtX2);
        panelCalculadora.add(jtY2);
        panelCalculadora.add(jlPunto3);
        panelCalculadora.add(jtX3);
        panelCalculadora.add(jtY3);
        panelCalculadora.add(jbCalcular);
        panelCalculadora.add(jbReiniciar);
        panelCalculadora.add(new JLabel());
        panelCalculadora.add(jlPerimetro);
        panelCalculadora.add(new JLabel());
        panelCalculadora.add(new JLabel());


        setLayout(new BorderLayout());
        add(panelCalculadora, BorderLayout.CENTER);

        jbCalcular.addActionListener(e->{
            try{
                //Punto 1
                String txtX1=jtX1.getText();
                String txtY1=jtY1.getText();
                //Punto 2
                String txtX2=jtX2.getText();
                String txtY2=jtY2.getText();
                //Punto 3
                String txtX3=jtX3.getText();
                String txtY3=jtY3.getText();

                //Calculamos los lados
                double lado1=calculadoraDistancias(txtX1, txtY1, txtX2, txtY2);
                double lado2=calculadoraDistancias(txtX2, txtY2, txtX3, txtY3);
                double lado3=calculadoraDistancias(txtX1, txtY1, txtX3, txtY3);

                //Calculamos el perimetro
                jlPerimetro.setText("P: "+calculadorPerimetro(lado1, lado2, lado3));                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error en los intervalos",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });

        jbReiniciar.addActionListener(e->{
            JTextField[] coordenadas={jtX1, jtY1, jtX2, jtY2, jtX3, jtY3};
            for(JTextField y: coordenadas){
                y.setText("");
            }
            jlPerimetro.setText("Valor de perimetro");
        });
    }

    //Logica de calculo
    public double calculadoraDistancias(String txtx1, String txty1, String txtx2, String txty2){
        //Convertimos los puntos a datos numericos
                //Punto1(numerico)
                double x1=Double.parseDouble(txtx1);
                double y1=Double.parseDouble(txty1);
                //Punto1(numerico)
                double x2=Double.parseDouble(txtx2);
                double y2=Double.parseDouble(txty2);

                double lado= Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));
                return lado;
    }

    public double calculadorPerimetro(double lado1, double lado2, double lado3){
        return lado1+lado2+lado3;
    }

}
