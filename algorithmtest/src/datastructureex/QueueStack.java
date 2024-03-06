package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Deque;

public class QueueStack {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n1 = Integer.parseInt(br.readLine());
		int[] queueStackArr = new int[n1];
		Deque<Integer> currentList = new LinkedList<>();
		StringTokenizer input1 = new StringTokenizer(br.readLine());
		for(int i=0; i<n1; i++) {
			queueStackArr[i] = Integer.parseInt(input1.nextToken());
		}
		
		StringTokenizer input2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n1; i++) {
			int b = Integer.parseInt(input2.nextToken());
			if(queueStackArr[i] == 0) {
				currentList.add(b);
			}
		}
		
		int n2 = Integer.parseInt(br.readLine());
		StringTokenizer input3 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n2; i++) {
			if(currentList.isEmpty()) {
				sb.append(input3.nextToken());
				sb.append(" ");
			}
			else {
				currentList.addFirst(Integer.parseInt(input3.nextToken()));
				sb.append(currentList.pollLast());
				sb.append(" ");
			}
		}
		
		String result = sb.toString();
		result = result.trim();
		bw.write(result);
		bw.flush();
	}
}





















