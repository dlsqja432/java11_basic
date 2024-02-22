package deep1;

import java.util.Scanner;

public class Ex2 {
	
	final static int KING = 1;
	final static int QUEEN = 1;
	final static int LOOK = 2;
	final static int VISHOP = 2;
	final static int KNIGHT = 2;
	final static int PHON = 8;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int king = scan.nextInt();
		int queen = scan.nextInt();
		int look = scan.nextInt();
		int vishop = scan.nextInt();
		int knight = scan.nextInt();
		int phon = scan.nextInt();
		
		System.out.println(KING - king);
		System.out.println(QUEEN - queen);
		System.out.println(LOOK - look);
		System.out.println(VISHOP - vishop);
		System.out.println(KNIGHT - knight);
		System.out.println(PHON - phon);
		
		scan.close();
	}

}
