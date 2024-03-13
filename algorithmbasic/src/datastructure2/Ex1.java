package datastructure2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		str = reverseString(str);
		bw.write(str);
		bw.flush();
	}
	
	public static String reverseString(String str) {
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if(s.charAt(0) == '<') {
				for(int i=0; i<s.length(); i++) {
					sb.append(s.charAt(i));
				}
			}
			else if(s.charAt(s.length()-1) == '>')  {
				for(int i=0; i<s.length(); i++) {
					sb.append(s.charAt(i));
				}
			}
			else {
				for(int i=s.length()-1; i>=0; i--) {
					sb.append(s.charAt(i));
				}
			}
			sb.append(" ");
		}
		return sb.toString();
	}
}
