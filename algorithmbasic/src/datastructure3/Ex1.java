package datastructure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Ex1 {

	public static void main(String[] args) throws NumberFormatException, IOException, ScriptException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		s = postfix(s);
		for(int i=0; i<n; i++) {
			String t = br.readLine();
			s = s.replace((char)('A'+i) , t.charAt(0));
		}
		System.out.println(s);
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByExtension("JavaScript");
		
		Object result = engine.eval(s);
		System.out.println(result);
	}
	
	public static String postfix(String s) {
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<=25) {
				stack.add(s.charAt(i));
			}
			else {
				while(true) {
					stack2.add(stack.pop());
					if(stack.peek()-'A'>=0 && stack.peek()-'A'<=25) {
						stack.add(s.charAt(i));
						while(!stack2.isEmpty()) {
							stack.add(stack2.pop());
						}
						break;
					}
					else {
						stack2.add(stack.pop());
					}
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(char c : stack) {
			sb.append(c);
		}
		return sb.toString();
	}
}
