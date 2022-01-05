package sec;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		/*
		System.out.println("람다식 메인 입니다.");
		// 화살표 함수와 비슷
		// 매개변수가 1개일때 혹은 데이터 타입이 동일할때 데이터 타입 생략 가능
		// 실행문이 1개일때 {} 생략가능 ( 화살표 함수와 동일 )
		interface1 lam1 = (String s1, String s2, String s3) -> { System.out.println(s1 + s2 + s3); };
		lam1.fun1("안녕 ", "이건 ", "잘되는걸까?");
		*/
		
		/*
		System.out.println("문자열 클래스 메인");
		// String 객체는 데이터가 변하면 기존의 값을 복사해서 사용하기 때문에 메모리 사용량이 늘어 속도가 느림
		// 데이터 안정성은 buffer, 속도는 builder가 좋다
		// append로 추가 (+=와 동일)
		String str = new String("원래 방법");
		String str1 = "자바에서 허용해주는 방법";
		str1 = str1 + "!!!!!";
		System.out.println(str1);
		
		StringBuffer st = new StringBuffer("안녕");
		StringBuilder sb = new StringBuilder("Hello");
		st.append("하세요");
		st.insert(st.length(), " : 추가 할 수 있다");
		st.delete(2, 4);
		System.out.println(st);
		*/
		
		System.out.println("COLLECTIONS");
		//List interface로 배열과 같이 index를 이용해 관리
		ArrayList<String> list = new ArrayList<String>();

		// 추가
		list.add("hello");
		list.add("안녕하세요");
		list.add("니하오");
		//변경
		list.set(2, "고니찌와");
		//추출
		String tmp = list.get(1);
		System.out.println("선택한 인사말 : " + tmp);
		//제거
		list.add("밥먹었어?");
		list.remove(3);
		//전체제거
		list.clear();
		//배열의 비어있는지 아닌지 확인
		boolean b = list.isEmpty();
		System.out.println(b);
		
		System.out.println(list);
		System.out.println("------------");
		
		//Map은 key를 이용
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//추가
		map.put(1,"5는 key");
		map.put(3, "나는 value");
		map.put(4, "나는 누구게");
		int size = map.size();
		System.out.println("총 길이는 : " + size);
		//교체
		map.put(4, "사라져라");
		//추출
		String map2 = map.get(1); 
		System.out.println(map2);
		//제거
		map.remove(4);
		//확인
		b = map.containsKey(2);
		System.out.println(b);
		b = map.containsValue("나는 value");
		System.out.println(b);
		//전체 삭제
		map.clear();
		//데이터 유무
		b = map.isEmpty();
		System.out.println(b);
		System.out.println(map);
	}
}
