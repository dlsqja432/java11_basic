package exam;

public class Car {
	public void run() {
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
	
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	 
	public void start() {}
	
	public void drive() {}
	
	public void stop() {}
	
	public void turnoff() {}
}
