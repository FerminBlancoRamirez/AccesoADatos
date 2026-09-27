package interfacesGraficas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Ejercicio2:
 * Programar una aplicación grafica en Java que al recibir como datos el radio y
 * la
 * altura de un cilindro, calcule e imprima el área y volumen.
 */
public class Ejercicio2 extends JFrame {
    JLabel jLAltura, jLRadio, jLVolumen, jLArea, jLVacio;
    JTextField jTAltura, jTRadio;

    JButton jBCalcular, jBReiniciar;
    JPanel jPCalculadora;

    public Ejercicio2(){
        setTitle("Calculadora de cilindros");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jLAltura=new JLabel("Altura: ");
        jTAltura=new JTextField(15);

        jLRadio=new JLabel("Radio: ");
        jTRadio= new JTextField(15);

        jLVolumen=new JLabel("Volumen");
        jLArea=new JLabel("Area");
        jLVacio=new JLabel("12");

        jBCalcular=new JButton("Calcular");
        jBReiniciar=new JButton("Reiniciar");

        jPCalculadora=new JPanel(new GridLayout(4, 3, 20, 20));
        jPCalculadora.setBorder(new EmptyBorder(15,15,15,15));

        jPCalculadora.add(jLAltura);
        jPCalculadora.add(jTAltura);
        jPCalculadora.add(jBCalcular);
        jPCalculadora.add(jLRadio);
        jPCalculadora.add(jTRadio);
        jPCalculadora.add(jBReiniciar);
        jPCalculadora.add(jLArea);
        jPCalculadora.add(new JLabel());
        jPCalculadora.add(new JLabel());
        jPCalculadora.add(jLVolumen);
        jPCalculadora.add(new JLabel());
        jPCalculadora.add(new JLabel());

        setLayout(new BorderLayout());
        add(jPCalculadora, BorderLayout.CENTER);

        jBCalcular.addActionListener(e->{
            try{
                String textAltura=jTAltura.getText();
                String textRadio=jTRadio.getText();
                double altura=Double.parseDouble(textAltura);
                double radio=Double.parseDouble(textRadio);

                double area= 2*radio*altura;
                double volumen= Math.pow(radio, 2)*altura;

                jLVolumen.setText("Volumen: "+volumen);
                jLArea.setText("Area: "+area);
            }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(
                    this,
                     "Introduce solo valores numericos",
                     "Error de datos",
                     JOptionPane.ERROR_MESSAGE
                );
            }
        });

        jBReiniciar.addActionListener(e->{
            jTAltura.setText("");
            jTRadio.setText("");
            jLArea.setText("Area");
            jLVolumen.setText("Volumen");
        });

    }
}
