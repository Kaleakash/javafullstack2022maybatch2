package xyz;

public class SecondThread implements Runnable{

	@Override
	public void run() {
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
