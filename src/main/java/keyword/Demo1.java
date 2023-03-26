package keyword;

public class Demo1
{
	int a = 999;

	public void abc() 
	{
		//within the block of code.
		int a = 222;
		System.out.println(a);			
		System.out.println("abc method in  Demo2 class");
	}

	public void xyz()
	{

		this.abc();
		
		System.out.println(a);			

		System.out.println("xyz method in  Demo2 class");
	}

	public static void main(String[] args) {

		Demo1 obj =new Demo1();
		obj.xyz();
	
}
}
