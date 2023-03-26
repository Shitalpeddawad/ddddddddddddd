package Exception;

public class E7 {

	public static void main(String[] args) 
	{
		System.out.println("main method is started");//1

		String [] abc =new String[4];
		
		abc[0]="shital";
		abc[1]="swapnil";
		abc[2]="shilpa";
		abc[3]="suraj";
		try
		{
			System.out.println("try block is started");
			//abc[4]="charu";
			//System.out.println(abc[1]);
			System.out.println(abc[1]);
			System.out.println("try block is ended");
		}
		catch(Exception e)
		{
			System.out.println("catch block of code");
		}
		finally 
		{
			System.out.println("finaly block of code ");
		}
		

	
		System.out.println("main method is ended");

	}

		
	}


