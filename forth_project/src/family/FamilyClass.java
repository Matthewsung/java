package family;

public class FamilyClass {
	// static�� ���� ��ü�� ���� �����ϰ� �ȴ�.
	static int TotalMember = 0;
	private String FamilyName = "����";
	
	public FamilyClass(int num, int total) {
		this.TotalMember += total;
		System.out.println("FamilyClass" + num );
		System.out.println("�� �ο�" + this.TotalMember );
		System.out.println("�� = " + this.FamilyName);
	}
	
	public void setName(String n) {
		System.out.println("setName ���� = " + FamilyName);
		this.FamilyName = n;
		System.out.println("setName �� = " + FamilyName);
//		System.out.println("���� " + this.FamilyName + "�Դϴ�.");
	}
	public String getName() {
		return FamilyName;
	}
	
}
