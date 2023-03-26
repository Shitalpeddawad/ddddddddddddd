package keyword;

public class Shital
{
String a="parent class global Variable";
	
	public void m1()
	{
		String a="parent class local variable";
		
		System.out.println(a);
		
		System.out.println(this.a);
		
		System.out.println("parent class m1 method ");
	}

}



