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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ejercicio7SegundaVentana extends JFrame {
    private JLabel jlTexto;
    private JButton jbVolver, jbCerrar;
    private Ejercicio7 ejercicio7;

    public Ejercicio7SegundaVentana(Ejercicio7 ejercicio7) {
        this.ejercicio7 = ejercicio7;

        setTitle("Datos Finales");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Contenedor principal con BorderLayout y márgenes
        JPanel panelContenedor = new JPanel(new BorderLayout(10, 20));
        panelContenedor.setBorder(new EmptyBorder(20, 20, 20, 20));
        setContentPane(panelContenedor);

        // Texto ajustado a 22pt y centrado
        jlTexto = new JLabel("Datos Enviados!!!!!", SwingConstants.CENTER);
        jlTexto.setFont(new Font("Arial", Font.BOLD, 22));
        jlTexto.setForeground(Color.RED);

        // Botones centrados
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        jbVolver = new JButton("Volver");
        jbCerrar = new JButton("Cerrar");
        panelBotones.add(jbVolver);
        panelBotones.add(jbCerrar);

        // Añadir elementos al panel contenedor
        add(jlTexto, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // Eventos de los botones
        jbVolver.addActionListener(e -> {
            this.dispose();
            if (this.ejercicio7 != null) {
                this.ejercicio7.setVisible(true);
            }
        });

        jbCerrar.addActionListener(e -> {
            this.dispose();
            if (this.ejercicio7 != null) {
                this.ejercicio7.dispose();
            }
        });
    }
}