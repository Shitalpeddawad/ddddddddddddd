package Constructor;

public class Cons 
{

	public Cons()
	{
		System.out.println("0  arguments cons");
	}
	
	
	public Cons(int a)
	{
		this();
		System.out.println("1 int arguments cons");
	}
	
	
	public Cons(String a)
	{
		this(100);
		System.out.println("1 String arguments cons");
	}
	
public static void main(String[] args) {
		
		Cons c =new Cons("pom");
		
	}
	
	
	
}
