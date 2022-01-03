package sixth;

public class interfaceClass implements interfaceA, interfaceB {
	public interfaceClass() {
		System.out.println("interfaceClass 입니다.");
	}
	@Override
	public void funA() {
		System.out.println("funA입니다");
	}
	@Override
	public void funB() {
		System.out.println("funB 입니다");
	}
}
