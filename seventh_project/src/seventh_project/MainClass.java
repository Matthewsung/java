package seventh_project;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("--���� Ŭ����--");
		
		AbsClass ex = new ClassEx(100, "������") ;
		ex.fun1();
		ex.fun2();
		System.out.println(ex.i);
		System.out.println(ex.s);
	}
}
