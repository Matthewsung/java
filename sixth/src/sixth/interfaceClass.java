package sixth;

public class interfaceClass implements interfaceA, interfaceB {
	public interfaceClass() {
		System.out.println("interfaceClass �Դϴ�.");
	}
	@Override
	public void funA() {
		System.out.println("funA�Դϴ�");
	}
	@Override
	public void funB() {
		System.out.println("funB �Դϴ�");
	}
}
