package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAction extends JFrame implements ActionListener {
    JLabel lb;
    EventAction(){
        lb= new JLabel();
        lb.setBounds(70,50,180,30);
        setLayout(null);
        JButton b1 = new JButton("Continue");
        b1.setBounds(50,120,100,30);
        JButton b2= new JButton("Ok");
        b2.setBounds(170,120,50,30);
        add(b1);
        add(b2);
        add(lb);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b1.setActionCommand("Proceed");
        b2.setActionCommand("Proceed");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Proceed");
        lb.setText("Do you want to proceeed?");

    }
}
