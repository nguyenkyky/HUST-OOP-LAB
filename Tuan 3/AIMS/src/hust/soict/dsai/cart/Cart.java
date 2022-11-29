package hust.soict.dsai.cart;// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.cart.Cart Class
// hust.soict.dsai.cart.Cart.java

import java.util.Scanner;
import hust.soict.dsai.disc.*;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private float totalcost = 0;
    private int qtyOrdered = 0;

    // Khoi tao 1 mang cac DVDs
    private DigitalVideoDisc itemlist[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];


    // Them 1 DVD vao gio hang
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered >= 0 && qtyOrdered < 20) {                    // So san pham toi da = 20
            itemlist[qtyOrdered] = disc;
            qtyOrdered++;
            totalcost = 0;
            System.out.println("San pham " + disc.getTitle() + " da duoc them vao");
        } else {
            System.out.println("Gio hang da day");                  // qtyOrdered = 20 => Gio hang da day
        }
    }


    // Tinh tong gia tri cac san pham trong gio hang
    public float totalCost() {
        for (int i = 0; i < qtyOrdered; i++) {
            totalcost = totalcost + itemlist[i].getCost();
        }
        return totalcost;
    }

    // Hien thi thong tin cac san pham trong gio hang
    public void hienthi() {
        System.out.println("Gio hang co " + qtyOrdered + " san pham");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemlist[i].getTitle() + "   ID : " + itemlist[i].getId());
        }
    }


    // Xoa san pham tu gio hang
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        if (qtyOrdered == 0) {
            System.out.println("Gio hang chua co gi , khong the xoa");
        } else {
            // Cap nhat gio hang sau khi xoa san pham
            for (int c = i = 0; i < qtyOrdered; i++) {
                if (!itemlist[i].equals(disc)) {
                    itemlist[c] = itemlist[i];
                    c++;
                }
            }
            System.out.println("San pham " + disc.getTitle() + " da duoc xoa");
            qtyOrdered--;
            totalcost = 0;
        }

    }

    // Nhap vao ten san pham can xoa , neu ton tai -> removeDigitalVideoDisc
    public void remove(String name) {
        int check = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (name.equals(itemlist[i].getTitle())) {
                removeDigitalVideoDisc(itemlist[i]);
                check = 1;
                break;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");               // Neu khong ton tai -> in ra man hinh
        }
    }

// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.cart.Cart Class
// hust.soict.dsai.cart.Cart.java
//                                              LAB03

    //  2.1  Overloading by differing types of parameter
//  Them vao gio hang voi tham so dau vao la mot mang cac dvds
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdlist) {
        if (qtyOrdered >= 0 && qtyOrdered < 20) {                           // So san pham toi da = 20
            for (int i = 0; i < dvdlist.length; i++) {
                itemlist[qtyOrdered] = dvdlist[i];
                qtyOrdered++;
                System.out.println("San pham " + dvdlist[i].getTitle() + " da duoc them vao");
            }
            totalcost = 0;
        } else {
            System.out.println("Gio hang da day");                  // qtyOrdered = 20 => Gio hang da day
        }
    }


//  2.2  Overloading by differing the number of parameters
//  Them vao gio hang voi tham so dau vao la 2 dvds

    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered >= 0 && qtyOrdered < 20) {                            // So san pham toi da = 20
            itemlist[qtyOrdered] = disc1;
            qtyOrdered++;
            System.out.println("San pham " + disc1.getTitle() + " da duoc them vao");
            itemlist[qtyOrdered] = disc2;
            qtyOrdered++;
            System.out.println("San pham " + disc2.getTitle() + " da duoc them vao");
            totalcost = 0;
        } else {
            System.out.println("Gio hang da day");                  // qtyOrdered = 20 => Gio hang da day
        }
    }


//  Them vao gio hang voi so luong dvd bat ki

    public void addDigitalVideoDisc(int k) {                        // k la so luong san pham them vao
        Scanner sc = new Scanner(System.in);
        DigitalVideoDisc[] dvdlist = new DigitalVideoDisc[k];
        if (qtyOrdered >= 0 && qtyOrdered < 20) {                           // So san pham toi da = 20
            for (int i = 0; i < k; i++) {
                System.out.println("Nhap vao ten DVD"+(i+1) + " :");
                String s = sc.nextLine();
                DigitalVideoDisc dvd = new DigitalVideoDisc(s);
                itemlist[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println("San pham " + dvd.getTitle() + " da duoc them vao");
            }
            totalcost = 0;
        } else {
            System.out.println("Gio hang da day");                  // qtyOrdered = 20 => Gio hang da day
        }
    }




 // 6.  Create a new method to print the list of ordered items of a cart, the price of each item, and the total price

    public void print() {
        System.out.println("**********************************CART**********************************");
        System.out.println("Ordered Items : ");
        for (int i = 0 ; i < qtyOrdered ; i ++ ) {
            System.out.println((i+1)+". "+itemlist[i].toString());
        }
        System.out.println("Total cost: " + totalCost() );
        System.out.println("************************************************************************");
    }



// Search by ID
    public void searchbyID(int id) {
        int check = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (id == (itemlist[i].getId())) {                      // Neu ton tai -> Print
                check = 1;
                System.out.println("Ket qua phu hop :");
                System.out.println("ID: "+itemlist[i].getId() + "    " + itemlist[i].toString());
                break;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");               // Neu khong ton tai -> in ra man hinh
        }
    }



// Search by Title
    public void searchbyTitle () {
        int check = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao title : ") ;
        String s = sc.nextLine();
        for(int i = 0 ; i < qtyOrdered ; i++ ) {
            if(itemlist[i].isMatch(s)){
                check = 1;
                System.out.println("Ket qua phu hop :");
                System.out.println("ID: "+itemlist[i].getId() + "    " + itemlist[i].toString());
                break;
            }
        }
        if (check == 0) {
            System.out.println("Khong tim thay");               // Neu khong ton tai -> in ra man hinh
        }
    }












}