package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
				if(pQueue.isEmpty()) {
					bw.write("0");
				}
				else  {
					bw.write(String.valueOf(pQueue.poll()));
				}
				bw.newLine();
			}
			
			else {
				pQueue.offer(x);
			}
		}
		bw.flush();
	}
}
