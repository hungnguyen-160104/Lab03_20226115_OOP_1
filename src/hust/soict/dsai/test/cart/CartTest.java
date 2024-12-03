package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        // Tạo giỏ hàng mới
        Cart cart = new Cart();

        // Tạo ba DVD mới
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f); // sửa ở đây

        // Thêm DVD vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // In nội dung giỏ hàng
        cart.print();

        // Tìm kiếm theo ID
        System.out.println("\nSearch by ID (2):");
        cart.searchById(2);

        System.out.println("\nSearch by ID (5):");
        cart.searchById(5);

        // Tìm kiếm theo tiêu đề
        System.out.println("\nSearch by Title ('Star Wars'): ");
        cart.searchByTitle("Star Wars");

        System.out.println("\nSearch by Title ('Frozen'): ");
        cart.searchByTitle("Frozen");
    }
}
