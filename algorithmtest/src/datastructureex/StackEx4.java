package datastructureex;

import java.util.Scanner;

class Stack4 {
	int top;
	int[] stackArray;
	int maxSize;
	
	public Stack4(int size) {
		this.maxSize = size;
		this.stackArray = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public void push(int x) {
		stackArray[++top] = x;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int tmp = stackArray[top];
			top--;
			return tmp;
		}
	}
	
	public int peek() {
		if(isEmpty()) return -1;
		else return stackArray[top];
	}
}

public class StackEx4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		Stack4 stack = new Stack4(n);
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			arr[i] = a;
			arr2[i] = 0;
		}
		
		int count = 0;
		for(int i=0; i<5; i++) {
			
			if(arr[i] == arr2[count]+1) {
				arr2[count] = arr[i];
				arr[i] = -1;
				count++;
			}
			
			else if(arr[i] < stack.peek() || stack.isEmpty()) {
				stack.push(arr[i]);
				arr[i] = -1;
			}
			
			else if(stack.peek() == count+1) {
				arr2[count] = stack.pop();
				count++;
			}
			
			else if(arr[i] > stack.peek() || arr[i] != count+1 || !stack.isEmpty()) {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
		
		scan.close();
	}

}















