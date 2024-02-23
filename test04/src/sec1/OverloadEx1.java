package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {

		Product pro1 = new Product();
		pro1.print();
		pro1.print("장인범");
		pro1.print(500);
		pro1.print("장인범", 300);
		pro1.print(150, "인범장");
	}

}
