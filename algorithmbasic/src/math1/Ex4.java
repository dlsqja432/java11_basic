package math1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i<n; i++) {
			if(isPrime(sc.nextInt())) count++; 
		}
		System.out.println(count);
	}
	
	public static boolean isPrime(int a) {
		int count = 0;
		for(int i=1; i<=a; i++) {
			if(a%i == 0) {
				count++;
			}
		}
		if(count == 2) return true;
		else return false;
	}
}
