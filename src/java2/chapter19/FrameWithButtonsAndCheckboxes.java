package java2.chapter19;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class FrameWithButtonsAndCheckboxes extends JFrame {
    private static final long serialVersionUID = 1L;        // Versionsnummer für Serialisierung

    public FrameWithButtonsAndCheckboxes(String title) {
        super(title);
        setSize(200, 100);
        setLayout(new GridLayout(2, 2));
        add(new JCheckBox("Klavier"));
        add(new JCheckBox("Gitarre"));
        add(new JButton("Abbrechen"));
        add(new JButton("OK"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FrameWithButtonsAndCheckboxes("Frame With Buttons And Checkboxes");
    }
}