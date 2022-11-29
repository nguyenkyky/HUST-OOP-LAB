// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 6.3 : secondDegreeOneVariable.java
// Bai 2.2.6.3
// The second-degree equation with one variable

import java.lang.Math;
import javax.swing.JOptionPane;

public class secondDegreeOneVariable {
    public static void main(String [] args) {
        String strNum1, strNum2, strNum3;
        double n1, n2, n3, delta, x1, x2;
        String nghiemkep = "x1 = x2 = ";
        String nghiemphanbiet = "x1 = ";
        //Enter the first Number ;
        strNum1 = JOptionPane.showInputDialog(null, "Please input value for a : ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        n1 = Double.parseDouble(strNum1);      //Convert strNum1 to double;

        //Enter the second Number ;
        strNum2 = JOptionPane.showInputDialog(null, "Please input value for b : ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        n2 = Double.parseDouble(strNum2);      //Convert strNum1 to double;

        //Enter the third Number ;
        strNum3 = JOptionPane.showInputDialog(null, "Please input value for c : ", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        n3 = Double.parseDouble(strNum3);      //Convert strNum1 to double;

        if (n1 == 0) {                          // Neu a  = 0
            if (n2 == 0) {
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);  // Neu b = 0
            } else {
                x1 = -n3 / n2;                  // x = -b/a
                JOptionPane.showMessageDialog(null, x1, "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            delta = n2 * n2 - 4 * n1 * n3;                // delta = b^2 - 4ac
            if (delta < 0) {                              // delta < 0 => PT vo nghiem

                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem", "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);

            } else if (delta == 0) {                      // delta = 0 => x1 = x2 = -b/2a

                x1 = x2 = -n2 / (2 * n1);
                nghiemkep = nghiemkep + x1;
                JOptionPane.showMessageDialog(null, nghiemkep, "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);

            } else {                                      // delta > 0 => PT co 2 nghiem phan biet x1 , x2

                x1 = (-n2 + Math.sqrt(delta)) / (2 * n1);
                x2 = (-n2 - Math.sqrt(delta)) / (2 * n1);
                nghiemphanbiet = nghiemphanbiet + x1 + " and x2 = " + x2;
                JOptionPane.showMessageDialog(null, nghiemphanbiet, "Nghiem cua phuong trinh", JOptionPane.INFORMATION_MESSAGE);

            }


        }
        System.exit(0);
    }
}
