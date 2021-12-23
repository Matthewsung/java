package third_project;

public class Bicycle {
	
	public String color;
	public int price;
	
	public Bicycle () {
		System.out.println("Ω√¿€!!!\n");
	}
	public Bicycle(String c, int p) {
//		System.out.printf("price = %d, color = %d\n", p, c);
		this.color = c;
		this.price = p ;
	}
	public void info() {
		System.out.println("price = " + price );
		System.out.println("color = " + color);		
	}
}
