package string;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int[] sArr = new int[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			sArr[i] = s.charAt(i)-'a';
		}
		
		int count = 0;
		for(int i=0; i<26; i++) {
			for(int j=0; j<s.length(); j++) {
				if(sArr[j] == i) {
					count = j;
					break;
				}
				count = -1;
			}
			System.out.println(count);
		}
		
		scan.close();
	}

}
