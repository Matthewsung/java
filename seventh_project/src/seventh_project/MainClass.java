package seventh_project;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("--메인 클래스--");
		
		AbsClass ex = new ClassEx(100, "나오나") ;
		ex.fun1();
		ex.fun2();
		System.out.println(ex.i);
		System.out.println(ex.s);
	}
}
