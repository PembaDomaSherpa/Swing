package DialogBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;

public class AboutDialog extends JDialog {
    public AboutDialog(JFrame owner){
        super(owner,"About Dialogtest", true);
        add(new JLabel("<html><h1><i>Core Java</i></h1><hr>By Pemba Doma Sherpa</html>",SwingConstants.CENTER));
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                }
        });
        JPanel panel= new JPanel();
        panel.add(ok);
        add(panel,BorderLayout.SOUTH);
        setSize(400,300);

    }
}
