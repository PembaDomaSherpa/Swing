package Toolbars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ColorAction extends AbstractAction {
        public ColorAction(String name, Icon icon,Color c){
            putValue(Action.NAME,name);
            putValue(Action.SMALL_ICON,icon);
            putValue(Action.SHORT_DESCRIPTION, name+ "Background");
            putValue("color", c);
        }
        public void actionPerformed(ActionEvent event){
            Color c=(Color)getValue("color");
            ToolBarFrame.panel.setBackground(c);
        }



}
