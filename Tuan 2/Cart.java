// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// Cart Class
// Cart.java


public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private float totalcost = 0;
    private int qtyOrdered = 0;

    // Khoi tao 1 mang cac DVDs
    private DigitalVideoDisc itemlist[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];


    // Them 1 DVD vao gio hang
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered >= 0 && qtyOrdered < 20) {                    // So san pham toi da = 20
            itemlist[qtyOrdered] = disc;
            qtyOrdered++;
            totalcost = 0;
            System.out.println("San pham " + disc.getTitle() + " da duoc them vao");
        }
        else {
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
            System.out.println(itemlist[i].getTitle());
        }
    }


    // Xoa san pham tu gio hang
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        if(qtyOrdered == 0 ) {
            System.out.println("Gio hang chua co gi , khong the xoa");
        }
        else {
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
}