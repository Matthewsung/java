package sixth;

public class interfaceClassB implements interfaceA, interfaceB {
	@Override
	public void funA() {
		System.out.println("interfaceB의 funA 입니다.");
	}
	
	@Override
	public void funB() {
		System.out.println("interfaceB의 funB 입니다.");	}
}
