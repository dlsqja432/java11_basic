package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(countFactorialZero(n));
	}
	
	public static int countFactorialZero(int n) {
		int result = 1;
		int count = 0;
		for(int i=1; i<=n; i++) {
			result *= i;
			if(result%10 == 0) {
				while(result%10 == 0) {
					result /= 10;
					count++;
				}
			}
			result = result % 10000;
		}
		return count;
	}
}
