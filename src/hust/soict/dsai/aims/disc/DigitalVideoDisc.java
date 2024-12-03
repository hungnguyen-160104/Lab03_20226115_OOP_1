package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {  
    // Instance variables
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Class variable to track the total number of DVDs created
    private static int nbDigitalVideoDiscs = 0;

    // Instance variable to store unique ID for each DVD
    private int id;

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    // Constructors
    public DigitalVideoDisc(String title) {
        this.title = title;
        incrementId();
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        incrementId();
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        incrementId();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        incrementId();
    }

    // Increment ID for each new DVD created
    private void incrementId() {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Match title
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }

    // toString method for easy representation of DVD
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }
}
