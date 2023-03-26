package keyword;

public class Suraj extends Shital
{

	String a="child class global variable";
	
	public void m1()
	{
		
		String a="child class local variable";
		System.out.println("Child class m1 method");
	}
	
	public void m2()
	{
		System.out.println(this.a);
		System.out.println(super.a);
		super.m1();
		this.m1();
		System.out.println("m2 method in Child class");
	}
	
	
	public static void main(String[] args) {
		
		Suraj obj =new Suraj();
		obj.m2();
	}

}
