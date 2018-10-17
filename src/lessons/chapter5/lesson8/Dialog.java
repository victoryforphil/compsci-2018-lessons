package lessons.chapter5.lesson8;

import javax.swing.*;

public class Dialog {
    public static void main(String[] args){
        boolean stop = false;
        while(!stop){
            int vlaue1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 1:"));
            int vlaue2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number 2:"));
            JOptionPane.showMessageDialog(null, "Sum: " + (vlaue1+vlaue2));

            int result = JOptionPane.showConfirmDialog(null,"Again?");
            if(result != 0){
                stop = true;
            }
        }
    }
}
