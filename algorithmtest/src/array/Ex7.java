package array;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[30];
		
		for(int i=0; i<28; i++) {
			int sn = scan.nextInt();
			arr[sn-1] = sn;
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}
		scan.close();
	}

}
