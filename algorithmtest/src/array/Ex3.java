package array;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int min = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
			if(i==0) {
				max = arr[i];
				min = arr[i];
				continue;
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		
		System.out.println(min + " " + max);
		scanner.close();
	}

}
