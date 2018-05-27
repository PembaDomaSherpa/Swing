package Label;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1=new JLabel("LABEL WITH TEXT");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon icn=new ImageIcon(getClass().getResource("ppp.jpg"));
        label2=new JLabel("Label with icon and text at bottom", icn,SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3=new JLabel();

        label3.setIcon(icn);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setText("Label with icon and text at center");
        label3.setToolTipText("This is label3");
        add(label3);
    }

}
