package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		primeNum(a,b);
	}
	
	public static void primeNum(int a, int b) {
		boolean[] isPrime = new boolean[b+1];
		Arrays.fill(isPrime, true);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i=2; i*i<=b; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=b; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i=a; i<=b; i++) {
			if(isPrime[i]) {
				System.out.println(i);
			}
		}
	}
}

