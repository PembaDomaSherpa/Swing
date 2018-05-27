package EventHandling.WhereToPutE_HCode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventInnerClass extends JFrame {
    JTextField tf;
    EventInnerClass() {
        tf = new JTextField(15);
        setLayout(null);
        JButton b = new JButton("Click");
        b.addActionListener(new EventInnerClass.HandlerIC(this));
        tf.setBounds(70,50,180,30);
        b.setBounds(100,120,80,30);
        add(b);
        add(tf);
    }

    private class HandlerIC implements ActionListener {
        EventInnerClass eoc;

        HandlerIC(EventInnerClass e) {
            eoc = e;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            eoc.tf.setText("Welcome");
        }
    }
}


