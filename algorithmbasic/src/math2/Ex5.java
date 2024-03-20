package math2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n==0) {
			System.out.println(0);
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		while(n!=0) {
			if(n%2==0) {
				sb.append("0");
				n = -(n/2);
			} else {
				if(n>0) {
					sb.append("1");
					n = -(n/2);
				} else {
					sb.append("1");
					n = (-n+1)/2;
				}
			}
		}
		System.out.println(sb.reverse().toString());
	} 
}
