package math3;

import java.util.Scanner;

public class Ex04 {
	static final int MAX = 10000000;
	static boolean[] prime = new boolean[MAX+1];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp = n;
		getPrime();
		 
		while(n!=1) {
			if(n%2==0) {
				n /= 2;
				System.out.println(2);
			} else {
				for(int i=3; i<=tmp; i+=2) {
					if(prime[i] && n%i==0) {
						n /= i;
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
	
	public static void getPrime() {
		for(int i=2; i<=MAX; i++) {
			prime[i] = true;
		}
		
		for(int i=2; i*i<=MAX; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					prime[j] = false;
				}
			}
		}
	}
}
