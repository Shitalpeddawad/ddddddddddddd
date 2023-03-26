package MethodOverloading;

public class Staticmethod 
{
	public static void run() 
	{
		System.out.println("static method");
	}

	public static void display(int a) 
	{
		System.out.println("1 int  args static " + a);
	}

	public static void execute(int a, String b) 
	{
		System.out.println("1 int and 1 String  args static " + a + b);
	}

	public static void perform(String b, int a) 
	{
		System.out.println("1 string and 1 int  args static " + a + b);
	}


	public static void main(String[] args) 
	{
		Staticmethod.run();
		Staticmethod.display(100);
		Staticmethod.execute(10, "selenium");
		Staticmethod.perform("pom", 100);


	}

}
