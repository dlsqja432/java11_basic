package math1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>b) result = lcm(a,b);
			else result = lcm(b,a);
			System.out.println(result);
		}
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}
	
	public static int lcm(int a, int b) {
		int gcd = gcd(a,b);
		int lcm = a*b/gcd;
		return lcm;
	}
}
