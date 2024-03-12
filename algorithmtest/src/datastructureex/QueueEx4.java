package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Document {
	int imp;
	int index;
	
	public Document(int index, int imp) {
		this.imp = imp;
		this.index = index;
	}
}

public class QueueEx4 {
	
	static LinkedList<Document> queue;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		queue = new LinkedList<>();
		
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			StringTokenizer input = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(input.nextToken());
			int m = Integer.parseInt(input.nextToken());
			StringTokenizer qInput = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				Document d = new Document(j, Integer.parseInt(qInput.nextToken()));
				queue.add(d);
			}
			bw.write(String.valueOf(solution(m)));
			bw.newLine();
			queue.clear();
		}
		bw.flush();
	}
	
	public static int solution(int m) {
		int findIt = 0;
		
		while(!queue.isEmpty()) {
			Document first = queue.poll();
			boolean isMax = true;
			
			for(int i=0; i<queue.size(); i++) {
				if(first.imp < queue.get(i).imp) {
					queue.offer(first);
					
					for(int j=0; j<i; j++) {
						queue.offer(queue.poll());
					}
					
					isMax = false;
					break;
				}
			}
			if(isMax == false) {
				continue;
			}
			
			findIt++;
			
			if(first.index == m) {
				break;
			}
		}
		return findIt;
	}
}
