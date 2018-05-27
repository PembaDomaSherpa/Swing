package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class GridBagFrame extends JFrame {
    private GridBagLayout layout;
    private GridBagConstraints constraints;

    public GridBagFrame(){
            super("Grid Bag Layout");
            layout= new GridBagLayout();
            setLayout(layout);
            constraints= new GridBagConstraints();

            JTextArea textArea1=new JTextArea("TestArea", 2,10);
            JTextArea textarea2=new JTextArea("TestArea",5,5);

            String[] names={"Iron", "Steel","Brass"};
            JComboBox comboBox=new JComboBox(names);

            JTextField textField=new JTextField("TextField");
            JButton button1= new JButton("Button 1");
            JButton button2= new JButton("Button 2");
            JButton button3= new JButton("Button 3");

            constraints.fill=GridBagConstraints.BOTH;
            addComponent(textArea1,0,0,1,3);

            constraints.fill=GridBagConstraints.HORIZONTAL;
            addComponent(button1,0,1,2,1);

            addComponent(comboBox,2,1,2,1);

            constraints.weightx=1000;
            constraints.weighty=1;
            constraints.fill=GridBagConstraints.BOTH;

            addComponent(button2,1,1,1,1);

            constraints.weightx=0;
            constraints.weighty=0;
            addComponent(button3,1,2,1,1);

            addComponent(textField,3,0,2,1);
            addComponent(textarea2,3,2,1,1);


    }

    private void addComponent(Component component, int row, int column, int width, int height) {
        constraints.gridx=column;
        constraints.gridy=row;
        constraints.gridwidth=width;
        constraints.gridheight=height;
        layout.setConstraints(component,constraints);
        add(component);
    }
}
