package array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int count = 0;
		int max = 0;
		int maxNum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			count = 0;
			for(int j=0; j<9; j++) {
				if(arr[j] > arr[i]) {
					continue;
				}
				count++;
			}
			if(count == 9) {
				max = i+1;
				maxNum = arr[i];
			}
		}
		System.out.println(maxNum);
		System.out.println(max);
		
		scan.close();
	}

}
