package third_project;

public class MainClass {
	public static void main(String[] args) {
		
		Grangeur car = new Grangeur();
		
		car.wheels = 18;
		car.prices = 3000;
		car.run();
		car.stop();
		car.info();
		Bicycle myBicycle = new Bicycle();
		myBicycle.info();
		
		Bicycle myBicycle2 = new Bicycle("red", 200);
		myBicycle2.info();
	
	}
}
