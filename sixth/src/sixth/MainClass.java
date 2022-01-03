package sixth;

public class MainClass {
	public static void main(String[] args) {
//		System.out.println("메인 익명클레스");
		// 익명 클래스는 주로 인터페이스나 추상클래스에서 사용
//		new anonymous() {}.verify();
		
		System.out.println("인터페이스");
//		interfaceA ia = new interfaceClass();
//		interfaceB ib = new interfaceClass();
//		ia.funA();
//		ib.funB();
		interfaceA ia = new interfaceClass();
		interfaceA ib = new interfaceClassB();
		interfaceA aaa[] = {ia, ib};
		
		for(int i = 0; i < aaa.length; i++) {
			aaa[i].funA();
		}
	}
}
