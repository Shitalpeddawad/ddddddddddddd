package Abstractmethodoverriding;


public  class A2 extends A1
{
	
	
		

		
		public void abc() 
		{
			System.out.println("abc method A2 class");
			
		}

		
		public void xyz() 
		{
			System.out.println("Xyz method A2 class");

		}

		public void display()
		{
			System.out.println("Display method in A2 class");
		}
		
		

	public static void main(String[] args) 
	{
		A1 obj =new A2();
		obj.abc();
		obj.pqr();
		obj.xyz();	
	}

}
