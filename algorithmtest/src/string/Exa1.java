package string;

import java.util.Scanner;

public class Exa1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int total = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == 'A' || c == 'B' || c == 'C') {
				total = total + 3;
			}
			else if(c == 'D' || c == 'E' || c == 'F') {
				total = total + 4;
			}
			else if(c == 'G' || c == 'H' || c == 'I') {
				total = total + 5;
			}
			else if(c == 'J' || c == 'K' || c == 'L') {
				total = total + 6;
			}
			else if(c == 'M' || c == 'N' || c == 'O') {
				total = total + 7;
			}
			else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
				total = total + 8;
			}
			else if(c == 'T' || c == 'U' || c == 'V') {
				total = total + 9;
			}
			else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
				total = total + 10;
			}
		}
		
		System.out.println(total);
		scan.close();
	}

}
