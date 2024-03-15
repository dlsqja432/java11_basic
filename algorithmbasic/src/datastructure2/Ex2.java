package datastructure2;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		String s = sc.next();
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(i==0) {
				stack.add(s.charAt(i));
				continue;
			}
			if(s.charAt(i) == '(') {
				if(!stack.isEmpty() && stack.peek() == '(' && s.charAt(i-1)=='(') {
					count++;
				}
				stack.add(s.charAt(i));
			}
			if(s.charAt(i) == ')') {
				stack.pop();
				if(s.charAt(i) != s.charAt(i-1)) {
					count += stack.size();
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
