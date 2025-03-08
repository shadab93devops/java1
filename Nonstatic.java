package basic;

public class Nonstatic {

	Nonstatic(){
		System.out.println("constructor");
	}
	
	{
		System.out.println("non static block 1");
	}
	
	{

		System.out.println("non static block 2");
	}
	
	
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatic obj=new Nonstatic();
		
		Nonstatic obj1=new Nonstatic();
	}

}
