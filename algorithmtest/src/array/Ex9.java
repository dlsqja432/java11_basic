package array;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n+1];
		
		for(int i=0; i<n+1; i++) {
			arr[i] = i;
		}
	
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			while(a<b) {
				int tmp = arr[b];
				arr[b] = arr[a];
				arr[a] = tmp;
				a++;
				b--;
			}
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(arr[i]);
		}
		
		scan.close();
	}
}

 