// Họ tên : Nguyễn Cao Kỳ
// MSSV   : 20204995
// Other Projects
// hust.soict.dsai.garbage pakage
// GarbageCreator Class
// GarbageCreator.java



package hust.soict.dsai.garbage;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String [] args) throws IOException {
        String filename = "/Users/kyz/Desktop/Aims copy.txt";                   // Duong dan file
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));                   // Doc toan bo file
        startTime = System.currentTimeMillis();                                 // Khoi tao thoi gian bat dau
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;                                            // Cong tung byte doc duoc vao outputString

        }

        endTime = System.currentTimeMillis();                                   // Thoi gian ket thuc
        System.out.println(endTime - startTime);                                // Tinh thoi gian
    }
}
