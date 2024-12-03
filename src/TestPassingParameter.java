public class TestPassingParameter {
  public static void main(String[] args) {

      DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
      DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");


      System.out.println("Before swap:");
      System.out.println("jungle dvd title: " + jungleDVD.getTitle());
      System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

      swap(jungleDVD, cinderellaDVD);

      System.out.println("\nAfter swap:");
      System.out.println("jungle dvd title: " + jungleDVD.getTitle());
      System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());


      changeTitle(jungleDVD, cinderellaDVD.getTitle());



      changeTitle(jungleDVD, cinderellaDVD.getTitle());


      System.out.println("\nAfter changeTitle:");
      System.out.println("jungle dvd title after change: " + jungleDVD.getTitle());
  }


  public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
      String tmpTitle = dvd1.getTitle();
      dvd1.setTitle(dvd2.getTitle());
      dvd2.setTitle(tmpTitle);
  }


  public static void changeTitle(DigitalVideoDisc dvd, String title) {
      dvd.setTitle(title); 
  }
}

  public static void changeTitle(DigitalVideoDisc dvd, String title) {
      dvd.setTitle(title); 
  }
}



