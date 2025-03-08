package basic;




interface z{
	public void add();
}
public class D  implements z{
public void add() {
	System.out.println("overridding");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
D obj=new D();
obj.add();
	}

}
