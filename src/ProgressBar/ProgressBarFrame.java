package ProgressBar;

import javafx.scene.control.ProgressBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarFrame extends JFrame {
    private Timer activityMonitor;
    private JButton StartButton;
    private JProgressBar progressbar;
    private JTextArea textArea;
    private SimulatedActivity activity;
    public static final int WIDTH=300;
    public static  final int HEIGHT= 200;
     public ProgressBarFrame(){
         setTitle("Progressbar");
         setSize(WIDTH,HEIGHT);
         Container contentPane= getContentPane();
         textArea= new JTextArea();
         JPanel panel= new JPanel();
         StartButton= new JButton("Start");
         progressbar= new JProgressBar();
         progressbar.setStringPainted(true);
         panel.add(StartButton);
         panel.add(progressbar);
         contentPane.add(new JScrollPane(textArea),BorderLayout.CENTER);
         contentPane.add(panel,BorderLayout.SOUTH);
         StartButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 progressbar.setMaximum(200);
                 activity= new SimulatedActivity(200);
                 activity.start();
                 activityMonitor.start();
                 StartButton.setEnabled(false);
             }
         });
         activityMonitor= new Timer(500, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int current= activity.getCurrent();
                 textArea.append(current + "\n");
                 progressbar.setValue(current);
                 if(current==activity.getTarget()){
                     activityMonitor.stop();
                     StartButton.setEnabled(true);
                 }
             }
         });

     }
}
