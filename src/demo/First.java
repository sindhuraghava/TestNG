package demo;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new First();   garbage value as no reference variable is there
		 First t = new First();  //synatx of objcet creation where t is referemce varoable and First is data type which is class; new says it is a new object
		// String s = "java" + " PROGRAM";  /// STRING CONCAT              
		// System.out.println(s);
		// callimg method
		
		System.out.println(t.sum(3, 5));
		// t.sum(4, 5); calling the method  
		
	}      
	// method declaration
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		
			int z = x+y; // local vriable        
			return z;
	}

} 
