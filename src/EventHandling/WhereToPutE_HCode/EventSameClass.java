package EventHandling.WhereToPutE_HCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventSameClass  extends JFrame implements ActionListener {
    JTextField tf;
    EventSameClass(){
        tf= new JTextField(15);
        setLayout(null);
        JButton b = new JButton("Click");
        b.addActionListener(this);
        tf.setBounds(60,50,170,20);
        b.setBounds(100,120,80,30);
        add(b);
        add(tf);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to the class");
    }
}
