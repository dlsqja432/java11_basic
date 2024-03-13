package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			String s = input.nextToken();
			if(s.equals("push_front")) {
				deque.addFirst(Integer.parseInt(input.nextToken()));
				continue;
			}
			if(s.equals("push_back")) {
				deque.addLast(Integer.parseInt(input.nextToken()));
				continue;
			}
			if(s.equals("pop_front")) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.pollFirst()));
			}
			if(s.equals("pop_back")) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.pollLast()));
			}
			if(s.equals("size")) {
				bw.write(String.valueOf(deque.size()));
			}
			if(s.equals("empty")) {
				if(deque.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			if(s.equals("front")) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.peekFirst()));
			}
			if(s.equals("back")) {
				if(deque.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(deque.peekLast()));
			}
			bw.newLine();
		}
		bw.flush();
	}
}
