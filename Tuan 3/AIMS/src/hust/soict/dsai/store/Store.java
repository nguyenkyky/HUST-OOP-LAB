package hust.soict.dsai.store;// Lab03
// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// hust.soict.dsai.store.Store Class
// hust.soict.dsai.store.Store.java


import hust.soict.dsai.disc.DigitalVideoDisc;

import java.util.ArrayList;


public class Store {
        private ArrayList<DigitalVideoDisc> itemInStore;                        // Khoi tao 1 mang Item in hust.soict.dsai.store.Store


        public Store () {
            itemInStore = new ArrayList<DigitalVideoDisc>();
        }

        public void addDVD (DigitalVideoDisc dvd) {                             // Add Item to hust.soict.dsai.store.Store
            itemInStore.add(dvd);
        }

        public void removeDVD (DigitalVideoDisc dvd) {                          // Remove Item from hust.soict.dsai.store.Store
            itemInStore.remove(dvd);
        }

        public void printStore () {                                             // Print hust.soict.dsai.store.Store
            for(DigitalVideoDisc dvd:itemInStore) {
                System.out.println(dvd.toString());
            }
        }
}
