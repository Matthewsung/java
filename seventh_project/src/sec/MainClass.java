package sec;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		/*
		System.out.println("���ٽ� ���� �Դϴ�.");
		// ȭ��ǥ �Լ��� ���
		// �Ű������� 1���϶� Ȥ�� ������ Ÿ���� �����Ҷ� ������ Ÿ�� ���� ����
		// ���๮�� 1���϶� {} �������� ( ȭ��ǥ �Լ��� ���� )
		interface1 lam1 = (String s1, String s2, String s3) -> { System.out.println(s1 + s2 + s3); };
		lam1.fun1("�ȳ� ", "�̰� ", "�ߵǴ°ɱ�?");
		*/
		
		/*
		System.out.println("���ڿ� Ŭ���� ����");
		// String ��ü�� �����Ͱ� ���ϸ� ������ ���� �����ؼ� ����ϱ� ������ �޸� ��뷮�� �þ� �ӵ��� ����
		// ������ �������� buffer, �ӵ��� builder�� ����
		// append�� �߰� (+=�� ����)
		String str = new String("���� ���");
		String str1 = "�ڹٿ��� ������ִ� ���";
		str1 = str1 + "!!!!!";
		System.out.println(str1);
		
		StringBuffer st = new StringBuffer("�ȳ�");
		StringBuilder sb = new StringBuilder("Hello");
		st.append("�ϼ���");
		st.insert(st.length(), " : �߰� �� �� �ִ�");
		st.delete(2, 4);
		System.out.println(st);
		*/
		
		System.out.println("COLLECTIONS");
		//List interface�� �迭�� ���� index�� �̿��� ����
		ArrayList<String> list = new ArrayList<String>();

		// �߰�
		list.add("hello");
		list.add("�ȳ��ϼ���");
		list.add("���Ͽ�");
		//����
		list.set(2, "������");
		//����
		String tmp = list.get(1);
		System.out.println("������ �λ縻 : " + tmp);
		//����
		list.add("��Ծ���?");
		list.remove(3);
		//��ü����
		list.clear();
		//�迭�� ����ִ��� �ƴ��� Ȯ��
		boolean b = list.isEmpty();
		System.out.println(b);
		
		System.out.println(list);
		System.out.println("------------");
		
		//Map�� key�� �̿�
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//�߰�
		map.put(1,"5�� key");
		map.put(3, "���� value");
		map.put(4, "���� ������");
		int size = map.size();
		System.out.println("�� ���̴� : " + size);
		//��ü
		map.put(4, "�������");
		//����
		String map2 = map.get(1); 
		System.out.println(map2);
		//����
		map.remove(4);
		//Ȯ��
		b = map.containsKey(2);
		System.out.println(b);
		b = map.containsValue("���� value");
		System.out.println(b);
		//��ü ����
		map.clear();
		//������ ����
		b = map.isEmpty();
		System.out.println(b);
		System.out.println(map);
	}
}
