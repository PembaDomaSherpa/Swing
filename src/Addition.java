
import javax.swing.*;

public class Addition {
    public static void main(String[] args) {
        String firstNum= JOptionPane.showInputDialog("Enter first num");
        String secondNum= JOptionPane.showInputDialog("Enter second num");
        int fnum= Integer.parseInt(firstNum);
        int snum=Integer.parseInt(secondNum);
        int sum=fnum+snum;
        JOptionPane.showMessageDialog( null,"The sum is " +sum,"The sum of two integers",JOptionPane.PLAIN_MESSAGE);
    }
}
