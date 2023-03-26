package MethodOverloading;

public class Privatemethod 
{
	private static void run() 
	{
		System.out.println("static method");
	}

	private static void display(int a) 
	{
		System.out.println("1 int  args static " + a);
	}

	private static void execute(int a, String b) 
	{
		System.out.println("1 int and 1 String  args static " + a + b);
	}

	private static void perform(String b, int a) 
	{
		System.out.println("1 string and 1 int  args static " + a + b);
	}


	

	public static void main(String[] args)
	{
		Privatemethod.run();
		Privatemethod.display(100);
		Privatemethod.execute(10, "selenium");
		Privatemethod.perform("pom", 100);

	}

}
