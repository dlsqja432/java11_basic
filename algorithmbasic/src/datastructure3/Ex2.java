package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		System.out.println(postfix(s));
	}
	
	public static String postfix(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				sb.append(c);
			}
			
			else if(c == '(') {
				stack.push(c);
			}
			
			else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			
			else {
				while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
					sb.append(stack.pop());
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	
	private static int precedence(char op) {
		if(op == '+' || op == '-') {
			return 1;
		} else if(op == '*' || op == '/') {
			return 2;
		}
		return 0;
	}
}
