package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
  private static final int MAX_ITEMS_IN_STORE = 50; // Maximum number of DVDs in the store
  private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
  private int qtyInStore = 0;

  // Add a DVD to the store
  public void addDVD(DigitalVideoDisc dvd) {
      if (qtyInStore < MAX_ITEMS_IN_STORE) {
          itemsInStore[qtyInStore] = dvd;
          qtyInStore++;
          System.out.println("The DVD \"" + dvd.getTitle() + "\" has been added to the store.");
      } else {
          System.out.println("The store is full. Cannot add more DVDs.");
      }
  }

  // Remove a DVD from the store
  public void removeDVD(DigitalVideoDisc dvd) {
      boolean found = false;
      for (int i = 0; i < qtyInStore; i++) {
          if (itemsInStore[i].equals(dvd)) {
              found = true;

              // Shift items to remove the gap
              for (int j = i; j < qtyInStore - 1; j++) {
                  itemsInStore[j] = itemsInStore[j + 1];
              }
              itemsInStore[qtyInStore - 1] = null;
              qtyInStore--;
              System.out.println("The DVD \"" + dvd.getTitle() + "\" has been removed from the store.");
              break;
          }
      }
      if (!found) {
          System.out.println("The DVD \"" + dvd.getTitle() + "\" was not found in the store.");
      }
  }

  // Display the DVDs in the store
  public void displayStore() {
      System.out.println("***********************STORE***********************");
      if (qtyInStore == 0) {
          System.out.println("The store is currently empty.");
      } else {
          for (int i = 0; i < qtyInStore; i++) {
              System.out.println((i + 1) + ". " + itemsInStore[i]);
          }
      }
      System.out.println("***************************************************");
  }
}