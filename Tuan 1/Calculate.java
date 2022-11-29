// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 5 : Calculate.java
// Bai 2.2.5
// Write a program to calculate sum, difference, product, and quotient of 2 double numbers which are entered by users.


import javax.swing.JOptionPane;


public class Calculate {
    public static void main ( String [] args ) {
        String strNum1, strNum2;
        double tong,hieu,tich,thuong;

        //Enter the first Number ;
        strNum1  = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);


        double num1 = Double.parseDouble(strNum1);      //Convert strNum1 to double;

        //Enter the second Number ;
        strNum2  = JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);

        double num2 = Double.parseDouble(strNum2);      //Convert strNum2 to double;

        tong = num1 + num2;             //Sum = num1 + num2
        hieu = num1 - num2;             //Difference = num1 - num2
        tich = num1*num2;               //Product = num1 * num2
        thuong = num1/num2;             //Quotient = num1 / num2



        //Show Sum , Difference , Product , Quotient of two numbers
        JOptionPane.showMessageDialog(null,tong, "Sum of two number", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,hieu, "Difference of two number", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,tich, "Product of two number", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,thuong, "Quotient of two number", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
