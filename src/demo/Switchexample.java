package demo;

public class Switchexample {

	public static void main(String[] args) {
		char grade='E';
		switch(grade) {
		case'A' : 
			System.out.println("Excellent");
			break;
		case 'E':   //JUST EXECUTES BELOW BECZ THERE IS NO BREAK
		case 'B' : 
			System.out.println("Good"); 
			break;
		case 'C' : 
			System.out.println("OK");
			break;
		default:
			System.out.println("sorry");
			
		}
		System.out.println("your grade "+grade);
	}

}
