package Excepciones;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class ej1Excepciones extends JFrame {
    // Paneles
    private JPanel panelCalculadora;
    private JPanel panelBoton;
    // Labels de texto fijo
    private JLabel jLNumerador;
    private JLabel jLDenominador;
    private JLabel jLResultado;
    private JLabel jLEspacioEnBlanco;
    // TextFields donde el usuario introducira los datos
    private JTextField jTNumerador;
    private JTextField jTDenominador;
    private JTextField jTResultado;
    // Boton el cual hara funcionar todo
    private JButton jBResultado;

    public ej1Excepciones() {
        setTitle("Calculadora de divisiones");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jLNumerador = new JLabel("Numerador(<100): ");
        jTNumerador = new JTextField(15);

        jLDenominador = new JLabel("Denominador(>-5): ");
        jTDenominador = new JTextField(15);

        jBResultado = new JButton("Calcular");
        jLEspacioEnBlanco = new JLabel("");
        jLResultado = new JLabel("Resultado ");
        jTResultado = new JTextField();
        jTResultado.setEditable(false);

        panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBoton.add(jBResultado);

        panelCalculadora = new JPanel(new GridLayout(4, 2, 10, 10));
        panelCalculadora.setBorder(new EmptyBorder(15, 15, 15, 15));

        panelCalculadora.add(jLNumerador);
        panelCalculadora.add(jTNumerador);
        panelCalculadora.add(jLDenominador);
        panelCalculadora.add(jTDenominador);
        panelCalculadora.add(panelBoton);
        panelCalculadora.add(jLEspacioEnBlanco);
        panelCalculadora.add(jLResultado);
        panelCalculadora.add(jTResultado);

        setLayout(new BorderLayout());
        add(panelCalculadora, BorderLayout.CENTER);

        jBResultado.addActionListener(e->{
            try{
                String textNumerador=jTNumerador.getText();
                String textDenominador=jTDenominador.getText();
                int numerador=Integer.parseInt(textNumerador);
                int denominador=Integer.parseInt(textDenominador);

                //Validamos los datos
                if (numerador>100) {
                    throw new ExcepcionIntervalo("El numerador no puede ser mayor de 100");
                }else if(denominador<-5){
                    throw new ExcepcionIntervalo("El denominador no puede ser menor que -5");
                }else if(denominador==0){
                    throw new ExcepcionIntervalo("El denominador no puede ser cero");
                }

                jTResultado.setText(String.valueOf(numerador/denominador));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(
                    this,
                     "Introduce solo valores numericos",
                     "Error de datos",
                     JOptionPane.ERROR_MESSAGE
                );
            }catch(ExcepcionIntervalo ex){
                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error en los intervalos",
                    JOptionPane.ERROR_MESSAGE
                );
            }
            
        });
    }

}
