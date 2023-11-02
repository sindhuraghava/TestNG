package demo;

public class InheriChild extends InheriSuper{
	int bonus = 10000;
	public static void main(String[] args) {
		InheriChild Obj = new InheriChild();
		System.out.println(Obj.salary);
		System.out.println(Obj.bonus);
		System.out.println(Obj.name);
	}

}
