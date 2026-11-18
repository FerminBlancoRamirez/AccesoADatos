package primerTrimestre.interfacesConBD;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InterfaceMySQL extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JTextField txtServidor;
    private JTextField txtPuerto;
    private JComboBox<String> comboBD;
    private JButton btnConectar;

    public InterfaceMySQL() {
        setTitle("MySQL");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 20, 100, 25);
        add(lblUsuario);

        txtUsuario = new JTextField("root");
        txtUsuario.setBounds(140, 20, 200, 25);
        add(txtUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(30, 60, 100, 25);
        add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(140, 60, 200, 25);
        add(txtContrasena);

        JLabel lblServidor = new JLabel("Servidor:");
        lblServidor.setBounds(30, 100, 100, 25);
        add(lblServidor);

        txtServidor = new JTextField("127.0.0.1");
        txtServidor.setBounds(140, 100, 120, 25);
        add(txtServidor);

        txtPuerto = new JTextField("3306");
        txtPuerto.setBounds(270, 100, 70, 25);
        add(txtPuerto);

        JLabel lblBD = new JLabel("Base de datos:");
        lblBD.setBounds(30, 140, 100, 25);
        add(lblBD);

        comboBD = new JComboBox<>();
        comboBD.setBounds(140, 140, 200, 25);
        add(comboBD);

        btnConectar = new JButton("CONECTAR");
        btnConectar.setBounds(120, 200, 140, 35);
        add(btnConectar);

        cargarBasesDeDatos();

        btnConectar.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                validarCamposVacios();
            }
        });

        btnConectar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCamposVacios() && validarPuerto()) {
                    realizarConexion();
                }
            }
        });
    }

    private void cargarBasesDeDatos() {
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());
        String servidor = txtServidor.getText();
        String puerto = txtPuerto.getText();

        String url = "jdbc:mysql://" + servidor + ":" + puerto + "/";

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasena);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SHOW DATABASES")) {

            comboBD.removeAllItems();
            while (rs.next()) {
                comboBD.addItem(rs.getString(1));
            }

        } catch (Exception e) {
            comboBD.addItem("northwind");
        }
    }

    private boolean validarCamposVacios() {
        if (txtUsuario.getText().trim().isEmpty() ||
                txtServidor.getText().trim().isEmpty() ||
                txtPuerto.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Es necesario cumplimentar los campos Usuario, Servidor y Puerto.",
                    "Atención",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarPuerto() {
        try {
            int puerto = Integer.parseInt(txtPuerto.getText().trim());
            if (puerto < 0 || puerto > 45003) {
                JOptionPane.showMessageDialog(this,
                        "El puerto debe estar entre 0 y 45003.",
                        "Error de Validación",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "El campo puerto debe ser un valor numérico.",
                    "Error de Validación",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void realizarConexion() {
        String usuario = txtUsuario.getText();
        String contrasena = new String(txtContrasena.getPassword());
        String servidor = txtServidor.getText();
        String puerto = txtPuerto.getText();
        String bd = (String) comboBD.getSelectedItem();

        String url = "jdbc:mysql://" + servidor + ":" + puerto + "/" + (bd != null ? bd : "");

        try (Connection conn = DriverManager.getConnection(url, usuario, contrasena)) {

            if (bd != null && !bd.isEmpty()) {
                try (Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT NOW()")) {
                    if (rs.next()) {
                        System.out.println("Consulta ejecutada con éxito: " + rs.getString(1));
                    }
                }
            }

            JOptionPane.showMessageDialog(this,
                    "Conexión realizada con éxito.",
                    "Conectado",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Imposible conectar",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
