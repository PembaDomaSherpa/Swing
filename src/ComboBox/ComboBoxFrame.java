package ComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame {
    private final static int DEFAULT_WIDTH = 500;
    private final static int DEFAULT_HEIGHT = 200;
    private JLabel label;
    private JComboBox faceCombo;
    private static final int DEFAULT_SIZE = 12;

    public ComboBoxFrame() {
        setTitle("ComboBoxTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);

        faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        faceCombo.addItem("serif");
        faceCombo.addItem("SanSerif");
        faceCombo.addItem("Monospaced");
        faceCombo.addItem("Dialog");
        faceCombo.addItem("DialogInput");

        faceCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setFont(new Font((String) faceCombo.getSelectedItem(), Font.PLAIN, DEFAULT_SIZE));
            }
        });
        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.SOUTH);
    }
}
