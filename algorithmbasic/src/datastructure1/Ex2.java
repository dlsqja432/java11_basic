package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			StringBuilder sb = new StringBuilder();
			while(input.hasMoreTokens()) {
				sb.append(reverseString(input.nextToken()) + " ");
			}
			bw.write(sb.toString());
			bw.newLine();
			
		}
		bw.flush();
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
