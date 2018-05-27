package EventHandling;

import EventHandling.ButtonFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAction implements ActionListener {
    private Color backgroundColor;
    public ColorAction(Color c)
    {
        backgroundColor=c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        ButtonFrame.buttonPanel.setBackground(backgroundColor);
    }
}
