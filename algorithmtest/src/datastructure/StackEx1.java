package datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Stack1 {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public Stack1(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(int x) {
		stackArray[++top] = x;
	}
	
	public int pop() {
		return stackArray[top--];
	}

	public int getTop() {
		return top;
	}
}

public class StackEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int k = Integer.parseInt(br.readLine());
		
		Stack1 stack = new Stack1(k);
		
		for(int i=0; i<k; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				stack.pop();
			}
			else {
				stack.push(a);
			}
		}
		
		int total = 0;
		int t = stack.getTop();
		for(int i=0; i<t+1; i++) {
			total = total + stack.pop();
		}
		
		bw.write(Integer.toString(total));
		bw.flush();
		bw.close();
		br.close();
	}

}
