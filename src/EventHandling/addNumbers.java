package EventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;


    public class addNumbers extends JFrame {
        JTextField num1,num2, result;
        JLabel number1,number2,resultLabel;
        JButton addBtn;

        private Container container;
        private GridLayout gridLayout;



        BigInteger resultAdd ;
        public static final int DEFAULT_WIDTH = 300;
        public  static final int DEFAULT_HEIGHT = 200;

        public addNumbers(){
            setTitle("Adding Two Numbers");
            setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
            gridLayout = new GridLayout(4,2);
            container = getContentPane();
            setLayout(gridLayout);

            num1 = new JTextField();
            num2 = new JTextField();
            result = new JTextField();

            number1 = new JLabel("Number 1");
            number2 = new JLabel("Number 2");
            resultLabel = new JLabel("Result :");
            addBtn = new JButton("Add");

            add(number1);
            add(num1);
            add(number2);
            add(num2);
            add(new JLabel(" "));
            add(addBtn);
            add(resultLabel);
            add(result);


            addBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    resultAdd =new BigInteger(num1.getText()).add(new BigInteger(num2.getText()));
                    result.setText(resultAdd.toString());
                }
            });
        }
    }

