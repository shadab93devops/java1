package basic;


class C{
	int age=10;
	String name="abc";
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
public class Encapsulation extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C obj = new C();
//
//		obj.setAge(99);
//		System.out.println(obj.getAge());
//
//		obj.setName("shadab");
//
//		System.out.println(obj.getName());
		Encapsulation obj=new Encapsulation();
		System.out.println(obj.age);
		
		
	}

}
