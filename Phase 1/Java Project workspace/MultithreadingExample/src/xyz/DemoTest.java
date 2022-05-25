package xyz;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft1 = new FirstThread();
		SecondThread st2 = new SecondThread();
		//tf1.start();
		//tf2.start();
		
		Thread t1 = new Thread(ft1);
		Thread t2 = new Thread(st2);
		t1.start();
		t2.start();
	}

}
