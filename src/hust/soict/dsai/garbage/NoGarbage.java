package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        // Thay đường dẫn này bằng đường dẫn chính xác tới file của bạn
        String filePath = "C:\\Users\\YourUsername\\Documents\\large-text-file.txt";

        File file = new File(filePath);

        // Kiểm tra xem file có tồn tại không
        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            byte[] data = new byte[(int) file.length()];
            fis.read(data);

            StringBuilder content = new StringBuilder();
            long start = System.currentTimeMillis();
            for (byte b : data) {
                content.append((char) b); // Sử dụng StringBuilder để nối chuỗi.
            }
            System.out.println("Time with StringBuilder: " + (System.currentTimeMillis() - start) + " ms");
//hihi
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
