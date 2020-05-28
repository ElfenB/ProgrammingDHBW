package java2.chapter19;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ColorChooser extends JFrame {
    private static final long serialVersionUID = 1L; 			        // Versionsnummer für Serialisierung

    private static final Color ERROR_BACKGROUND_COLOR = Color.RED;      // Farbe für fehlerhafte Eingabefelder

    private final Color defaultBackgroundColor;                         // Standardfarbe für Eingabefelder
    private JTextField textFieldRed, textFieldGreen, textFieldBlue;     // drei Texteingabefelder
    private JPanel colorPanel;                                          // Panel zur Anzeige der gewählten Farbe

    public ColorChooser() {
        super("Farbwahl");
        setLocationRelativeTo(null);                                    // in der Bildschirmmitte platzieren
        setSize(150, 150);                                              // Fenstergröße setzen
        setResizable(false);                                            // Fenstergröße fixieren
        setLayout(new GridLayout(4, 2));                                // 4x2-Gitter als Layout wählen
        addInputFields();                                               // Labels und Textfelder hinzufügen
        add(colorPanel = new JPanel());                                 // Farb-Panel hinzufügen
        addOkButton();                                                  // OK-Button hinzufügen
        defaultBackgroundColor = textFieldRed.getBackground();          // Standardfarbe speichern
        setVisible(true);                                               // Fenster zur Anzeige bringen
        setDefaultCloseOperation(EXIT_ON_CLOSE);                        // beim Schließen Anwendung beenden
    }

    private void addInputFields() {
        add(new JLabel("Rot"));
        add(textFieldRed = new JTextField("0"));
        add(new JLabel("Grün"));
        add(textFieldGreen = new JTextField("0"));
        add(new JLabel("Blau"));
        add(textFieldBlue = new JTextField("0"));
    }

    private void addOkButton() {
        JButton buttonOk = new JButton("OK");
        buttonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                // Textfelder auslesen und Farbe setzen
                int red = getColorValue(textFieldRed);
                int green = getColorValue(textFieldGreen);
                int blue = getColorValue(textFieldBlue);
                if (isValid(red) && isValid(green) && isValid(blue)) {  // bei gültiger Eingabe Farbe setzen
                    colorPanel.setBackground(new Color(red, green, blue));
                } else {                                                // bei Fehleingaben Fehlermeldung anzeigen
                    JOptionPane.showMessageDialog(
                        ColorChooser.this,
                        "Alle Werte müssen ganze Zahlen von 0 bis 255 sein.",
                        "Fehlermeldung",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
        add(buttonOk);
        getRootPane().setDefaultButton(buttonOk);                       // Button zum Default-Button erklären, damit
    }                                                                   // die Werteeingabe auch mit Return gelingt

    private int getColorValue(JTextField textField) {                   // Eingabefeld auswerten und passend färben
        int value;
        try {
            value = Integer.parseInt(textField.getText());              // Eingabefeldwert auslesen und in Zahl umwandeln
        } catch (NumberFormatException e) {
            value = -1;                                                 // falls keine ganze Zahl: Wert -1
        }                                                               // Eingabefeld weiß bzw. rot einfärben
        textField.setBackground(isValid(value) ? defaultBackgroundColor : ERROR_BACKGROUND_COLOR);
        return value;
    }

    private boolean isValid(int value) {                                // Farbkomponentenwert auf Gültigkeit prüfen
        return 0 <= value && value <= 255;
    }

    public static void main(String[] args) {
        new ColorChooser();
    }
}