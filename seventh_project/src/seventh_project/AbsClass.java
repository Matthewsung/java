package seventh_project;

public abstract class AbsClass {
	
	int i;
	String s;
	
	public AbsClass() {
	System.out.println("---�߻�Ŭ����---");
	}
	
	public AbsClass(int i, String s) {
		System.out.println("�߻�Ŭ���� ����� ��");
//		System.out.println("i = " + i);
//		System.out.println("s = " + s);
		this.i = i;
		this.s = s;
	}
	
	public void fun1 () {
		System.out.println("�߻�Ŭ���� ��� 1");
	}
	public abstract void fun2();
}
