package EventHandling.WhereToPutE_HCode;

import javax.swing.*;

public class EventOuterClass extends JFrame {
    JTextField tf;

    EventOuterClass() {
        tf = new JTextField(15);
        setLayout(null);
        JButton b = new JButton("Click");
        b.addActionListener(new HandlerOC(this));
        tf.setBounds(70,50,180,30);
        b.setBounds(100,120,80,30);
        add(b);
        add(tf);
    }
}
