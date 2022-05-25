package abc;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread tf1 = new FirstThread();	// thread are created..
		SecondThread tf2 = new SecondThread();
		tf1.start();
		tf1.start();
		tf2.start();  // thread is ready to run 
	}

}
