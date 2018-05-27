package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventText extends JFrame implements TextListener {
    TextField t;
    Label l;
    public EventText(){
        setTitle("Handling item Event");
        setLayout(new FlowLayout(FlowLayout.CENTER,150,10));
        t=new TextField();
        l= new Label("handling text evene");
        add(t);
        add(l);
        t.addTextListener(this);
        setSize(400,300);
        setVisible(true);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        if(e.getSource()==t){
            String msg ="You TYped"+ t.getText();
            l.setText(msg);
        }

    }

    public static void main(String[] args) {
        new EventText();
    }
}
