package datastructure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex6 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		int last = -1;
		
		for(int i=0; i<n; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			String s = input.nextToken();
			if(s.equals("push")) {
				last = Integer.parseInt(input.nextToken());
				queue.add(last);
				
				continue;
			}
			if(s.equals("pop")) {
				if(queue.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(queue.poll()));
			}
			if(s.equals("size")) {
				bw.write(String.valueOf(queue.size()));
			}
			if(s.equals("empty")) {
				if(queue.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			if(s.equals("front")) {
				if(queue.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(queue.peek()));
			}
			if(s.equals("back")) {
				if(queue.isEmpty()) bw.write("-1");
				else bw.write(String.valueOf(last));
			}
			bw.newLine();
		}
		bw.flush();
	}
}
