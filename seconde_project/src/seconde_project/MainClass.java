package seconde_project;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {	
		char c = 'a';
		System.out.println(c);
		
		int i = 10;
		System.out.println(i);
		
		double d = 10.123;
		System.out.println(d);
		
		boolean b = true;
		System.out.println(b);
		
		String s = "hellow java world";
		System.out.println(s);
		
		s = "good";
		System.out.println(s);	
		System.out.println("good \" moring \\");
		
		String weather = "�¾� ";
		System.out.printf("������ ������ %s �Դϴ� \n", weather);
		
		int a = 1;
		int aa = 2; 
		System.out.println(a == aa);
		System.out.println(a + aa);
		System.out.println(a - aa);
		System.out.println(a * aa);
		System.out.println(a / aa);
		System.out.println(a % aa);
		System.out.println("�����ڳ�");
		// �迭
		int [] arr1 = new int[5]; //�迭 ����
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		System.out.println(arr1[4]);
		
		int [] arr2 = {1,2,3,4};
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[4]);
		
//		String [] name = {"��ƹ�", "�ھƹ�", "�̾ƹ�"};
//		int [] score = new int[4];
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("%s�� ������ �Է��Ͻÿ�", name[0]);
//		score[0] = scanner.nextInt();
//		System.out.printf("%s�� �����Է��ϼ���", name[1]);
//		score[1] = scanner.nextInt();
//		System.out.println(name[0]);
//		System.out.println(score[0]);
		System.out.println("�迭 �Ӽ�");
		int [] arr3 = {1,2,3,4,5};
		System.out.println(arr3.length);
		System.out.println(Arrays.toString(arr3));
		
		int [] arr4 = null;
		System.out.println("arr4�� �� : " + arr4);
		
		arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(Arrays.toString(arr4));
				
		System.out.println("���ǹ� ����\n");
		
		int num1 = 10;
		int num2 = 0;
		
		if( num1 < num2 ) {
			System.out.println("num1�� num2���� �۴�");
		}
		else if (num1 > num2){
			System.out.println("num2�� num1���� �۴�");
		}
		else {
			System.out.println("num1�� num2�� ����");
		}
	}
}