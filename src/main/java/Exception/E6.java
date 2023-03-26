package Exception;

public class E6 {

	public static void main(String[] args) 
	{
		System.out.println("main method is started");

		String a = "peddawad";

		try 
		{
			System.out.println("try block is started");
		
			System.out.println(a);
			System.out.println("try Block ended");
		} 
		catch (Exception e)
		{
			System.out.println("Catch Block");
		}
		finally 
		{
			System.out.println("finally block of code");
		}
		

		System.out.println("main method is ended");

	}

}

	


