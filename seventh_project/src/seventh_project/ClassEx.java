package seventh_project;
// ���
public class ClassEx extends AbsClass{
	
	public ClassEx() {
		System.out.println("Ŭ���� �����Դϴ�.");
	}
	
	public ClassEx(int i, String s) {
		super(i, s);
	}
	
	@Override
	public void fun2() {
		System.out.println("�߻�Ŭ���� ��� 2");
	}
}
