package sixth;

public class MainClass {
	public static void main(String[] args) {
//		System.out.println("���� �͸�Ŭ����");
		// �͸� Ŭ������ �ַ� �������̽��� �߻�Ŭ�������� ���
//		new anonymous() {}.verify();
		
		System.out.println("�������̽�");
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
