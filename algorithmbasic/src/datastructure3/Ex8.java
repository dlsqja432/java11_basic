package datastructure3;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long[] arr = new long[4];
		
		for(int i=0; i<4; i++) {
			arr[i] = sc.nextLong();
		}
		
		for(int i=0; i<2; i++) {
			sb.append(arr[i]);
		}
		String s1 = sb.toString();
		
		StringBuilder sb2 = new StringBuilder();
		for(int i=2; i<4; i++) {
			sb2.append(arr[i]);
		}
		String s2 = sb2.toString();
		
		System.out.println(Long.parseLong(s1) + Long.parseLong(s2));
	}
}
