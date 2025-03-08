package basic;

public class This_Keyword {

	
	
	 int age;
	String name;
	
	
	void assignValues(int a,String n) {
		this.age=a;
		this.name=n;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Keyword obj=new This_Keyword();
		obj.assignValues(10,"abc");
		System.out.println(obj.age);
		System.out.println(obj.name);
		
	}

}
