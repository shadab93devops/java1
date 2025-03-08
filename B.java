package basic;

import java.util.HashMap;

public class B  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String input="shadab";


input=input.toLowerCase();
char[]  inputArray=input.toCharArray();
HashMap<Character, Integer> map=new HashMap<>();
for(char c:inputArray) {
	map.put(c, (map.getOrDefault(c, 0)+1));
}
System.out.println(map);




	}

}
