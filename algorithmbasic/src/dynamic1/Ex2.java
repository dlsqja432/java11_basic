package dynamic1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		if(n==1) {
			System.out.println(1);
			return;
		} else if(n==2) {
			System.out.println(2);
			return;
		} else {
			arr[1] = 1;
			arr[2] = 2;
		}
		
		for(int i=3; i<=n; i++) {
			arr[i] = (arr[i-1] + arr[i-2])%10007;
		}
		
		System.out.println(arr[n]);
	}
}


