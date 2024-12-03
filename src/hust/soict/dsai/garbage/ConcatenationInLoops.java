package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);

        // Sử dụng String với toán tử +
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("Time with String (+ operator): " + (System.currentTimeMillis() - start) + " ms");

        // Sử dụng StringBuilder
        r = new Random(123);
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Time with StringBuilder: " + (System.currentTimeMillis() - start) + " ms");

        // Sử dụng StringBuffer
        r = new Random(123);
        StringBuffer sbf = new StringBuffer();
        start = System.currentTimeMillis();
        for (int i = 0; i < 65536; i++) {
            sbf.append(r.nextInt(2));
        }
        s = sbf.toString();
        System.out.println("Time with StringBuffer: " + (System.currentTimeMillis() - start) + " ms");
    }
}
