package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import javax.script.ScriptException;

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException, ScriptException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		Double[] values = new Double[n];
		for(int i=0; i<n; i++) {
			values[i] = Double.parseDouble(br.readLine());
		}
		Stack<Double> stack = new Stack<>();
		double result = 0;
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(Character.isAlphabetic(c)) {
				stack.add(values[c - 'A']);
			} else {
				double b = stack.pop();
				double a = stack.pop();
				switch(c) {
				case '+' : 
					result = a + b;
					break;
				case '-' :
					result = a - b;
					break;
				case '*' : 
					result = a * b;
					break;
				case '/' :
					result = a / b;
					break;
				}
				stack.push(result);
			}
		}
		System.out.printf("%.2f", result);
	}
	
	
//	** 후위표기식 식으로 정리하는 함수 ** 
//	public static String postfix(String s) {
//		Stack<Character> stack = new Stack<>();
//		Stack<Character> stack2 = new Stack<>();
//		for(int i=0; i<s.length(); i++) {
//			if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<=25) {
//				stack.add(s.charAt(i));
//			}
//			else {
//				while(true) {
//					stack2.add(stack.pop());
//					if(stack.peek()-'A'>=0 && stack.peek()-'A'<=25) {
//						stack.add(s.charAt(i));
//						while(!stack2.isEmpty()) {
//							stack.add(stack2.pop());
//						}
//						break;
//					}
//					else {
//						stack2.add(stack.pop());
//					}
//				}
//			}
//		}
//		StringBuilder sb = new StringBuilder();
//		for(char c : stack) {
//			sb.append(c);
//		}
//		return sb.toString();
//	}
}
