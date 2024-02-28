package sec4;

public class ShopExam {

	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.buy();
		shop.sell();
		shop.delivery();
		System.out.println();
		
		Delivery s2 = new Shop();
		s2.buy();
		s2.sell();
		s2.delivery();
	}

}
