package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex6 {
	static final int MAX = 1000000;
	static boolean[] prime = new boolean[MAX+1];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		isPrime();
		
		boolean wrong = false;
		while((s=br.readLine()) != null) {
			int x = Integer.parseInt(s);
			if(x==0) break;
			
			for(int i=3; i<=x/2; i+=2) {
				if(prime[i] && prime[x-i]) {
					bw.write(x + " = " + i + " + " + (x-i) + "\n");
					wrong = true;
					break;
				}
			}
			if(!wrong) {
				bw.write("Goldbach's conjecture is wrong.\n");
			}
			bw.flush();
		}
	}
	
	
	public static void isPrime() {
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
