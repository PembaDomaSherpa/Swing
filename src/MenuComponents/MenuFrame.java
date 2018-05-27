package MenuComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {
    private Action saveAction;
    private Action saveAsAction;
    private JCheckBoxMenuItem readonlyItem;
    private JPopupMenu popup;
    public static final int DEFAULT_WIDTH=300;
    public static final int DEFAULT_HEIGHT=200;

    public MenuFrame(){
        setTitle("Menu Test");
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        JMenu fileMenu= new JMenu("File");
        fileMenu.add((Action) new TestAction("New"));

        JMenuItem openItem= fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl o"));
        fileMenu.addSeparator();
        saveAction= new TestAction("Save");
        JMenuItem saveItem= fileMenu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl s"));

        saveAsAction= new TestAction("Save As");
        fileMenu.add(saveAsAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent event){
                System.exit(0);
            }
        });

        readonlyItem= new JCheckBoxMenuItem("Read-only");
        readonlyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saveOk=!readonlyItem.isSelected();
                saveAction.setEnabled(saveOk);
                saveAsAction.setEnabled(saveOk);
            }
        });

        Action cutAction= new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut.gif"));
        Action copyAction= new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy.gif"));
        Action pasteAction= new TestAction("Paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste.gif"));

        JMenu editMenu= new JMenu("Edit");
        editMenu.add(cutAction);
        editMenu.add(copyAction);
        editMenu.add(pasteAction);

        JMenu optionMenu= new JMenu("Options");
        optionMenu.add(readonlyItem);
        optionMenu.addSeparator();
        ButtonGroup group= new ButtonGroup();

        JRadioButtonMenuItem insertItem= new JRadioButtonMenuItem("Insert");
        insertItem.setSelected(true);
        JRadioButtonMenuItem overtypeItem= new JRadioButtonMenuItem("Overtype");
        group.add(insertItem);
        group.add(overtypeItem);

        optionMenu.add(insertItem);
        optionMenu.add(overtypeItem);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        JMenu helpMenu= new JMenu("Help");
        helpMenu.setMnemonic('H');
        JMenuItem indexItem= new JMenuItem("index");
        indexItem.setMnemonic('I');
        helpMenu.add(indexItem);

        Action aboutAction= new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));

        JMenuBar menuBar= new JMenuBar();
        setJMenuBar(menuBar);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        popup= new JPopupMenu();
        popup.add(cutAction);
        popup.add(copyAction);
        popup.add(pasteAction);

        JPanel panel= new JPanel();
        panel.setComponentPopupMenu(popup);
        add(panel);
        }
}

