package array;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			for(int j=a-1; j<=b-1; j++) {
				arr[j] = c;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		scan.close();
	}

}
