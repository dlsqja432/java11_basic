package deep1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int len = s.length();
		int count = 1;
		
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(len-1)) {
				count--;
				break;
			}
			len--;
		}
		System.out.println(count);
		
		scan.close();
	}

}
