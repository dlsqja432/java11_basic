package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> arr = new Stack<>();
		
		for(int i=n; i>0; i--) {
			arr.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) { 
			int x = Integer.parseInt(br.readLine());
			if(stack.isEmpty() || stack.peek() < x) {
				while(arr.peek() != x) {
					stack.add(arr.pop());
					sb.append("+\n");
				}
				stack.add(arr.pop());
				sb.append("+\n");
			}
			
			if(stack.peek() == x) {
				stack.pop();
				sb.append("-\n");
			}
			if(!stack.isEmpty()) {
				if(stack.peek() > x) {
					bw.write("NO");
					bw.flush();
					return;
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
