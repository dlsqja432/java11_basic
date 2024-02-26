package datastructure;

import java.util.Scanner;

class Queue {
	private int[] queueArray; // 큐의 배열
	private int front; 	      // 큐의 맨 앞 요소의 인덱스
	private int rear;		  // 큐의 맨 뒤 요소의 인덱스
	private int size;		  // 큐의 현재 크기
	private int capacity;	  // 큐의 용량 (배열의 크기)
	
	// queue의 생성자
	public Queue(int capacity) {
		this.capacity = capacity;
		queueArray = new int[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}
	
	// queue에 요소 추가
	public void enqueue(int item) {
		if(isFull()) {
			System.out.println("queue is full.");
			return;
		}
		rear = (rear+1)%capacity;
		queueArray[rear] = item;
		size++;
	}
	
	// 큐에서 요소를 제거하고 반환
	public int dequeue() {
		if(isEmpry()) {
			System.out.println("queue is empty");
			return -1;
		}
		int dequeueItem = queueArray[front];
		front = (front+1) % capacity;
		size--;
		return dequeueItem;
	}
	
	// 큐의 맨 앞에 있는 요소를 반환합니다.
	public int peek() {
		if(isEmpry()) {
			System.out.println("queue is empty");
			return -1;
		}
		return queueArray[front];
	}
	
	// 큐가 비어있는지 확인
	public boolean isEmpry() {
		return size == 0;
	}
	
	// 큐가 가득 차 있는지 확인
	public boolean isFull() {
		return size == capacity;
	}
	
	// 큐에 들어있는 요소의 개수를 반환
	public int size() {
		return size;
	}
}

public class MyQueue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		Queue queue = new Queue(input);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println("peek : " + queue.peek());
		System.out.println("Dequeue : " + queue.dequeue());
		System.out.println("size : " + queue.size());
		System.out.println("peek : " + queue.peek());
		System.out.println("Dequeue : " + queue.dequeue());
		System.out.println("Dequeue : " + queue.dequeue());
		System.out.println(queue.isEmpry());
	}

}
