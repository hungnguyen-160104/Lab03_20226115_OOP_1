package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        // Trước khi hoán đổi
        System.out.println("Before swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Thực hiện hoán đổi
        swap(jungleDVD, cinderellaDVD);

        // Sau khi hoán đổi
        System.out.println("\nAfter swap:");
        System.out.println("Jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("Cinderella DVD title: " + cinderellaDVD.getTitle());

        // Thay đổi tiêu đề
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("\nAfter changeTitle:");
        System.out.println("Jungle DVD title after change: " + jungleDVD.getTitle());
    }

    // Hoán đổi tiêu đề hai DVD
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmpTitle = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmpTitle);
    }

    // Thay đổi tiêu đề của một DVD
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd.setTitle(title);
    }
}
