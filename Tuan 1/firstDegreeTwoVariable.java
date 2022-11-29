// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 6.2 : firstDegreeTwoVariable.java
// Bai 2.2.6.2
// The system of first-degree equations (linear system) with two variables

import javax.swing.JOptionPane;

public class firstDegreeTwoVariable {
    public static void main(String [] args){
        String strNum1 , strNum2, strNum3 , strNum4 , strC1, strC2;
        double num1, num2, num3 , num4 ,c1 , c2, D , Dx, Dy , x , y ;
        //Enter the first Number ;
        strNum1  = JOptionPane.showInputDialog(null,"Please input value for a1 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);      //Convert strNum1 to double;
        //Enter the second Number ;
        strNum2  = JOptionPane.showInputDialog(null,"Please input value for b1 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        num2 = Double.parseDouble(strNum2);      //Convert strNum2 to double;
        //Enter the c1 Number ;
        strC1  = JOptionPane.showInputDialog(null,"Please input value for c1 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        c1 = Double.parseDouble(strC1);      //Convert strNum2 to double;
        //Enter the 3rd Number ;
        strNum3  = JOptionPane.showInputDialog(null,"Please input value for a2 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        num3 = Double.parseDouble(strNum3);      //Convert strNum2 to double;
        //Enter the 4th Number ;
        strNum4  = JOptionPane.showInputDialog(null,"Please input value for b2 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        num4 = Double.parseDouble(strNum4);      //Convert strNum2 to double;
        //Enter the c2 Number ;
        strC2  = JOptionPane.showInputDialog(null,"Please input value for c1 : ","a1x1 + b1x2 = c1 and a2x1 + b2x2 = c2",JOptionPane.INFORMATION_MESSAGE);
        c2 = Double.parseDouble(strC2);      //Convert strNum2 to double;

        D  = num1*num4 - num2*num3;
        Dx = c1*num4 - c2*num2;
        Dy = num1*c2 - c1*num3;

        x = Dx/D;
        y = Dy/D;

        //Show x
        JOptionPane.showMessageDialog(null,x, "Nghiem cua phuong trinh : x ", JOptionPane.INFORMATION_MESSAGE);

        //Show y
        JOptionPane.showMessageDialog(null,y, "Nghiem cua phuong trinh : y ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
