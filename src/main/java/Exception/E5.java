package Exception;

public class E5 {

	public static void main(String[] args) 
	{
		int a=100;
		int b=0;
		
		//line by line check the execution
		//if suppose in try block specfic line is not executed then 
		//remaining line will be skip and excute the catch block statemaent
		
		System.out.println("main method started");
		try
		{
			System.out.println("try block started");
			System.out.println(a/b);
			System.out.println("try block ended");
		}
		catch(Exception e)
		{
			System.out.println("executed catch block");
		}
		
		System.out.println("main method ended");
		

	}

}
