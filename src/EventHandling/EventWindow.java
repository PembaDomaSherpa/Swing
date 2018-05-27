package EventHandling;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventWindow extends WindowAdapter {
    JFrame frame;
    public EventWindow(){
        frame= new JFrame();
        frame.setSize(400,300);
        frame.setVisible(true);
        frame.setTitle("Handling Window Event");
        frame.addWindowListener(this);
    }
    public void windowClosing(WindowEvent e){
        JOptionPane.showMessageDialog(frame,"GoodBye Pemba");
        System.exit(1);
    }
    public void windowOpened(WindowEvent e){
        JOptionPane.showMessageDialog(frame,"Welcome Pemba");
    }
    public void windowIconified(WindowEvent e){
        JOptionPane.showMessageDialog(frame,"See You Later! Pemba");
    }
    public void windowDeiconified(WindowEvent e){
        JOptionPane.showMessageDialog(frame,"Welcome Back! Pemba");
    }


    public static void main(String[] args) {
        new EventWindow();
    }
}

