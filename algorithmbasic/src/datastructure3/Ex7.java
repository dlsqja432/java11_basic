package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(c-'A'>=0 && c-'A'<=25) {
					int a = (c-'A'+13)%26;
					c = (char)(a+'A');
				}
				else if(c-'a'>=0 && c-'a'<=25) {
					int a = (c-'a'+13)%26;
					c = (char)(a+'a');
				}
				sb.append(c);
			}
			else sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
