package datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer input = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] count = new int[1000001];
		int[] result = new int[n];
		Stack<Integer> stack = new Stack<>();
		
 		for(int i=0; i<n; i++) {
 			arr[i] = Integer.parseInt(input.nextToken());
 			count[arr[i]]++;
		}
 		
 		for(int i=0; i<n; i++) {
 			while(!stack.isEmpty() && count[arr[stack.peek()]] < count[arr[i]]) {
 				result[stack.pop()] = arr[i];
 			}
 			stack.push(i);
 		}
 		
 		while(!stack.isEmpty()) {
 			result[stack.pop()] = -1;
 		}
 		
 		StringBuilder sb = new StringBuilder();
 		for(int i : result) {
 			sb.append(i+ " ");
 		}
 		System.out.println(sb.toString());
	}
}