package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventKeyTest extends JFrame implements KeyListener {
    private JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b1;
    public EventKeyTest(){
        super("Handling Action Events");
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        t1=new JTextField(10);
        l1=new JLabel("First Value");
        l2=new JLabel("Second Value");
        l3=new JLabel("Result Value");
        t2=new JTextField(10);
        t3=new JTextField(10);
        b1= new JButton("Calculate");
        b1.addKeyListener(this);
        add(t1);add(t2);add(t3);add(l1);add(l2);add(l3);add(b1);
        setSize(400,300);
        setVisible(true);
    }
    @Override
    public void keyPressed (KeyEvent e) {
        int x, y, z=0;
        x = Integer.parseInt(t1.getText());
        y = Integer.parseInt(t2.getText());
        if (e.getKeyChar() == 'a') {
            z = x + y;
        } else if (e.getKeyChar() == 's') {
            z = x - y;
        } else {
            t3.setText("Press a or s");
            return;
        }
        t3.setText(String.valueOf(z));

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}

