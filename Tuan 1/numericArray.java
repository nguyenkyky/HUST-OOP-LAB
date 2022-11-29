// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// numericArray.java
// Bai 6.5 : Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.


import java.util.Scanner;
import java.util.ArrayList;


public class numericArray {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int k ;
        int sum = 0;

        System.out.println("Nhap vao so luong phan tu cua mang : ") ;               // So luong phan tu
        n = sc.nextInt();

        int [] arr = new int[n];                                                    // Mang n phan tu so nguyen

        for ( int i = 0 ; i < n ; i++) {
            System.out.println("Nhap phan tu thu " + (i+1) + " : ");
            arr[i] = sc.nextInt();                                                  // Nhap vao gia tri tung phan tu
        }



        // Sap xep mang theo gia tri tang dan
        for (int i = 0 ; i < n-1 ; i++) {
            for (int j =i+1 ; j < n ; j++) {
                if(arr[i] > arr[j]) {
                    k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }


        // Tinh tong cac gia tri cua mang
        for(int i = 0 ; i < n ; i++ ) {
            sum = sum + arr[i];
        }

        double trungbinh = (double)(sum)/(double)(n);       // Trung binh cac gia tri cua mang




        // In ra man hinh day cac phan tu da duoc sap xep, Tong cac phan tu, Trung binh cac phan tu
        System.out.println("Day cac phan tu duoc sap xep la : ");
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println("\n");
        System.out.println("Tong cac phan tu cua mang la : " + sum);
        System.out.println("Trung binh cong cac phan tu cua mang la : " + trungbinh);
    }
}
