package basic;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="marry1234";
		
		int alphaCount=0;
		
		char[] c=input.toCharArray();
		
		
		for(int i=0;i<input.length();i++) {
			
		boolean isAlphabetic=	Character.isAlphabetic(c[i]);
		if(isAlphabetic) {
			alphaCount++;
		}
		}
		
		
		
		System.out.println("count of aplabetic from string "+ input +" : "+ alphaCount);
	}

}
