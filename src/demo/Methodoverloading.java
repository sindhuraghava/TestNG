package demo;

public class Methodoverloading {
	public void add(int a, int b) {
		int result = a+b;
		System.out.println("result of 2 is"+result);
	}
	public void add(int a, int b,int c) {
		int result = a+b+c;
		System.out.println("result of 2 is"+result);
	}
	public void add(double a, double b) {
		double result = a+b;
		System.out.println("result of 2 is"+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading Obj = new Methodoverloading();
		Obj.add(2, 8);
		Obj.add(2, 8, 9);
		Obj.add(12.9,98);
	}

}
