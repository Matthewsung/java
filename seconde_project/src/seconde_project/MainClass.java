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
		
		String weather = "태양 ";
		System.out.printf("오늘의 날씨는 %s 입니다 \n", weather);
		
		int a = 1;
		int aa = 2; 
		System.out.println(a == aa);
		System.out.println(a + aa);
		System.out.println(a - aa);
		System.out.println(a * aa);
		System.out.println(a / aa);
		System.out.println(a % aa);
		System.out.println("연산자끝");
		// 배열
		int [] arr1 = new int[5]; //배열 선언
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		System.out.println(arr1[4]);
		
		int [] arr2 = {1,2,3,4};
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[4]);
		
//		String [] name = {"김아무", "박아무", "이아무"};
//		int [] score = new int[4];
//		Scanner scanner = new Scanner(System.in);
//		System.out.printf("%s의 점수를 입력하시오", name[0]);
//		score[0] = scanner.nextInt();
//		System.out.printf("%s의 점수입력하세요", name[1]);
//		score[1] = scanner.nextInt();
//		System.out.println(name[0]);
//		System.out.println(score[0]);
		System.out.println("배열 속성");
		int [] arr3 = {1,2,3,4,5};
		System.out.println(arr3.length);
		System.out.println(Arrays.toString(arr3));
		
		int [] arr4 = null;
		System.out.println("arr4의 값 : " + arr4);
		
		arr4 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(Arrays.toString(arr4));
				
		System.out.println("조건문 시작\n");
		
		int num1 = 10;
		int num2 = 0;
		
		if( num1 < num2 ) {
			System.out.println("num1이 num2보다 작다");
		}
		else if (num1 > num2){
			System.out.println("num2가 num1보다 작다");
		}
		else {
			System.out.println("num1과 num2는 같다");
		}
	}
}
