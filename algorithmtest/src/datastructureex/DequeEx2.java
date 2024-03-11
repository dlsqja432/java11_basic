package datastructureex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Deque1 {
	int amount;
	int num;
	
	public Deque1(int amount, int num) {
		this.amount = amount;
		this.num = num;
	}
}

public class DequeEx2 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Deque<Deque1> deque = new ArrayDeque<>();
		
		for(int i=0; i<n; i++) {
			Deque1 d = new Deque1(sc.nextInt(), i+1);
			deque.add(d);
		}
		
		StringBuilder result = new StringBuilder();
		while(!deque.isEmpty()) {
			Deque1 deq = deque.pollFirst();
			result.append(deq.num + " ");
			int move = deq.amount;
			
			if(deque.isEmpty()) break;
			if(move > 0) {
				while(move-- > 1) {
					deque.addLast(deque.pollFirst());
				}
			} else {
				while(move++ < 0) {
					deque.addFirst(deque.pollLast());
				}
			}
		}
		System.out.println(result.toString());
		sc.close();
	}
}
