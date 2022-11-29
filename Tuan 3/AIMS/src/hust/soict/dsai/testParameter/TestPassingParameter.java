package hust.soict.dsai.testParameter;
// Lab03
// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.testParameter.TestPassingParameter Class
// hust.soict.dsai.testParameter.TestPassingParameter.java


//  3. Passing Parameter

import hust.soict.dsai.disc.DigitalVideoDisc;

public class TestPassingParameter {


//    public static void swap(Object o1, Object o2) {
//        Object tmp = o1;
//        o1 = o2;
//       o2 = tmp;
//      }


    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Jungle DVD title : " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title : " + cinderellaDVD.getTitle());


        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle DVD title : " + jungleDVD.getTitle());
    }


// Please write a swap() method that can correctly swap the two objects.

    public static void swap(Object o1, Object o2) {
        if ((o1 instanceof DigitalVideoDisc) && (o2 instanceof DigitalVideoDisc)) {                         // Tao 2 doi tuong d1 , d2 = o1,o2 neu o1 va o2 la 2 doi tuong cua DigitalVideoDisc
            DigitalVideoDisc d1 = (DigitalVideoDisc) o1;
            DigitalVideoDisc d2 = (DigitalVideoDisc) o2;
            DigitalVideoDisc d3 = new DigitalVideoDisc(d1.getTitle(), d1.getCategory(),d1.getDirectory(),d1.getLength(),d1.getCost());      // Tao dvd d3 = d1
            d1.swaptwoObj(d2);                                                                              // Swap d1 = d2;
            d2.swaptwoObj(d3);                                                                              // Swap d2 = d3 = d1;
        }
    }
}