package Constructor;

public class Reddy extends Shital
{
	public Reddy()
	{   
		System.out.println("0 argu in reddy class");
	}
	
	public Reddy(float d)
	{   this();
		System.out.println("float argu in reddy class");
	}
	
	public Reddy( int a,String b)
	{  
		System.out.println("1 int argu and 1 string argu in reddy class");
	}

	public static void main(String[] args) 
	{
         Reddy r=new Reddy(10.35f);
         
         
	}

}
