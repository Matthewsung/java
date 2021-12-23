package third_project;

public class Grangeur {
	public int wheels;
	public int prices; 
	
	public Grangeur() {
		System.out.println("생성자입니다.");
	}
	public void run() {
		System.out.println("출발!!!!!!!!");
	}
	public void stop() {
		System.out.println("멈춰!!!!!!!");
	}
	public void info() {
		System.out.printf("wheels = %d, prices= %d\n", wheels, prices);
	}
		
}
