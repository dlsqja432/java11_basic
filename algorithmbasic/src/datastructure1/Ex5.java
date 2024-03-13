package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int n = Integer.parseInt(br.readLine());
		LinkedList<Character> input = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			input.add(str.charAt(i));
		}
		
		ListIterator<Character> cursor = input.listIterator(input.size());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if(s.equals("L")) {
				if(cursor.hasPrevious()) {
					cursor.previous();
				}
			}
			
			if(s.equals("D")) {
				if(cursor.hasNext()) {
					cursor.next();
				}
			}
			
			if(s.equals("B")) {
				if(cursor.hasPrevious()) {
					cursor.previous();
					cursor.remove();
				}
			}
			
			if(s.equals("P")) {
				char ch = st.nextToken().charAt(0);
				cursor.add(ch);
			}
		}
		for(char c : input) {
			sb.append(c);
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
