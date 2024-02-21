package array;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		int tmp;
		
		for(int i=1; i<=n; i++) {
			arr[i-1] = i;
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			tmp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = tmp;
		}
		
		for(int result : arr) {
			System.out.print(result+ " ");
		}
		
		scan.close();
	}

}
