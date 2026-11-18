package primerTrimestre.interfacesConBD;

import javax.swing.SwingUtilities;

public class Testeo {
public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceMySQL().setVisible(true);
            }
        });
    }
}