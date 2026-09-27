package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame{
    JTextArea jtTexto;
    JButton jbOcultar, jbMostrar;
    JPanel panel;
    JScrollPane panelTexto;

    public Ejercicio5(){
        setTitle("Calculadora de divisiones");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout(10, 10));

        jtTexto=new JTextArea("");
        panelTexto=new JScrollPane(jtTexto);

        jbMostrar=new JButton("Mostrar");
        jbOcultar=new JButton("Ocultar");

        panel=new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
        panel.add(jbMostrar);
        panel.add(jbOcultar);

        add(panelTexto, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        jbOcultar.addActionListener(e->{
            jtTexto.setBackground(Color.white);
            jtTexto.setForeground(jtTexto.getBackground());
        });

        jbMostrar.addActionListener(e->{
            jtTexto.setForeground(Color.RED);
            jtTexto.setBackground(Color.yellow);
        });
    }

}
