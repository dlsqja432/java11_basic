package dynamic1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// f(n) = f(n-1) + 2f(n-2)
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		
		if(n==1) {
			System.out.println(1);
			return;
		} else if(n==2) {
			System.out.println(3);
			return;
		} else {
			arr[1] = 1;
			arr[2] = 3;
		}
		
		for(int i=3; i<=n; i++) {
			arr[i] = (arr[i-1] + 2*arr[i-2])%10007; 
		}
		
		System.out.println(arr[n]);
	}
}
