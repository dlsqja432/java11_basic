package sec2;

public class Animal {
	String name;
	boolean spine;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	
	public void print() {
		System.out.println("Animal [name=" + name + ", spine=" + spine + "]");
	}
	
	
}
