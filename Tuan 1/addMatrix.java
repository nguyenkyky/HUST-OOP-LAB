// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// addMatrix.java
// Bai 6.6 : Write a Java program to add two matrices of the same size.


import java.util.Scanner;

public class addMatrix {
    public static void main(String [] args) {
        int m , n ;
        Scanner sc = new Scanner(System.in);

        // Nhap vao so hang (m) va so cot (n) cua ma tran cap mxn
        System.out.print("Nhap vao size cua ma tran mxn: \nm = ");
        m = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();

        int[][] x = new int [m][n];
        int[][] y = new int [m][n];
        int[][] z = new int [m][n];


        // Nhap vao cac gia tri cua ma tran 1
        System.out.println("Nhap vao cac gia tri cua ma tran X : ") ;
        for (int i = 0 ; i < m ; i++ ){
            for (int j = 0 ; j < n ; j++ ) {
                System.out.print("X"+i+j + " : ");
                x[i][j] = sc.nextInt();
            }
        }


        // Nhap vao cac gia tri cua ma tran 2
        System.out.println("Nhap vao cac gia tri cua ma tran Y : ") ;
        for (int i = 0 ; i < m ; i++ ){
            for (int j = 0 ; j < n ; j++ ) {
                System.out.print("Y"+i+j  + " : ");
                y[i][j] = sc.nextInt();
            }
        }


        // Tinh tong cua 2 ma tran cung cap va in ra man hinh
        System.out.println("Tong cua 2 ma tran : ") ;
        for (int i = 0 ; i < m ; i++ ) {
            for (int j = 0; j < n; j++) {
                z[i][j] = x[i][j] + y[i][j];
                System.out.print(z[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
