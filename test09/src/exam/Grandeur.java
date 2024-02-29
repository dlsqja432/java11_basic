package exam;

public class Grandeur extends Car {
	String carName = "Grandeur";
	
	@Override
	public void start() {
		System.out.println(carName + " 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(carName + " 달립니다");
	}

	@Override
	public void stop() {
		System.out.println(carName + " 멈춥니다.");
	}

	@Override
	public void turnoff() {
		System.out.println(carName + " 시동을 끕니다.");
	}
}
