package datastructureex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Queue1 {
	int front;
	int back;
	ArrayList<Integer> queueArray;
	int size;
	
	public Queue1() {
		this.queueArray = new ArrayList<Integer>();
		this.front = -1;
		this.back = 0;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(int x) {
		if(front == -1) {
			queueArray.add(back, x);
			front++;
		}
		else {
			queueArray.add(++back, x);
		}
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
			int tmp = queueArray.get(front);
			front++;
			size--;
			return tmp;
		}
	}
	
	public int front() {
		if(isEmpty()) return -1;
		else return queueArray.get(front);
	}
	
	public int back() {
		if(isEmpty()) return -1;
		else return queueArray.get(back);
	}
}

public class QueueEx1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		Queue1 queue = new Queue1();
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				queue.push(Integer.parseInt(st.nextToken()));
				continue;
			}
			
			if(s.equals("pop")) {
				bw.write(String.valueOf(queue.pop()));
			}
			
			if(s.equals("front")) {
				bw.write(String.valueOf(queue.front()));
			}
			
			if(s.equals("back")) {
				bw.write(String.valueOf(queue.back()));
			}
			
			if(s.equals("empty")) {
				if(queue.isEmpty()) bw.write("1");
				else bw.write("0");
			}
			
			if(s.equals("size")) {
				bw.write(String.valueOf(queue.size));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
