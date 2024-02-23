package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackEx2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			String input = br.readLine();
			if(isCorrect(input)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static boolean isCorrect(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == '(') {
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		return stack.isEmpty();
	}
}
