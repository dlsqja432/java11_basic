package datastructure;

class Node {
	int data;
	Node prev;
	Node next;
	
	// Node의 생성자
	Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {
	private Node head;
	private Node tail;
	
	// DoublyLinkedList의 생성자
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	// 이중 연결 리스트의 끝에 새 노드를 추가
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
	}
	
	// 이중 연결 리스트의 시작에 새 노드를 추가합니다.
	public void prepend(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			head.next = newNode;
			newNode.prev = head;
			head = newNode;
		}
	}
	
	// 이중 연결 리스트에서 노드를 특정 위치에 삽입합니다.
	public void insert(int index, int data) {
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		
		Node newNode = new Node(data);
		
		if(index == 0) { // 리스트의 시작에 삽입하는 경우
			prepend(data);
		} else if(index == size()) { // 리스트의 끝에 삽입하는 경우
			append(data);
		} else {
			Node current = head;
			for(int i=0; i < index - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			newNode.prev = current;
			current.next.prev = newNode;
			current.next = newNode;
		}
	}
	
	// 이중 연결 리스트에서 특정 위치의 노드를 삭제합니다.
	public void delete(int data) {
		Node current = head;
		while(current != null) {
			if(current.data == data) {
				head = current.next;
				if(head != null) {
					head.prev = null;
				}
				else {
					tail = null;
				}
			}
			else if(current == tail) {
				tail = current.prev;
				tail.next = null;
			}
			else {
				current.prev.next = current.next;
				current.next.prev = current.prev;
			}
			return;
		}
		current = current.next;
	}
	
	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class MyDoublyLinkedList {

	public static void main(String[] args) {

	}

}
