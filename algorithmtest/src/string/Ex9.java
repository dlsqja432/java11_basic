package string;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		String reverseA  = String.valueOf(a.charAt(2)) + String.valueOf(a.charAt(1))
		+ String.valueOf(a.charAt(0));
		
		String reverseB = String.valueOf(b.charAt(2)) + String.valueOf(b.charAt(1))
		+ String.valueOf(b.charAt(0));
		
		int aa = Integer.parseInt(reverseA);
		int bb = Integer.parseInt(reverseB);
		
		if(aa > bb) {
			System.out.println(aa);
		}
		else {
			System.out.println(bb);
		}
		scan.close();
	}

}
