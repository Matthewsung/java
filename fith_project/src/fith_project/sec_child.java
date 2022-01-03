package fith_project;

public class sec_child extends parents {
	int tall = 185;
	public sec_child() {
		System.out.println("둘째 자식 입니다.");
	}
	public void height() {
		System.out.println("둘째의 키는 "+this.tall + "입니다.");

		System.out.println("부모의 키는 "+super.tall + "입니다.");
	}
}
