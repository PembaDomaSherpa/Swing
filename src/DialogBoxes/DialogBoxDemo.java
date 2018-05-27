package DialogBoxes;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBoxDemo extends JFrame {
    private static final int DEFAULT_WIDTH=400;
    private  static final  int DEFAULT_HEIGHT=300;
    private AboutDialog dialog;

    public DialogBoxDemo(){
        setTitle(("Dialogtest"));
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        JButton about= new JButton("ABOUT");
        JPanel btnpanel= new JPanel();
        this.add(btnpanel);
        about.setBounds(5,5,5,5);
        btnpanel.add(about);

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dialog==null);
                dialog= new AboutDialog(DialogBoxDemo.this);
                dialog.setVisible(true);
            }
        });
        JMenuBar menuBar= new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem aboutItem=new JMenuItem("About");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dialog==null);
                dialog= new AboutDialog(DialogBoxDemo.this);
                dialog.setVisible(true);

            }
        });
        fileMenu.add(aboutItem);
        JMenuItem exitItem= new JMenuItem("Exit");
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitItem);
    }
}
