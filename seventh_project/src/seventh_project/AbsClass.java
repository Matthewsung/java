package seventh_project;

public abstract class AbsClass {
	
	int i;
	String s;
	
	public AbsClass() {
	System.out.println("---추상클래스---");
	}
	
	public AbsClass(int i, String s) {
		System.out.println("추상클래스 만드는 중");
//		System.out.println("i = " + i);
//		System.out.println("s = " + s);
		this.i = i;
		this.s = s;
	}
	
	public void fun1 () {
		System.out.println("추상클래스 기능 1");
	}
	public abstract void fun2();
}
