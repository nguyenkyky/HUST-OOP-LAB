// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 4: ShowTwoNumbers.java
// Bai 2.2.4
// Show two numbers

import javax.swing.JOptionPane;


public class ShowTwoNumbers {
public static void main(String [] args) {
    String strNum1 ;
    String strNum2 ;
    String strNotification = "You've just entered : ";


    //Title : Input the first number
    //Message : Please input the first number
    //strNum1 = input String + " and "
    strNum1  = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
    strNotification += strNum1 + " and ";



    //Title : Input the second number
    //Message : Please input the second number
    //strNum1 = input String
    strNum2  = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
    strNotification += strNum2 ;


    //Print entered Num1 and Num2
    JOptionPane.showMessageDialog(null,strNotification,"Show two numbers", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
}

}
