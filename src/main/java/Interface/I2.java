package Interface;

public class I2 extends I1 
{

	 public void m1()
	    {
	    	System.out.println("m1 in I2");
	    }
	    
	    public void xyz()
	    {
	    	System.out.println("xyz in I2");
	    }
	    
	    public void m2()
	    {
	    	System.out.println("m2 in I2");
	    }
	    
	    public void lmn()
	    {
	    	System.out.println("lmn in I2");
	    }
	    
	    @Override
		public void pqr() 
		{
			System.out.println("pqr in I2");
		}
	    
	    public static void main(String[] args) 
	    { 
	    	I2 i =new I2();
	    	i.abc();
	    	i.pqr();
	    	i.lmn();
	    	i.pqr();
	    	i.m1();
	    	i.m2();
	    	i.xyz();
	    	
	    	I1 i1=new I2();
	    	i1.abc();
	    	i1.lmn();
	    	i1.pqr();
	    	
	    	
	    	
		}

		
}
