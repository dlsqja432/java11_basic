package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Stack {
	int top;
	char[] stackArray;
	int maxSize;
	
	public Stack(int size) {
		this.maxSize = size;
		stackArray = new char[size];
		this.top = -1;
	}
	
	public void push(char x) {
		stackArray[++top] = x;
	}
	
	public void pop() {
		top--;
	}
	
	public char peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}

public class StackEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String s = br.readLine();
			Stack stack = new Stack(s.length());
			int count = 0;
			for(int j=0; j<s.length(); j++) {
				char ch = s.charAt(j);
				if(ch == '(') {
					stack.push(s.charAt(j));
				}
				
				if(ch == ')') {
					if(stack.isEmpty()) {
						bw.write("NO");
						bw.newLine();
						break;
					}
					else {
						stack.pop();
					}
				}
				count++;
			}
			if(count == s.length()) {
				if(stack.isEmpty()) {
					bw.write("YES");
				}
				else {
					bw.write("NO");
				}
				bw.newLine();
			}
		}
		bw.flush();
	}

}
