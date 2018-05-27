package ChoiceComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxFrame extends JFrame {
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;

    private JLabel label;
    private JCheckBox bold;
    private JCheckBox Italic;

    private static final int FONTSIZE=12;

    public CheckBoxFrame(){
        setTitle("CheckBoxtest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        label = new JLabel("The quick brown fox jumps over the lazy dog.");
        label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
        add(label,BorderLayout.CENTER);

        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mode=0;
                if(bold.isSelected()) mode +=Font.BOLD;
                if(Italic.isSelected()) mode +=Font.ITALIC;
                label.setFont(new Font("Serif", mode,FONTSIZE));
                }
        };
        JPanel buttonPanel1= new JPanel();
         bold= new JCheckBox("Bold");
         bold.addActionListener(listener);
         buttonPanel1.add(bold);

         Italic= new JCheckBox("Italic");
         Italic.addActionListener(listener);
         buttonPanel1.add(Italic);

         add(buttonPanel1, BorderLayout.SOUTH);


    }
}
