package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    private static final int MAX_NUMBERS_ORDERED = 20; 
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // Thêm một DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
        } else {
            System.out.println("The cart is full. Cannot add \"" + disc.getTitle() + "\".");
        }
    }

    // Thêm mảng DVD
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    // Thêm 2 DVD
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Xóa DVD khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[--qtyOrdered] = null;
                System.out.println("The disc \"" + disc.getTitle() + "\" has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc \"" + disc.getTitle() + "\" was not found in the cart.");
        }
    }

    // Tính tổng chi phí
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // In nội dung giỏ hàng
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("**************************************************");
    }

    // Tìm kiếm theo ID
    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.getId() == id) {
                System.out.println("Found: " + disc);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No DVD with ID " + id + " found.");
        }
    }

    // Tìm kiếm theo tiêu đề
    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null && disc.isMatch(title)) {
                System.out.println("Found: " + disc);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD with title \"" + title + "\" found.");
        }
    }
}
