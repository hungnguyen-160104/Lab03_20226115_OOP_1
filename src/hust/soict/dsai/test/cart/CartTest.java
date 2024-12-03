package hust.soict.dsai.test.cart;

public class CartTest {
    public static void main(String[] args) {
        // Create a new shopping cart
        Cart cart = new Cart();

        // Create three new digital video discs (DVDs)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Add DVDs to the shopping cart
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);

        // Print the cart
        cart.print();

        // Search by ID
        System.out.println("\nSearch by ID (2):");
        cart.searchById(2);

        System.out.println("\nSearch by ID (5):");
        cart.searchById(5);

        // Search by Title
        System.out.println("\nSearch by Title ('Star Wars'):");
        cart.searchByTitle("Star Wars");

        System.out.println("\nSearch by Title ('Frozen'):");
        cart.searchByTitle("Frozen");
    }
}