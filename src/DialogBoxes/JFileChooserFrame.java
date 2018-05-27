package DialogBoxes;

import com.sun.javafx.logging.JFRInputEvent;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageFilter;
import java.io.File;

public class JFileChooserFrame extends JFrame {
    private static final int DEFAULT_WIDTH=400;
    private  static final  int DEFAULT_HEIGHT=300;
    private JLabel label;
    private JFileChooser chooser;
    private FileIconView iconview;
    private ImageFilter imgfilter;

    public JFileChooserFrame(){
        setTitle("FileChooserTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JMenuBar menuBar= new JMenuBar();
        setJMenuBar(menuBar);
        JMenu menu= new JMenu("File");
        menuBar.add(menu);
        JMenuItem openItem= new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());
        JMenuItem exitItem=new JMenuItem("exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });
        label = new JLabel();
        add(label);
        chooser= new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files","jgp","jpeg","gif");
        iconview = new FileIconView(filter, new ImageIcon(getClass().getResource("Neptune.gif")));

        chooser.setAccessory(new ImagePreviewer(chooser));
    }
    private class FileOpenListener implements ActionListener {
        public  void actionPerformed(ActionEvent event){
            chooser.setCurrentDirectory(new File("."));
            int result= chooser.showOpenDialog(JFileChooserFrame.this);
            if(result==JFileChooser.APPROVE_OPTION){
                String name= chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        }
    }

}

