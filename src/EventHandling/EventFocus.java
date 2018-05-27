package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventFocus extends JFrame implements FocusListener {
    private JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b;

    EventFocus(){
        super("Handling Focus Event");
        setLayout(new FlowLayout(FlowLayout.LEFT,150,10));
        l1=new JLabel("First Value");
        l2=new JLabel("Second Value");
        l3=new JLabel("Result Value");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        b= new JButton("Multiply");
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        t3.addFocusListener(this);
        b.addFocusListener(this);
        add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(b);
    }
    @Override
    public void focusGained(FocusEvent e) {
        int x,y,z;
        if(e.getSource()==b){
            x = Integer.parseInt(t1.getText());
            y = Integer.parseInt(t2.getText());
            z=x*y;
            t3.setText(String.valueOf(z));
        }

    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource()==t1&&t1.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter Number to continue");
            t1.requestFocus();
        }
        if(e.getSource()==t2&&t2.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Enter Number to continue");
            t2.requestFocus();
        }


    }
}
