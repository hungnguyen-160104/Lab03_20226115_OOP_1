package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
  public static void main(String[] args) {
      // Create two DigitalVideoDisc objects
      DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
      DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

      // Print titles before swap
      System.out.println("Before swap:");
      System.out.println("jungle dvd title: " + jungleDVD.getTitle());
      System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

      // Call swap method
      swap(jungleDVD, cinderellaDVD);

      // Print titles after swap
      System.out.println("\nAfter swap:");
      System.out.println("jungle dvd title: " + jungleDVD.getTitle());
      System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

      // Call changeTitle method
      changeTitle(jungleDVD, cinderellaDVD.getTitle());

      // Print title of jungleDVD after changeTitle
      System.out.println("\nAfter changeTitle:");
      System.out.println("jungle dvd title after change: " + jungleDVD.getTitle());
  }

  // Method to swap the titles of two DVDs
  public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
      String tmpTitle = dvd1.getTitle();
      dvd1.setTitle(dvd2.getTitle());
      dvd2.setTitle(tmpTitle);
  }

  // Method to change the title of a DVD
  public static void changeTitle(DigitalVideoDisc dvd, String title) {
      dvd.setTitle(title); 
  }
}