package demo;

public class Instance_example {
	// this variable will be visible to any other class/subclass
	public String name;
	// this salary variable iss visible to instance examople
	private double salary;
	//name variable is assigned to constructor
	public Instance_example(String empname) {
		name = empname;
	}
	
	//assigning salary variable to method i.e., value here it is reused by other class
	public  void setSalary(double empSal) {
		 salary = empSal;
	}
	
	public void printEmp() {
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
	public static void main(String[] args) {
		Instance_example empobj = new Instance_example("sindhu");
		empobj.setSalary(10000.89);
		empobj.printEmp();
		
		
	
	}

} 
