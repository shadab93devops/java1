package basic;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s="madam";
	String reverse="";
	
	
	for(int i=s.length()-1;i>=0;i--) {
		char c=s.charAt(i);
		reverse=reverse + c;
		
	}
	
	
	System.out.println(reverse);
	
	if(s.equals(reverse)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("it is not palindrome");
	}
		
		
		
		
		
		
	}

}
