package forth_project;

public class ChildClass {
	public String name;
	public int age;
	public String gender;
	public ChildClass() {
		System.out.println("�ڽ� Ŭ���� �Դϴ�.");
	}
	public void setInfo(String n, int a, String g) {
		name = n;
		age = a;
		gender = g;
	}
	public void getInfo() {
		System.out.println("--getInfo()--");
		System.out.println("name = "+ name);
		System.out.println("age = "+ age);
		System.out.println("gender = "+ gender);
	}
}
