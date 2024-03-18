package math1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		if(a>b) result = gcd(a,b);
		else result =gcd(b,a);
		System.out.println(result);
		
		
		if(a>b) result = lsb(a, b);
		else result = lsb(b,a);
		System.out.println(result);
	}
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
	
	public static int lsb(int a, int b) {
		int gcd = gcd(a,b);
		int result = a*b/gcd;
		return result;
	}
}
