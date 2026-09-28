package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejercicio6 extends JFrame{
    private JLabel jlTextoInicial;
    private JButton jbSaludo, jbBienvenida;
    private JCheckBox jcBienvenida, jcSaludo;
    private JPanel  panel, jpPrincipal, jpSaludo, jpBotones, jpChecBox;

    public Ejercicio6(){

        panel=new JPanel(new BorderLayout(10, 20));
        panel.setBorder(new EmptyBorder(20,20,20,20));
        setContentPane(panel);

        setTitle("Practica 5");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        jpPrincipal=new JPanel(new FlowLayout(FlowLayout.CENTER));
        jlTextoInicial =new JLabel("Practica 5");
        jlTextoInicial.setFont(new Font("Arial", Font.BOLD, 22));
        jpPrincipal.add(jlTextoInicial);

        jpBotones=new JPanel(new FlowLayout(FlowLayout.CENTER));
        jbSaludo=new JButton("Hola a todos");
        jbBienvenida=new JButton("Bienvenidos a mi pagina");
        jpBotones.add(jbSaludo);
        jpBotones.add(jbBienvenida);

        jpChecBox=new JPanel(new GridLayout(2, 1, 5, 5));
        jcBienvenida=new JCheckBox("Bienvenidos a mi pagina");
        jcBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
        jcSaludo=new JCheckBox("Hola a todos");
        jcSaludo.setHorizontalAlignment(SwingConstants.CENTER);    
        jpChecBox.add(jcSaludo);
        jpChecBox.add(jcBienvenida);

        add(jpPrincipal, BorderLayout.NORTH);
        add(jpBotones, BorderLayout.CENTER);
        add(jpChecBox, BorderLayout.SOUTH);

        jbSaludo.addActionListener(e->{
            jcSaludo.setSelected(true);;
            jcBienvenida.setSelected(false);
        });

        jbBienvenida.addActionListener(e->{
            jcSaludo.setSelected(false);
            jcBienvenida.setSelected(true);;
        });


    }


}
