package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackEx4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		Stack<Integer> line1 = new Stack<>();
		Stack<Integer> line2 = new Stack<>();
		
		for(int i=0; i<n; i++) {
			arr[n-i-1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			line1.push()
		}
	}

}
