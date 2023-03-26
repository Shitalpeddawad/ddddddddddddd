package Constructor;

public class Prog2 extends Pro1 
{


	public Prog2() 
	{
		this(100);
		System.out.println("0 args cons in prog2 class");
	}

	public Prog2(int a) 
	{
		
		System.out.println("1 int args cons in prog2 class");
	}

	public static void main(String[] args) 
	{

		Pro1 obj = new Pro1("testng");
}
}
