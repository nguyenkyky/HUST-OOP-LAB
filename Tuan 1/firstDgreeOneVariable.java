// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 6.1 : firstDgreeOneVariable.java
// Bai 2.2.6.1
// The first-degree equation (linear equation) with one variable


import javax.swing.JOptionPane;

public class firstDgreeOneVariable {
    public static void main(String [] args ) {
        String strNum1 , strNum2;
        double num1, num2;
        double output;
        //Enter the first Number ;
        strNum1  = JOptionPane.showInputDialog(null,"Please input value for a : ","ax + b = 0",JOptionPane.INFORMATION_MESSAGE);
         num1 = Double.parseDouble(strNum1);      //Convert strNum1 to double;

        //Enter the second Number ;
        strNum2  = JOptionPane.showInputDialog(null,"Please input value for b : ","ax + b = 0",JOptionPane.INFORMATION_MESSAGE);

         num2 = Double.parseDouble(strNum2);      //Convert strNum2 to double;


        if(num1 ==0) {
            JOptionPane.showMessageDialog(null,"Phuong trinh vo nghiem", "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            output = -num2 / num1;


            //Show x
            JOptionPane.showMessageDialog(null, output, "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
