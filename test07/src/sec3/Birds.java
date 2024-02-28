package sec3;

public class Birds extends Animal {
	protected int wings;
	protected boolean fly;
	
	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	public void print() {
		System.out.println(wings + ", " + super.name);
	}
}
