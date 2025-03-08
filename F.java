package basic;

public class F  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
	int a=1/0;
}
catch(ArithmeticException a) {
	System.out.println("catched error");
}
	finally {
		System.out.println("finally block");
	}
	}

}
