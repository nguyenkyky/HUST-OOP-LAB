// Ho ten : Nguyen Cao Ky
// MSSV   : 20204995
// AIMS Project
// Aims Class
// Aims.java


public class Aims {
    public static void main(String[] args) {
        // Khoi tao gio hang
        Cart anOrder = new Cart() ;

        //Them 3 san pham dia DVD vao gio hang
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King" , "Animation" , "Roger", 87 , 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War" , "Science Fiction" , "George", 87 , 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin" , "Animation" , 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);


        // Hien thi ra man hinh thong tin tat ca cac san pham trong gio hang
        anOrder.hienthi();

        // Tinh tong gia tri cac mat hang
        System.out.println("Total Cost Is : " + anOrder.totalCost());


        // Xoa san pham co ten la : Aladin
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.remove("The Lion King");
        anOrder.hienthi();

        // Tinh tong gia tri cac mat hang sau khi cap nhat
        System.out.println("Total Cost Is : " + anOrder.totalCost());


        // Them 1 san pham co ten la : Ky Nguyen
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Ky Nguyenn" , "Animation" , 30.00f);
        anOrder.addDigitalVideoDisc(dvd4);

        // Hien thi ra man hinh thong tin tat ca cac san pham trong gio hang sau khi da cap nhat
        anOrder.hienthi();

        // Tinh tong gia tri cac mat hang sau khi cap nhat
        System.out.println("Total Cost Is : " + anOrder.totalCost());
    }
}