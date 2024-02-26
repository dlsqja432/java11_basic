package datastructure;

//class Node {
//	int data;
//	Node next;
//	
//	// 노드 생성자
//	Node(int data) {
//		this.data = data;
//		this.next = null;
//	}
//}

class LinkedList {
	private Node head;
	
	// 연결 리스트 생성자
	public LinkedList() {
		this.head = null;
	}
	
	// 연결 리스트의 끝에 새 노드를 추가합니다
	public void append(int data) {
		if(head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	// 연결 리스트의 특정 위치에 새 노드를 삽입합니다.
	public void insert(int index, int data) {
		if(index < 0 || index > size()) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		if(index == 0) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}
		Node current = head;
		for(int i=0; i<index-1; i++) {
			current = current.next;
		}
		Node newNode = new Node(data);
		newNode.next = current.next;
		current.next = newNode;
	}
	
	// 연결 리스트에서 특정 위치의 노드를 삭제합니다.
	public void remove(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException("Invalid index");
		}
		if(index == 0) {
			head = head.next;
			return;
		}
		Node current = head;
		for(int i=0; i<index-1; i++) {
			current = current.next;
		}
		current.next = current.next.next;
	}
	
	// 연결 리스트의 크기를 반환합니다.
	public int size() {
		int count = 0;
		Node current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	// 연결 리스트를 출력합니다.
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.append(10);
		myList.append(20);
		myList.append(30);
		myList.display();
		
		myList.insert(1, 15);
		myList.display();
		
		myList.remove(2);
		myList.display();
	}
}
