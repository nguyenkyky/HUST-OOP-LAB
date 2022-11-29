package hust.soict.dsai.testStore;// Lab03
// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.testStore.StoreTest Class
// hust.soict.dsai.testStore.StoreTest.java


import hust.soict.dsai.disc.DigitalVideoDisc;
import hust.soict.dsai.store.Store;


public class StoreTest {
        public static void main (String [] args) {
            Store itemStore = new Store();
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger", 87 , 19.95f);
            itemStore.addDVD(dvd1);

            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War" , "Science Fiction" , "George", 87 , 24.95f);
            itemStore.addDVD(dvd2);

            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation" , 18.99f);
            itemStore.addDVD(dvd3);

            itemStore.printStore();

            itemStore.removeDVD(dvd2);

            System.out.println("\n\n After Remove \n\n");

            itemStore.printStore();

        }
}

