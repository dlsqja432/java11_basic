package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class QueueEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer input = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(input.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		int k = Integer.parseInt(input.nextToken());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!queue.isEmpty()) {
			for(int i=0; i<k-1; i++) {
				queue.add(queue.poll());
			}
			int x = queue.poll();
			if(queue.isEmpty()) {
				sb.append(x);
			} 
			else sb.append(x + ", ");
		}
		sb.append(">");
		bw.write(sb.toString());
		bw.flush();
	}
}
