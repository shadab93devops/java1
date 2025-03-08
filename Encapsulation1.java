package basic;

public class Encapsulation1 {
private int age=10;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age=age;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 obj=new Encapsulation1();
		
		obj.setAge(20);
		System.out.println(obj.getAge());
	}

}
