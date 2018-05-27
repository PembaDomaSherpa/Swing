import java.awt.Color;
import java.awt.Container;
import javax.swing.*;


public class MyJPanel {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("Mero Panel");
        Container c = frame.getContentPane();
        c.setBackground(Color.blue);
        c.setLayout(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.red);
        panel.setBounds(110,110,250,250);
        JPanel panel2=new JPanel();
        panel2.setBackground(Color.yellow);
        panel2.setBounds(70,70,110,110);
        panel.add(panel2);
        JButton btn=new JButton("Ok");
        JButton btn1=new JButton("Cancel");
        JButton btn2=new JButton("Bye");
        panel2.add(btn);
        panel2.add(btn1);
        panel2.add(btn2);
        c.add(panel);
    }
}
