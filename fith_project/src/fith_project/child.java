package fith_project;

public class child extends parents{
	int tall =180;
	public child() {
		System.out.println("자식 시작입니다.");
	}
	public void childInfo() {
		System.out.println("자식의 정보입니다.---");
	}
	
	//override
	public void height() {
		System.out.println("자식의 키는  키는 " + this.tall + "이다.");
		System.out.println("부모의 키는  키는 " + super.tall + "이다.");
	}
}
