package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutFrame extends JFrame implements ActionListener {
    private JButton[] buttons;
    private static final String[] names={"One","Two","Three","Four","Five","Six"};
    private boolean toggle=true;
    private Container container;
    private GridLayout gridlayout1;
    private GridLayout gridlayout2;

    public GridLayoutFrame(){
        super("GridLayout Demo");
        gridlayout1=new GridLayout(2,3,10,10);
        gridlayout2=new GridLayout(3,2);
        container=getContentPane();
        setLayout(gridlayout2);
        buttons=new JButton[names.length];

        for(int count=0; count<names.length; count++){
            buttons[count]=new JButton(names[count]);
            buttons[count].addActionListener(this);
            add(buttons[count]);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(toggle==true){
            container.setLayout(gridlayout2);
        }
        else{
            container.setLayout(gridlayout1);
        }
        toggle=!toggle;
        container.validate();

    }
}
