package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio7 extends JFrame{
    private JLabel jlTextoInicial, jlNombre, jlApellido, jlSexo;
    private JTextField jtNombre, jtApellidos;
    private JRadioButton jrbHombre, jrbMujer;
    private JButton jbContinuar, jbSalir;
    private JPanel panel, jpTextoInical, jpDatos, jpSexo, jpBotones, jpCentral;

    public Ejercicio7(){
        panel=new JPanel(new BorderLayout(10, 20));
        panel.setBorder(new EmptyBorder(20,20,20,20));
        setContentPane(panel);

        setTitle("Ejercicio 6");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jpTextoInical=new JPanel(new FlowLayout(FlowLayout.CENTER));
        jlTextoInicial=new JLabel("Datos Alumno");
        jlTextoInicial.setFont(new Font("Arial", Font.BOLD, 22));
        jlTextoInicial.setForeground(Color.red);
        jpTextoInical.add(jlTextoInicial);

        jpDatos=new JPanel(new GridLayout(2, 2,10, 10));
        jlNombre=new JLabel("Nombre: ");
        jtNombre=new JTextField(25);
        jlApellido=new JLabel("Apellidos");
        jtApellidos=new JTextField(25);
        jpDatos.add(jlNombre);
        jpDatos.add(jtNombre);
        jpDatos.add(jlApellido);
        jpDatos.add(jtApellidos);

        jpSexo=new JPanel(new GridLayout(1, 3, 15, 15));
        jlSexo= new JLabel("Sexo: ");
        jrbHombre=new JRadioButton("H");
        jrbMujer=new JRadioButton("M");
        jpSexo.add(jlSexo);
        jpSexo.add(jrbHombre);
        jpSexo.add(jrbMujer);

        jpCentral=new JPanel(new GridLayout(2,1,20,20));
        jpCentral.add(jpDatos);
        jpCentral.add(jpSexo);

        jpBotones=new JPanel(new FlowLayout(FlowLayout.CENTER));
        jbContinuar=new JButton("Continuar");
        jbContinuar.setForeground(Color.green);
        jbSalir=new JButton("Salir");
        jbSalir.setForeground(Color.red);
        jpBotones.add(jbContinuar);
        jpBotones.add(jbSalir);

        add(jpTextoInical, BorderLayout.NORTH);
        add(jpCentral, BorderLayout.CENTER);
        add(jpBotones, BorderLayout.SOUTH);


        jbContinuar.addActionListener(e->{
            this.setVisible(false);
            Ejercicio7SegundaVentana ventana=new Ejercicio7SegundaVentana(this);
            ventana.setVisible(true);
        });

        jbSalir.addActionListener(e->{
            this.dispose();
        });
    }
}
