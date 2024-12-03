package hust.soict.dsai.garbage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class GarbageCreator {
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

            String content = "";
            long start = System.currentTimeMillis();
            for (byte b : data) {
                content += (char) b; // Sử dụng toán tử + tạo "garbage".
            }
            System.out.println("Time with + operator: " + (System.currentTimeMillis() - start) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
