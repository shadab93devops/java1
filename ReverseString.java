package basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nam="shadab";




String reverse="";


for(int i=nam.length()-1;i>=0;i--) {
	char c=nam.charAt(i);
	
	reverse=reverse+c;
	
}

	System.out.println("reverse string is :" + reverse);
	
	
	}

}
