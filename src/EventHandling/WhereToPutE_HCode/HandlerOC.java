package EventHandling.WhereToPutE_HCode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HandlerOC implements ActionListener {
    EventOuterClass eoc;

    HandlerOC(EventOuterClass e) {
        eoc = e;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        eoc.tf.setText("Welcome");
    }
}
