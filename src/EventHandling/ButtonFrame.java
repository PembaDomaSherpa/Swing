package EventHandling;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame {
    public static JPanel buttonPanel;
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;
    public ButtonFrame(){
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        JButton WhiteButton= new JButton("White");
        JButton BlackButton= new JButton("Black");
        JButton RedButton= new JButton("Red");
        buttonPanel = new JPanel();
        buttonPanel.add(WhiteButton);
        buttonPanel.add(BlackButton);
        buttonPanel.add(RedButton);
        add(buttonPanel);
        ColorAction WhiteAction= new ColorAction(Color.WHITE);
        ColorAction BlackAction= new ColorAction(Color.BLACK);
        ColorAction RedAction= new ColorAction(Color.RED);
        WhiteButton.addActionListener(WhiteAction);
        BlackButton.addActionListener(BlackAction);
        RedButton.addActionListener(RedAction);

    }
}


