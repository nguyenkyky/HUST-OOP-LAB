// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// triangle.java
// Bai 6.3 : Write a program to display a triangle with a height of n stars (*), n is entered by users.


import java.util.Scanner;

public class triangle {
    public static void main (String [] args ) {
        Scanner sc = new Scanner(System.in);
        int n ;
       do {
           System.out.println("Nhap vao so nguyen n : ");          // Nhap vao n  =  so hang cua tam giac
           n = sc.nextInt();

           int sao = 1;
           int cach = n;

           for (int i = 0; i < n; i++) {
               for (int j = 0; j < cach; j++) {                  // So ki tu khoang trang giam tu n -> 0
                   System.out.print(" ");                            // In khoang trang
               }
               cach = cach - 1;
               for (int t = 0; t < sao; t++) {                       // So ngoi sao bat dau tu 1
                   System.out.print("*");
               }
               sao = sao + 2;                                        // So ngoi sao tang them 2 moi khi xuong dong
               System.out.print("\n");
           }
       } while (n <= 0);
    }
}
