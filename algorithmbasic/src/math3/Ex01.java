package math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		bw.write(change(n,b));
		bw.flush();
	}
	
	public static String change(int n, int b) {
		StringBuilder sb = new StringBuilder();
		while(n != 0) {
			if(n%b >= 10) {
				sb.append((char)(n%b+55));
				n /= b;
			} else {
				sb.append(n%b);
				n /= b;
			}
		}
		return sb.reverse().toString();
	}
}
