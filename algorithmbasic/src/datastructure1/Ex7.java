package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer input = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(input.nextToken());
		int k = Integer.parseInt(input.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			queue.add(i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(!queue.isEmpty()) {
			if(queue.size() == 1) {
				sb.append(queue.poll() + ">");
				break;
			}
			
			for(int i=0; i<k-1; i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		bw.write(sb.toString());
		bw.flush();
	}
}
