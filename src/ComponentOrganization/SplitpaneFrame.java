package ComponentOrganization;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SplitpaneFrame extends JFrame {
    private static final int WIDTH=600;
    private  static final  int HEIGHT=600;
    public SplitpaneFrame(){
        setTitle("SplitPaneFrame");
        setSize(WIDTH,HEIGHT);
        final JList planetList= new JList(planets);
        final JLabel planetImage=new JLabel();
        final JTextArea description= new JTextArea();

        planetList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Planet value=(Planet)planetList.getSelectedValue();
                planetImage.setIcon(value.getImage());
                description.setText(value.getDescription());
            }
        });
        JSplitPane innerPane= new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,planetList,planetImage);
        innerPane.setContinuousLayout(true);
        innerPane.setOneTouchExpandable(true);
        JSplitPane OuterPane= new JSplitPane(JSplitPane.VERTICAL_SPLIT,innerPane,description);
        getContentPane().add(OuterPane,"Center");
    }
    private Planet[] planets={
            new Planet("Mercury",2440,0),
            new Planet("Venus",6052,0),
            new Planet ("Earth",6378,1),
            new Planet ("Mars",3397, 2),
            new Planet("Jupiter",71492,16),
            new Planet("Saturn",60268,18),
            new Planet("Uranus", 25559, 17),
            new Planet("Neptune",24766, 8),
    };
}
