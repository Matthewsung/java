package fith_project;

public class child extends parents{
	int tall =180;
	public child() {
		System.out.println("�ڽ� �����Դϴ�.");
	}
	public void childInfo() {
		System.out.println("�ڽ��� �����Դϴ�.---");
	}
	
	//override
	public void height() {
		System.out.println("�ڽ��� Ű��  Ű�� " + this.tall + "�̴�.");
		System.out.println("�θ��� Ű��  Ű�� " + super.tall + "�̴�.");
	}
}
