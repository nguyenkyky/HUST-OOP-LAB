// Họ tên : Nguyễn Cao Kỳ
// MSSV   : 20204995
// Other Projects
// hust.soict.dsai.garbage pakage
// ConcatenationInLoops Class
// ConcatenationInLoops.java


package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String [] args) {
        Random r = new Random(  123);                           // Khoi tao bien Random r
        long start = System.currentTimeMillis();
        String s = "";
        for (int  i = 0 ; i < 65536 ; i++) {
            s +=    r.nextInt(2);                              // Tao ra 1 so ngau nhien (0,1) va + s;
        }
        System.out.println(System.currentTimeMillis()-start);           // Tinh thoi gian chuong trinh chay



        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<65536; i++) {
            sb.append(r.nextInt(2));                            // Tao ra 1 so ngau nhien (0,1) va noi vao sb
        }
        s = sb.toString();
        System.out.println(System.currentTimeMillis()-start);           // Tinh thoi gian
    }
}
