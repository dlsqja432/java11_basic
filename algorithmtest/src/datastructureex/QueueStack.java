package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

class Queue2 {
	int front;
	int back;
	List<Integer> queueArray;
	int size;
	
	public Queue2() {
		this.queueArray = new LinkedList<Integer>();
		this.front = -1;
		this.back = 0;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(int x) {
		if(isEmpty()) {
			queueArray.add(back, x);
			front++;
		}
		else {
			back++;
			queueArray.add(back, x);
		}
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int tmp = queueArray.get(front);
			front++;
			size--;
			return tmp;
		}
	}
}

class Stack5 {
	int top;
	ArrayList<Integer> stackArray;
	
	public Stack5() {;
		this.stackArray = new ArrayList<Integer>();
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int x) {
		stackArray.add(++top, x);
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int tmp = stackArray.get(top);
			top--;
			return tmp;
		}
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		else return stackArray.get(top);
	}
}

public class QueueStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue2 queue = new Queue2();
		Stack5 stack = new Stack5();
		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int b = Integer.parseInt(st1.nextToken());
			arr1.add(b);
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int b = Integer.parseInt(st2.nextToken());
			if(arr1.get(i) == 0) {
				stack.push(b);
			}
		}
		
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		ArrayList<Integer> arr3 = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			int b = Integer.parseInt(st3.nextToken());
			queue.push(b);
		}
		
		for(int i=0; i<m; i++) {
			if(stack.isEmpty()) {
				arr3.add(queue.pop());
			}
			else {
				arr3.add(stack.pop());
			}
		}
		
		for(int x : arr3) {
			bw.write(String.valueOf(x));
			bw.write(" ");
		}
		bw.flush();
	}

}
