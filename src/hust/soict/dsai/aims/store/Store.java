package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> dvdList = new ArrayList<>();

    // Thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        dvdList.add(dvd);
        System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
    }

    // Xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (dvdList.contains(dvd)) {
            dvdList.remove(dvd);
            System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The DVD \"" + dvd.getTitle() + "\" is not found in the store.");
        }
    }

    // Hiển thị danh sách DVD trong cửa hàng
    public void displayStore() {
        System.out.println("************** STORE INVENTORY **************");
        for (DigitalVideoDisc dvd : dvdList) {
            System.out.println(dvd);
        }
        System.out.println("**********************************************");
    }
}
