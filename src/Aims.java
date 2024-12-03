public class Aims {

    public static void main(String[] args) {
        Cart anOrder = new Cart();
        
        // Tạo các DVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);

        // Thêm từng DVD vào giỏ hàng
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);

        // Thêm mảng DVD vào giỏ hàng
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
        anOrder.addDigitalVideoDisc(dvdList);

        // Thêm 2 DVD cùng lúc
        anOrder.addDigitalVideoDisc(dvd2, dvd3);

        // In tổng chi phí
        System.out.println("Total Cost is: " + anOrder.totalCost());
    }
}

	public static void main(String[] args) {
	    Cart anOrder = new Cart();
	    //hihi
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
	                                             "Animation", "Roger Allers", 87, 19.95f);
	    anOrder.addDigitalVideoDisc(dvd1);
	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
	                                             "Science Fiction", "George Lucas", 87, 24.95f);
	    anOrder.addDigitalVideoDisc(dvd2);
	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin",
	                                             "Animation", 18.99f);
	    anOrder.addDigitalVideoDisc(dvd3);
	    System.out.println("Total Cost is: ");
	    System.out.println(anOrder.totalCost());
	}
}

