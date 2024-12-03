public class DigitalVideoDisc { 

  private String title;
  private String category;
  private String director;
  private int length;
  private float cost;

  private static int nbDigitalVideoDiscs = 0;

  private int id;

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

  public float getCost() {
      return cost;
  }

  public int getId() {
      return id;
  }

  public static int getNbDigitalVideoDiscs() {
      return nbDigitalVideoDiscs;
  }

  public void setTitle(String title) {
      this.title = title;
  }

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

  private void incrementId() {
      nbDigitalVideoDiscs++;
      this.id = nbDigitalVideoDiscs;
  }

  public String toString() {
      return "DigitalVideoDisc [id=" + id + ", title=" + title 
          + ", category=" + category 
          + ", director=" + director 
          + ", length=" + length 
          + ", cost=" + cost + "]";
  }
}