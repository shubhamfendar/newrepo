public class Welcome{
	
	public static void main(String args[]) {
		//sayHello();
		System.out.println("In main method");
		//sayHello();
		
		//sayHi("Shivam");  // calling methods
		//sayHi("Ajay");
		
		//String msg = sayBye();
		//System.out.println(msg);
		
		String msg2 = sayGoodBye("Amol");
		System.out.println(msg2);
	}
	
	static String sayGoodBye(String name){
		return "Good Bye " + name;
	}
	
	static String sayBye(){
		
		return "Bye bye";
	}
	
	// Method 
	// name : sayHello
	// Arguments : nothing
	// Returns : void (nothing)
	static void sayHello(){
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("Program");
	}
	
	// Method 
	// name : sayHi
	// Arguments : String
	// Returns : void (nothing)
	static void sayHi(String name){
		System.out.println("Hello " + name );
	}
	
}





