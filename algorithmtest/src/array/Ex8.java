package array;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int a = scan.nextInt();
			arr[a%42] = 1;
		}
		
		for(int i=0; i<42; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
