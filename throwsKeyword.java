package basic;

public class throwsKeyword {

	public static void main(String[] args) throws NullPointerException,ArithmeticException{
		// TODO Auto-generated method stub

		if(2<3) {
		throw new ArithmeticException();
		}
		else {
		throw new NullPointerException("sorry will fix it soon");
	}
	}

}
