package demo;

public class Emp {

	
	// static variavle example which is proivate
	
	private static double salary;
	// final modifier starts in capital letter
	// department variable is copnstant
	public static final String DEPARTMENT = "Automation";
	public static void main(String[] args) {
		salary = 10000;
		System.out.println(DEPARTMENT+" aVERAGE SALARY : "+salary);
	}

}
