package datastructureex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
//양수면, pollfront값을 pushback
//음수면, polllast값을 pushfront
public class DequeEx2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new LinkedList<Integer>();
		Deque<Integer> dequeCopy = new LinkedList<Integer>();
		Deque<Integer> dequeNew = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer input = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			deque.add(Integer.parseInt(input.nextToken()));
		}
		int seq = deque.pollFirst();
		dequeNew.add(seq);
		for(int i=0; i<n-1; i++) {
			if(seq >= 0) {
				for(int j=0; j<seq-1; j++) {
					deque.addLast(deque.pollFirst());
				}
				dequeNew.add(deque.pollFirst());
			}
			
			else {
				for(int j=0; j<-seq-1; j++) {
					deque.addFirst(deque.pollLast());
				}
				dequeNew.add(deque.pollLast());
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(dequeNew.pollFirst() + " ");
		}
	}
}
