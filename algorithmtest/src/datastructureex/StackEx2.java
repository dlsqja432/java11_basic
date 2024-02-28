package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Stack1 {
	int top;
	int[] stackArray;
	int maxSize;
	
	public Stack1(int size) {
		this.maxSize = size;
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	public void push(int x) {
		stackArray[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int tmp = stackArray[top];
		top--;
		return tmp;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
}

public class StackEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Stack1 stack = new Stack1(n);
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				int a = Integer.parseInt(st.nextToken());
				stack.push(a);
				continue;
			}
			
			if(s.equals("pop")) {
				bw.write(String.valueOf(stack.pop()));
			}
			
			if(s.equals("top")) {
				bw.write(String.valueOf(stack.peek()));
			}
			if(s.equals("size")) {
				bw.write(String.valueOf(stack.top+1));
			}
			if(s.equals("empty")) {
				if(stack.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			bw.newLine();
			bw.flush();
		}
	}

}
