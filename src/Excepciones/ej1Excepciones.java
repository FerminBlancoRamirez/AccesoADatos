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
        //Le damos valores a la caja
        setTitle("Calculadora de divisiones");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        //Creamos los componentes del numerador
        jLNumerador = new JLabel("Numerador(<100): ");
        jTNumerador = new JTextField(15);
        //Creamos los componentes del denominador
        jLDenominador = new JLabel("Denominador(>-5): ");
        jTDenominador = new JTextField(15);
        //Creamos los componentes del boton
        jBResultado = new JButton("Calcular");
        jLEspacioEnBlanco = new JLabel("");
        //Creamos los componentes del resultado
        jLResultado = new JLabel("Resultado ");
        jTResultado = new JTextField();
        //Indicamos que la caja en donde aparecerá el resultado no se pueda editar para que solo aparezca el resultado
        jTResultado.setEditable(false);

        //Creamos  un panel para el boton para poder centrarlo un poco
        panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //Añadimos el boton al panel
        panelBoton.add(jBResultado);

        //Creamos el panel de la calculadora
        panelCalculadora = new JPanel(new GridLayout(4, 2, 10, 10));
        //le damos un borde para que el contenido no este pegado a los bordes
        panelCalculadora.setBorder(new EmptyBorder(15, 15, 15, 15));

        //Añadimos los componentes
        panelCalculadora.add(jLNumerador);
        panelCalculadora.add(jTNumerador);
        panelCalculadora.add(jLDenominador);
        panelCalculadora.add(jTDenominador);
        panelCalculadora.add(panelBoton);
        panelCalculadora.add(jLEspacioEnBlanco);
        panelCalculadora.add(jLResultado);
        panelCalculadora.add(jTResultado);

        //centramos el panel
        setLayout(new BorderLayout());
        add(panelCalculadora, BorderLayout.CENTER);

        //Le damos la logica de negocio a la accion de que se clique el boton
        jBResultado.addActionListener(e->{
            //Usaremos las restricciones para hacer funcionar los intervalos
            try{
                //Casteamos los valores de los fieldText primero a texto y luego a entero
                String textNumerador=jTNumerador.getText();
                String textDenominador=jTDenominador.getText();
                int numerador=Integer.parseInt(textNumerador);
                int denominador=Integer.parseInt(textDenominador);

                //Validamos los datos con las excepciones si cualquier valor se cumple saltara un panel con la excepcion
                if (numerador>100) {
                    throw new ExcepcionIntervalo("El numerador no puede ser mayor de 100");
                }else if(denominador<-5){
                    throw new ExcepcionIntervalo("El denominador no puede ser menor que -5");
                }else if(denominador==0){
                    throw new ExcepcionIntervalo("El denominador no puede ser cero");
                }
                //Si todo sale bien se hara el calculo y se mostrar en la cajita del resultado
                jTResultado.setText(String.valueOf(numerador/denominador));
            //Indicamos las excepciones primero con una que detecta si lo que se añade no es un valor numerico
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(
                    this,
                     "Introduce solo valores numericos",
                     "Error de datos",
                     JOptionPane.ERROR_MESSAGE
                );
            //Aqui se hara referencia a las excepciones marcadas en el filtro de intervalos
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
