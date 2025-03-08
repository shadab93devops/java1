package basic;

public class SIB {

	
	static {
		System.out.println("static block");
	}
	
	static{
		System.out.println("static block");
	}
	
	{
		System.out.println("non static block 1");
	}
	
	
	{
		
		
		System.out.println("non static block 2");
	}
	
	{
		System.out.println("non static block 3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		SIB obj=new SIB();
		
	}

}
