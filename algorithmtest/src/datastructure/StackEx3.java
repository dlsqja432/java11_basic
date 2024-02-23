package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while((input=br.readLine())!=null) {
			if(input.equals("."))
				break;
			
			if(isCorrectLine(input)) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
	
	public static boolean isCorrectLine(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '(' || ch == '[') {
				stack.push(ch);
			}
			if(ch == ')' || ch ==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
