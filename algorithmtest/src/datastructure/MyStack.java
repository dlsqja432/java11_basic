package datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Stacks {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public int getTop() {
		return top;
	}

	public Stacks(int size) {
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
		if(isEmpty()) return -1;
		return stackArray[top--];
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		return stackArray[top];
	}
}

public class MyStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(br.readLine());
		Stacks stack = new Stacks(x);
		
		for(int i=0; i<x; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a==1) {
				int b = Integer.parseInt(st.nextToken());
				stack.push(b);
			}
			
			if(a==2) {
				bw.write(Integer.toString(stack.pop()) + "\n");
			}
			if(a==3) {
				bw.write(Integer.toString((stack.getTop()+1))+ "\n");
			}
			if(a==4) {
				if(stack.isEmpty()) bw.write("1\n");
				else bw.write("0\n");
			}
			if(a==5) {
				bw.write(Integer.toString(stack.peek())+ "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
