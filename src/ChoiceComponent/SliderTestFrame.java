package ChoiceComponent;

import sun.util.cldr.CLDRLocaleDataMetaInfo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

public class SliderTestFrame extends JFrame {
    public final static int DEFAULT_WIDTH=350;
    public final static int DEFAULT_HEIGHT=450;

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listener;

    public SliderTestFrame(){
        setTitle("SliderTEst");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        sliderPanel=new JPanel();
        sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        listener=new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSlider source = (JSlider) e.getSource();
                textField.setText("" + source.getValue());
            }
        };
                JSlider slider= new JSlider();
                addSlider(slider,"Plain");

                slider= new JSlider();
                slider.setPaintTicks(true);
                slider.setMajorTickSpacing(20);
                slider.setMinorTickSpacing(5);
                addSlider(slider,"Ticks");

                slider=new JSlider();
                slider.setPaintTicks(true);
                slider.setSnapToTicks(true);
                slider.setMajorTickSpacing(20);
                slider.setMinorTickSpacing(5);
                addSlider(slider," Snap to Ticks");

                slider=new JSlider();
                slider.setPaintTicks(true);
                slider.setMajorTickSpacing(20);
                slider.setMinorTickSpacing(5);
                slider.setPaintTrack(false);
                addSlider(slider," No Tracks");

               slider=new JSlider();
               slider.setPaintTicks(true);
               slider.setMajorTickSpacing(20);
               slider.setMinorTickSpacing(5);
               slider.setInverted(true);
               addSlider(slider," Inverted");

               slider=new JSlider();
               slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setInverted(true);
        addSlider(slider," Labels");

        slider=new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        Dictionary<Integer,Component>labelTable=new Hashtable<Integer,Component>();
        labelTable.put(0,new JLabel("A"));
        labelTable.put(20,new JLabel("B"));
        labelTable.put(40,new JLabel("C"));
        labelTable.put(60,new JLabel("D"));
        labelTable.put(80,new JLabel("E"));
        labelTable.put(100,new JLabel("F"));

        slider.setLabelTable(labelTable);
        addSlider(slider,"Custom lables");

        slider=new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        labelTable= new Hashtable<Integer, Component>();


        labelTable.put(0,new JLabel( new ImageIcon(getClass().getResource("as.png"))));
        labelTable.put(20,new JLabel( new ImageIcon(getClass().getResource("bs.png"))));
        labelTable.put(40,new JLabel( new ImageIcon(getClass().getResource("cs.png"))));
        labelTable.put(60,new JLabel( new ImageIcon(getClass().getResource("ds.png"))));
        labelTable.put(80,new JLabel( new ImageIcon(getClass().getResource("es.png"))));
        labelTable.put(100,new JLabel( new ImageIcon(getClass().getResource("fs.png"))));
        slider.setLabelTable(labelTable);
        addSlider(slider,"Icon labels");

        textField= new JTextField();
        add(sliderPanel, BorderLayout.CENTER);
        add(textField,BorderLayout.SOUTH);
    }
    public void addSlider(JSlider s, String description){
        s.addChangeListener(listener);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        sliderPanel.add(panel);
    }
}
