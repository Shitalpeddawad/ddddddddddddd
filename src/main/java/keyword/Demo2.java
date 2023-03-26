package keyword;

public class Demo2 extends Demo1 
{

int a=333;
	
	public void abc()
	{
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
	}
	
	public void xyz()
	{
		System.out.println(super.a);
		System.out.println(this.a);
		this.abc();
		super.abc();
		System.out.println("xyz method in Sample2 class");
		
	}
	
	public static void main(String[] args) {
		
		Demo1 obj =new Demo1();
		obj.xyz();
		
		
	}
	
}
	

