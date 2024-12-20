package hust.soict.dsai.aimss;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f); // sửa tại đây

        // Thêm từng DVD vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        // Thêm mảng DVD vào giỏ hàng
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList);

        // Thêm 2 DVD cùng lúc
        anOrder.addDigitalVideoDisc(dvd2, dvd3);

        // In tổng chi phí
        System.out.println("Total Cost is: " + anOrder.totalCost());

        // In nội dung giỏ hàng
        anOrder.print();

        // Tìm kiếm theo ID
        anOrder.searchById(1);

        // Tìm kiếm theo tiêu đề
        anOrder.searchByTitle("Star Wars");
    }
}
