package math3;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();
		System.out.println(change10(n,b));
	}
	
	public static int change10(String n, int b) {
		int mul = 1;
		int result = 0;
		for(int i=n.length()-1; i>=0; i--) {
			char c = n.charAt(i);
			if(Character.isAlphabetic(c)) {
				int a = c-'A'+10;
				result += a*mul;
			} else {
				int a = Integer.parseInt(String.valueOf(c));
				result += a*mul;
			}
			mul *= b;
		}
		return result;
	}
}
