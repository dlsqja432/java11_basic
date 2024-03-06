package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DequeEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int input = Integer.parseInt(st.nextToken());
			
			if(input == 1) {
				deque.addFirst(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(input == 2) {
				deque.addLast(Integer.parseInt(st.nextToken()));
				continue;
			}
			else if(input == 3) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.pollFirst()));
			}
			else if(input == 4) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.pollLast()));
			}
			else if(input == 5) bw.write(String.valueOf(deque.size()));
			else if(input == 6) {
				if(deque.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			else if(input == 7) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.peekFirst()));
			}
			else if(input == 8) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.peekLast()));
			}
			else continue;
			bw.newLine();
		}
		bw.flush();
	}
}
