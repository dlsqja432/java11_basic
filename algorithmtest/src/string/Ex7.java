package string;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		String result = "";
		
		for(int i=0; i<t; i++) {
			int r = scan.nextInt();
			String s = scan.next();
			
			for(int j=0; j<s.length(); j++) {
				String tmp = String.valueOf(s.charAt(j));
				
				for(int k=0; k<r-1; k++) {
					result+=tmp;
				}
				result = result + tmp;
			}
			System.out.println(result);
			result = "";
		}
		scan.close();
	}

}
