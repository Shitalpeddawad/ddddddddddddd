package MethodOverloading;

public class Mainmethod 
{

	public static void main(int a)
	{
		System.out.println("1 int argument");
	}
	
	public static void main(String b)
	{
		System.out.println("1 string arguments");
	}
	
	
	public static void main(int[] a)
	{
		System.out.println("1 int array argument");
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main method");
	//we call static method in main method by using 3 ways:
		//standard way is by using classanme.methodname
		Mainmethod.main(100);
		
		Mainmethod.main("maven");
		
		int [] arr = {10,20,40};
		
		Mainmethod.main(arr);		
		
	}
}
