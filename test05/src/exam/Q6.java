package exam;

public class Q6 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println("가드 번호 : " + c1.getCardNumber());
		Card c2 = new Card();
		System.out.println("가드 번호 : " + c2.getCardNumber());
		
		for(int i=0; i<15; i++) {
			Card c = new Card();
		}
		
		Card c3 = new Card();
		System.out.println("가드 번호 : " + c3.getCardNumber());
	}

}
