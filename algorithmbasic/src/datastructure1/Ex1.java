package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			String s = input.nextToken();
			if(s.equals("push")) {
				stack.add(Integer.parseInt(input.nextToken()));
				continue;
			}
			if(s.equals("pop")) {
				if(stack.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(stack.pop()));
			}
			if(s.equals("size")) {
				bw.write(String.valueOf(stack.size()));
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			if(s.equals("top")) {
				if(stack.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(stack.peek()));
			}
			bw.newLine();
		}
		bw.flush();
	}
}
