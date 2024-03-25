package math3;

import java.util.Scanner;
import java.util.Stack;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			arr[i] = x;
		}
		int n = convertToDecimal(arr, a);
		
		Stack<Integer> stack = convertToOther(n, b);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	public static int convertToDecimal(int[] arr, int a) {
		int result = 0;
		int mul = 1;
		for(int i=arr.length-1; i>=0; i--) {
			result += arr[i]*mul;
			mul *= a;
		}
		return result;
	}
	
	public static Stack<Integer> convertToOther(int n, int b) {
		Stack<Integer> stack = new Stack<>();
		while(n!=0) {
			stack.add(n%b);
			n /= b;
		}
		return stack;
	}
}
