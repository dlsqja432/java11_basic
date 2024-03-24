package dynamic1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 10;
		int[] arr = new int[11];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i=4; i<=10; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			System.out.println(arr[a]);
		}
	}
}
