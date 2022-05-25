package booking;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking b1 = new Booking();
		//Booking b2 = new Booking();
		//Booking b3 = new Booking();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		t1.setName("slp_936");
		t2.setName("slp_957");
		t3.setName("slp_938");
		t1.start();
		t2.start();
		t3.start();
	}

}
