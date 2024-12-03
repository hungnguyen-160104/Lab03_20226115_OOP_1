package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        try {
            File file = new File("path/to/your/large-text-file.txt"); // Đổi đường dẫn file lớn.
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            StringBuilder content = new StringBuilder();
            long start = System.currentTimeMillis();
            for (byte b : data) {
                content.append((char) b); // Sử dụng StringBuilder để nối chuỗi.
            }
            System.out.println("Time with StringBuilder: " + (System.currentTimeMillis() - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
