package Methodoverriding;

public class S2 extends S1 
{
	public void pom(int a,String b)
	{
		System.out.println("1 int args and 1 string argu pom method in S2 class");
	}
	
	public void pom(float f)
	{
		System.out.println("1 float pom method in S2 class");
	}
	
	public void pom()
	{
		System.out.println("page object model");
	}

	public static void main(String[] args) 
	{
		//we call non static to static with the help of obj creation
		
		S2 s=new S2();
		s.pom();
		s.pom(100);
		s.pom(28.869f);
		s.pom(5000, "charu");
		
		

	}

}
