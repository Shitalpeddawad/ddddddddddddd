package Constructor;

public class Cons1 
{
String a="SoftTech";
	
	public Cons1()
	{
		
		int a=500;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println("0 args cons");
	}
	
	public Cons1(int b)
	{
		this();
		System.out.println(a);
		System.out.println("1 int args cons ");		
	}

	public static void main(String[] args) 
	{
		Cons1 c=new Cons1(100);

	}

}
