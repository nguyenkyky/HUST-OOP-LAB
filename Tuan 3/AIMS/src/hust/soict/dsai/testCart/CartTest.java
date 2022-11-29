package hust.soict.dsai.testCart;
// Lab03
// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.testCart.CartTest Class
// hust.soict.dsai.testCart.CartTest.java

import hust.soict.dsai.cart.*;

import hust.soict.dsai.disc.*;

public class CartTest {
    public static void main(String [] args) {
        Cart cart = new Cart () ;
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger", 87 , 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War" , "Science Fiction" , "George", 87 , 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation" , 18.99f);
        cart.addDigitalVideoDisc(dvd3);


        cart.print();

        cart.searchbyTitle();
    }
}
