package fith_project;

public class sec_child extends parents {
	int tall = 185;
	public sec_child() {
		System.out.println("��° �ڽ� �Դϴ�.");
	}
	public void height() {
		System.out.println("��°�� Ű�� "+this.tall + "�Դϴ�.");

		System.out.println("�θ��� Ű�� "+super.tall + "�Դϴ�.");
	}
}
