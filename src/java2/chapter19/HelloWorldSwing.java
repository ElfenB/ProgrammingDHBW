package java2.chapter19;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World (Swing)");       // neues Fenster mit Titel
        frame.setSize(200, 200);                                // Fenstergröße setzen
        frame.add(new JLabel("Hello, world!"));                 // einen Text hinzufügen
        frame.setVisible(true);                                 // Fenster sichtbar machen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // beim Schließen Anwendung beenden
    }
}