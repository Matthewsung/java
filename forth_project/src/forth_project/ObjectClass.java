package forth_project;

public class ObjectClass {
	public int x;
	public int y;
	// ����� ������
	public ObjectClass(String n, int[] arr) {
		System.out.println("object �����Դϴ�.");
//		System.out.println("n = " + n);
//		System.out.println("arr = " + arr);
	}
	public ObjectClass(int x, int y) {
		//this = �ش� ��ü�� ����Ŵ
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
