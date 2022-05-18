class Car {
	int wheel;
	float price;
	String color;
	void displayInfo() {
		int temp=123;
		System.out.println("Wheel "+wheel);
		System.out.println("price "+price);
		System.out.println("color "+color);
		System.out.println("Temp "+temp);
	}
	void displayCarInfo() {
		String info="Welcome";
		System.out.println("Wheel "+wheel);
		System.out.println("price "+price);
		System.out.println("color "+color);
		System.out.println("Info "+info);
	}
}
class CarTest {
	public static void main(String args[]) {
	Car innova = new Car();
	innova.displayInfo();
	innova.displayCarInfo();
	}
}