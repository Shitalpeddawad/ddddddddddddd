package MethodOverloading;

public class Finalmethod 
{
	final void abc()
	{
		System.out.println("0 args final method");
	}

	
	final void abc(int a)
	{
		System.out.println("1 int args final method");
	}
	
	final void abc(String b)
	{
		System.out.println("1 String args final method");
	}
	
	public static void main(String[] args)
	{
     Finalmethod obj =new Finalmethod();
		
		obj.abc();
		obj.abc(1000);
		obj.abc("Selenium");
		
	}

}
