package keyword;

public class K2 extends K1
{

	int a=100;
	
	public void xyz()
	{
		int a=255;
		
		System.out.println(a);
		
		System.out.println(this.a);
		
		System.out.println(super.a);
	}
	

	public static void main(String[] args) 
	{
		
		K2 obj =new K2();
		obj.xyz();
		
		
	
}
}
