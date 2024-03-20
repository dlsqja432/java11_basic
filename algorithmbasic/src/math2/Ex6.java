package math2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex6 {
	static final int MAX = 1000000;
	static boolean[] prime = new boolean[MAX+1];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		getPrime();
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			int count = 0;
			if(x==4) {
				bw.write(1+"\n");
				continue;
			}
			
			for(int j=3; j<=x/2; j+=2) {
				if(prime[j] && prime[x-j]) {
					count++;
				}
			}
			bw.write(count + "\n");
		}
		bw.flush();
	}
	
	public static void getPrime() {
		for(int i=2; i<=MAX; i++) {
			prime[i] = true;
		}
		
		for(int i=2; i*i<=MAX; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					prime[j] = false;
				}
			}
		}
	}
}
