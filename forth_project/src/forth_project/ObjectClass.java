package forth_project;

public class ObjectClass {
	public int x;
	public int y;
	// 사용자 생성자
	public ObjectClass(String n, int[] arr) {
		System.out.println("object 시작입니다.");
//		System.out.println("n = " + n);
//		System.out.println("arr = " + arr);
	}
	public ObjectClass(int x, int y) {
		//this = 해당 객체를 가르킴
		this.x = x;
		this.y = y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public void getInfo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
