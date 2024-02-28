package datastructureex;

class Deque {
	int front;
	int back;
	int[] dequeArray;
	int maxSize;
	int size;
	
	public Deque(int size) {
		this.maxSize = size;
		this.dequeArray = new int[size];
		this.front = 0;
		this.back = -1;
		this.size = 0;
	}
	
	public void pushFront(int x) {
	}
	
	public void pushBack(int x) {
		if(isEmpty()) {
			front++;
			back++;
			dequeArray[back] = x;
		}
		else {
			back++;
			dequeArray[back] = x;
		}
	}
	
	public int popFront() {
		if(isEmpty()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean isEmpty() {
		if(front==-1 && back==-1) {
			return true;
		}
		else return false;
	}
}

public class DequeEx1 {

	public static void main(String[] args) {

	}
}
