// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// ChoosingOption.java
// Bai 6.1 : Write, compile and run the ChoosingOption program:


import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String [] args ) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change the first class ticket?" , "Select an option",JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null,"You're chosen: " + (option==JOptionPane.YES_NO_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
