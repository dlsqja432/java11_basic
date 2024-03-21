package math3;

import java.util.Scanner;

public class Ex4 {
	static final int MAX = 10000;
	static boolean[] prime = new boolean[MAX+1];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
	
	public static void getPrime() {
		for(int i=2; i*i<=MAX; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					prime[i] = false;
				}
			}
		}
	}
}
