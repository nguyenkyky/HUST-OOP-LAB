// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// inputFromKeyboard.java
// Bai 6.2 : Write a program for input/output from keyboard


import javax.swing.JOptionPane;
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main ( String [] args ) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name");                 // Hien thi ra man hinh : What's your name
        String name = input.nextLine();                         // Input name from keyboard
        System.out.println("How old are you");                  // Hien thi ra man hinh : How old are you
        int old = input.nextInt();                              // Nhap vao tuoi tu ban phim
        input.nextLine();
        System.out.println("How tall are you");                 // Hien thi ra man hinh : How tall are you
        double height = input.nextDouble();                     // Nhap vao chieu cao tu ban phim

        System.out.println("Mrs/Mr. " + name + ", " + old +" years old. Your height is " + height + ".");

    }
}
