package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
	}
	
	public static int factorial(int n) {
//		int result = 1;
//		for(int i=1; i<=n; i++) {
//			result = result * i;
//		}
//		return result;
		
		if(n==0 || n==1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
}
