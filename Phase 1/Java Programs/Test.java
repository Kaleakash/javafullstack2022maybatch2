class Test {
	public static void main(String args[]) {
	int abc[];				// size not created 
	int num[]={10,20,30,40,50,60,100,200,250,160};		// memory size created. base upon the value assign 
	System.out.println("Value of 0 position is "+num[0]);
	System.out.println("Value of 1 position is "+num[1]);
	System.out.println("Display the value from array using index position ");
	System.out.println("Size of the array is "+num.length);
	for(int i=0;i<num.length;i++) {
		System.out.println("Value is "+num[i]);
	}
	System.out.println("Retreive elements one by one using enhanced loop");
	for(int n : num ) {
		System.out.println("Vallue is "+n);
	}
	}
}