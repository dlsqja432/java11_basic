package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			String vps = br.readLine();
			Stack<String> stack = new Stack<>();
			int count =0;
			for(int j=0; j<vps.length(); j++) {
				String s = String.valueOf(vps.charAt(j));
				if(s.equals("(")) {
					stack.add(s);
				}
				if(s.equals(")")) {
					if(stack.isEmpty()) {
						bw.write("NO");
						break;
					}
					else stack.pop();
				}
				count++;
			}
			if(stack.isEmpty() && count == vps.length()) {
				bw.write("YES");
			}
			if(!stack.isEmpty()) bw.write("NO");
			bw.newLine();
		}
		bw.flush();
	}
}
