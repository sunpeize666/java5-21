package chapter521;
class C1{
	private static int x = 100;
	public static int y  = x;
	static int z = x;
	
	public static int cc() {
		return x;
	}
}
class C2 extends C1{
	public static String x;
	static int y;
}
public class InheritanceTest3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
System.out.println("cc1클레스의 cc() 값 : "+C1.cc());
System.out.println("cc1클레스의 y () 값 : "+C1.y);
System.out.println("cc1클레스의 z () 값 : "+C1.z);

System.out.println("cc2클레스의 x () 값 : "+C2.x);
System.out.println("cc2클레스의 y () 값 : "+C2.y);
System.out.println("cc2클레스의 z () 값 : "+C2.z);
System.out.println("cc2클레스의 cc () 값 : "+C2.cc());

C2.x = "오늘은 화요일입니다.";
C2.y = 200;
C2.z = 300;

	}

}
