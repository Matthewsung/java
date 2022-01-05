package seventh_project;
// 상속
public class ClassEx extends AbsClass{
	
	public ClassEx() {
		System.out.println("클래스 예제입니다.");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}
	
	@Override
	public void fun2() {
		System.out.println("추상클래스 기능 2");
	}
}
