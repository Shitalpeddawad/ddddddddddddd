package MethodOverloading;

public class Methodoverload 
{
	
	public static void latur()
	{
		System.out.println("Hello latur");
	}
	
	public  void latur(int a)
	{
		System.out.println("pass 1 int argu");
	}
	
	public static void latur(int a,String b)
	{
		System.out.println("pass 1 int argu and 1 string argu");
	}
	
	public static void latur(String a,int b)
	{
		System.out.println("pass 1 string argu and 1 int argu");
	}
	
	public void latur(boolean b)
	{
		System.out.println("pass 1 boolean argu");
	}

	public static void main(String[] args) 
	{
		Methodoverload load=new Methodoverload();
		Methodoverload.latur();
		load.latur(100);
		Methodoverload.latur(50, "shital");
		Methodoverload.latur("pranshu", 50000);
		load.latur(true);
		

	}

}
