package datastructureex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Stack2 {
	int top;
	int[] stackArray;
	int maxSize;
	
	public Stack2(int size) {
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

public class StackEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		Stack2 stack = new Stack2(n);
		int current = 1;
		
		for(int i=0; i<n; i++) {
			int a = Integer.parseInt(br.readLine());
			
			while(a >= current) {
				stack.push(current);
				sb.append("+\n");
				current++;
			}
			
			if(stack.isEmpty() || stack.peek() != a) {
				System.out.println("NO");
				return;
			}
			else {
				stack.pop();
				sb.append("-\n");
			}
		}
		System.out.println(sb);
	}

}


























