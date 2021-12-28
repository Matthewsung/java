package family;

public class FamilyClass {
	// static은 같은 객체를 사용시 공유하게 된다.
	static int TotalMember = 0;
	private String FamilyName = "시작";
	
	public FamilyClass(int num, int total) {
		this.TotalMember += total;
		System.out.println("FamilyClass" + num );
		System.out.println("총 인원" + this.TotalMember );
		System.out.println("성 = " + this.FamilyName);
	}
	
	public void setName(String n) {
		System.out.println("setName 시작 = " + FamilyName);
		this.FamilyName = n;
		System.out.println("setName 끝 = " + FamilyName);
//		System.out.println("성은 " + this.FamilyName + "입니다.");
	}
	public String getName() {
		return FamilyName;
	}
	
}
