package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo cửa hàng
        Store store = new Store();

        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f); // sửa ở đây

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Hiển thị nội dung cửa hàng
        System.out.println("\nStore inventory after adding DVDs:");
        store.displayStore();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // Hiển thị lại nội dung cửa hàng
        System.out.println("\nStore inventory after removing a DVD:");
        store.displayStore();

        // Thử xóa DVD không tồn tại trong cửa hàng
        DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 102, 19.99f);
        store.removeDVD(dvdNotInStore);
    }
}
