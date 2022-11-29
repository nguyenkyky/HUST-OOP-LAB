// Họ tên : Nguyễn Cao Kỳ
// MSSV   : 20204995
// Other Projects
// hust.soict.dsai.garbage pakage
// NoGarbage Class
// NoGarbage.java


package hust.soict.dsai.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String [] args) throws IOException {
        String filename = "/Users/kyz/Desktop/Aims copy.txt";                       // Duong dan file
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));                       // Doc toan bo file
        startTime = System.currentTimeMillis();                                     // Khoi tao thoi gian bat dau
        String outputString = "";
        StringBuffer sb = new StringBuffer() ;
        for (byte b : inputBytes) {
            sb.append((char)b);                                                     // Noi tung byte doc duoc vao sb
        }
        outputString = sb.toString();                                               // sb to String

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);                                    // Tinh thoi gian
    }
}
