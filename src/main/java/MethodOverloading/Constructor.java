package MethodOverloading;

public class Constructor 
{
	//constructor is a non static memeber used to create the non static intializtion
	//constructor support only non static method
	//same name is classname as constructor name
	public Constructor() 
	
	{
		System.out.println("0 args cons");
	}
	
	public Constructor(int a)
	{
		System.out.println("1 int args cons");
	}
	
	public Constructor(String a)
	{
		System.out.println("1 String args cons");
	}
	
	public Constructor(int a,int b)
	{
		System.out.println("2 int args cons");
	}
	
	public static void main(String[] args)
	{
		
		Constructor obj =new Constructor("shital");
		
		

	}

	
}
