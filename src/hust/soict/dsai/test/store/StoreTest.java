package hust.soict.dsai.test.store;

public class StoreTest {
	  public static void main(String[] args) {
	      // Create a store
	      Store store = new Store();

	      // Create some DVDs
	      DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
	      DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
	      DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

	      // Add DVDs to the store
	      store.addDVD(dvd1);
	      store.addDVD(dvd2);
	      store.addDVD(dvd3);

	      // Display store content...
	      System.out.println("\nStore inventory after adding DVDs:");
	      store.displayStore();

	      // Remove a DVD
	      store.removeDVD(dvd2);

	      // Display store content again
	      System.out.println("\nStore inventory after removing a DVD:");
	      store.displayStore();

	      // Attempt to remove a DVD not in the store
	      DigitalVideoDisc dvdNotInStore = new DigitalVideoDisc("Frozen");
	      store.removeDVD(dvdNotInStore);
	  }
	}