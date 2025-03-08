package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Arraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="kv bangalore";
String str2="kv bangalore ";

char[] c1=str1.toCharArray();
char[] c2=str2.toCharArray();
boolean bothStringEqual=Arrays.equals(c1, c2);
if(bothStringEqual) {
	System.out.println("both string array are equal");
}
else {
	System.out.println("arrays are not equal");
}
	
	
	}

}
