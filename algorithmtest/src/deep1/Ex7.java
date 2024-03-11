package deep1;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = 0;
		for(int i=0; i<n; i++) {
			String s = sc.next();
			result += checkGroupWord(s);
		}
		
		System.out.println(result);
		sc.close();
	}
	
	public static int checkGroupWord(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					if(i<j) return 0;
				}
			}
		}
		return 1;
	}
}
