package datastructure2;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = reverseString(str);
		System.out.println(str);
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		int index = 0;
		while(index != s.length()) {
			if(s.charAt(index) == '<') {
				if(!stack.isEmpty()) {
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
				}
				while(s.charAt(index) != '>') {
					sb.append(s.charAt(index));
					index++;
				}
				sb.append(s.charAt(index));
				index++;
			}
			
			else {
				if(s.charAt(index) == ' ') {
					if(!stack.isEmpty()) {
						while(!stack.isEmpty()) {
							sb.append(stack.pop());
						}
					}
					sb.append(" ");
				}
				else {
					stack.add(s.charAt(index));
				}
				index++;
			}
		}
		if(!stack.isEmpty()) {
			while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
		}
		return sb.toString();
	}
}
