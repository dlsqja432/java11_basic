package math3;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int[] result = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = sc.nextInt();
			result[i] = 10001;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				result[i] = Math.min(result[i], result[i-j]+arr[j]);
			}
		}
		
		System.out.println(result[n]);
	}
}
