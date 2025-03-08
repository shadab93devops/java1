package basic;

public class A {

	public static void main(String[] args) {
String name="GeeksForGeeks";
name=name.toLowerCase();
		
	boolean result=isPanagram(name);	
		
		System.out.println(result);
		if(result) {
			System.out.println("it is panagram");
		}else {
			System.out.println("its not panagram");
		}
	}

	private static boolean isPanagram(String name) {
		// TODO Auto-generated method stub
		
		if(name.length()<26) {
			return false;
		}
		
		for(int i='a';i<='z';i++) {
			if(name.indexOf(i)<0) {
				return false;
			}
		}
		return true;
	}

}
