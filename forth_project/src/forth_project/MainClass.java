package forth_project;

public class MainClass {
	public static void main(String[] args) {
		ChildClass child1 = new ChildClass();
		child1.setInfo("abc",30, "M");
		
		child1.getInfo();
	}
}
