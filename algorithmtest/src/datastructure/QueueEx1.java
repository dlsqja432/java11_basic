package datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class QueueEx {
	private int[] queueArray;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	public QueueEx(int capacity) {
		this.capacity = capacity;
		queueArray = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}
	
	public void push(int x) {
		queueArray[++rear] = x; 
		size++;
	}
	
	public int pop() {
		if(isEmpty()) {
			return -1;
		}
		int popNum = queueArray[front];
		front++;
		size--;
		return popNum;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}

	public int getFront() {
		if(isEmpty()) {
			return -1;
		}
		return queueArray[front];
	}

	public int getRear() {
		if(isEmpty()) {
			return -1;
		}
		return queueArray[rear];
	}

	
}

public class QueueEx1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		QueueEx queue = new QueueEx(n);
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			if(s.equals("push")) {
				int a = Integer.parseInt(st.nextToken());
				queue.push(a);
				continue;
			}
			
			if(s.equals("pop"))
				bw.write(String.valueOf(queue.pop()));
			
			if(s.equals("size")) 
				bw.write(String.valueOf(queue.size()));
			
			if(s.equals("empty")) {
				if(queue.isEmpty()) bw.write("1");
				else bw.write("0");;
			}
			
			if(s.equals("front"))
				bw.write(String.valueOf(queue.getFront()));
			
			if(s.equals("back"))
				bw.write(String.valueOf(queue.getRear()));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
