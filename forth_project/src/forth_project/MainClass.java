package forth_project;
// 다른 package에 있는 class를 사용할때 불러옴
import family.FamilyClass;
import family.CollageClass;
import family.*;
public class MainClass {
	public static void main(String[] args) {
//		ChildClass child1 = new ChildClass();
//		child1.setInfo("abc",30, "M");
//		
//		child1.getInfo();
		
//		Referance ref1 = new Referance();
//		Referance ref2 = new Referance();
//		Referance ref3 = new Referance();
//		System.out.println("ref1 = " + ref1);
//		System.out.println("ref2 = " + ref2);
//		System.out.println("ref3 = " + ref3);
//		if(ref1 == ref2) {
//			System.out.println("1과 2가 같아요");
//		}
//		else if (ref2 == ref3) {
//			System.out.println("2와 3이 같아요");
//		}
//		else if (ref1 == ref3) {
//			System.out.println("3과 1이 같아요");
//		}
//		else {
//			System.out.println("다 달라요");
//		}
		
//		ref1.getInfo();
//		ref1 = null;
//		ref1.getInfo();
//		ref2.getInfo();
		
//		int[] arr = {10, 20, 30};
//		ObjectClass obj1 = new ObjectClass("hello", arr);
//		ObjectClass obj2 = new ObjectClass(10, 20);
//		obj2.getInfo();
//static
		FamilyClass fam1 = new FamilyClass(3, 3);
//		FamilyClass fam2 = new FamilyClass(4, 1);
//		fam1.setName("박");
		fam1.getName();
		fam1.setName("감");
		fam1.getName();
//		CollageClass col = new CollageClass();
		
//데이터 은닉
		
	}
}
