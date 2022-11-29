// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// Example 3 : HelloNameDialog.java
// Bai 2.2.3
// Write, compile the first input dialog Java application




import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main ( String [] args ) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name");    // Show " Pls enter your name
        JOptionPane.showMessageDialog(null, "Hi "+result+"!");      // Show " Hi + your name "
        System.exit(0);
    }
}
