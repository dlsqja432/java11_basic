package deep1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'A') {
				n = s.charAt(i) - 'A';
			}
		}
	}

}
