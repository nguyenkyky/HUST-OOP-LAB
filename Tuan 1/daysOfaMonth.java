// Ho ten : Nguyen Cao Ky
// MSSV : 20204995
// daysOfaMonth.java
// Bai 6.4 : Write a program to display the number of days of a month, which is entered by users (both month and year).
// If it is an invalid month/year, ask the user to enter again.

import java.util.Scanner;
import java.lang.String;

public class daysOfaMonth {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String month ;
        int year ;
        int days = 0;
        int du100;
        int du400;
        while (1==1) {
            System.out.println("Enter a month : ") ;                // Nhap vao thang tu ban phim
            month = sc.nextLine();
            if (month.equals("January")||month.equals("Jan.")||month.equals("Jan")||month.equals("1")) {
                        days = 31;
                        break;
            }
                    else if (month.equals("February")||month.equals("Feb.")||month.equals("Feb") ||month.equals("2")) {
                        break;
            }
                    else if (month.equals("March")||month.equals("Mar.")||month.equals("Mar")||month.equals("3")) {
                        days = 31;
                        break;
            }
                    else if (month.equals("Aprill")||month.equals("Apr.") ||month.equals("Apr")||month.equals("4")) {
                        days = 30;
                        break;
            }
                    else if (month.equals("May")||month.equals("May.")||month.equals("5")) {
                        days = 31;
                        break;
            }
                    else if (month.equals("June") ||month.equals("Jun.")||month.equals("Jun")||month.equals("6")) {
                        days = 30;
                        break;
            }
                    else if (month.equals("July")||month.equals("Jul.")||month.equals("Jul")||month.equals("7")) {
                        days = 31;
                        break;
            }
                    else if (month.equals("August")||month.equals("Aug.")||month.equals("Aug")||month.equals("8")) {
                        days = 31 ;
                        break;
            }
                    else if (month.equals("September")||month.equals("Sep.") ||month.equals("Sep")||month.equals("9")) {
                        days = 30;
                        break;
            }
                    else if (month.equals("October")||month.equals("Oct.")||month.equals("Oct")||month.equals("10")) {
                        days = 31;
                        break; 
            }
                    else if (month.equals("November")||month.equals("Nov.")||month.equals("Nov")||month.equals("11")) {
                        days = 30;
                        break ;
            }
                    else if (month.equals("December")||month.equals("Dec.")||month.equals("Dec")||month.equals("12")) {
                         days = 31;
                         break;
            }
        }

        do {
            System.out.println("Enter a year : ");  // Nhap vao nam tu ban phim
            year = sc.nextInt();
             du100 = year % 100;                    // Tinh so du cua nam va 100;
             du400 = year % 400;                    // Tinh so du cua nam va 400;
        } while (year < 1000 || year > 9999);

            if (month.equals("February")||month.equals("Feb.")||month.equals("Feb") ||month.equals("2")){           // Neu la thang 2
                if(du100 == 0 && du400 != 0) {                                                                      // Neu nam chia het cho 100 va khong chia het cho 400
                    days = 28;
                } else if (year % 4 == 0) {                                                                         // Neu nam chia het cho 4
                    days = 29;
                } else {
                    days = 28;
                }
            }


            // Hien thi ra man hinh
            System.out.println("Month : " + month);
            System.out.println("Number of days of a month : " + days);
    }
}
