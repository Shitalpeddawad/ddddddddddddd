package Constructor;

public class Sample5 extends Demo5
{
	public Sample5()
	{

     super(100);
	System.out.println("0 args cons in Sample 5 class");
}

public Sample5(int a)
{
	this();
	System.out.println("1 int args cons in Sample 5 class");
}


public static void main(String[] args) {
	
	Sample5 obj =new Sample5(100);
	

	

}
}
