package Toolbars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ToolBarFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 350;
    public static JPanel panel ;

    public ToolBarFrame() {
        setTitle("ToolBarTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        Action blueAction = new ColorAction("Blue", new ImageIcon(getClass().getResource("blue.png")), Color.BLUE);
        Action yellowAction = new ColorAction("yellow", new ImageIcon(getClass().getResource("yellow.png")), Color.YELLOW);
        Action redAction = new ColorAction("red", new ImageIcon(getClass().getResource("red.png")), Color.RED);

        Action exitAction = new AbstractAction("Exit", new ImageIcon(getClass().getResource("exit.png"))) {
            public void actionPerformed(ActionEvent event) {

                System.exit(0);
            }
        };
        exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

        JToolBar bar = new JToolBar();
        bar.add(blueAction);
        bar.add(yellowAction);
        bar.add(redAction);
        bar.addSeparator();
        bar.add(exitAction);
        add(bar, BorderLayout.NORTH);

        JMenu menu = new JMenu("color");
        menu.add(yellowAction);
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);
        menu.add(exitAction);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }
}
