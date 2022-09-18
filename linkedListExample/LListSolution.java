package linkedListExample;

public class LListSolution {
	Node head, tail;
	class Node {
		int data;
		Node next;
		
		
		Node (int data) {
			this.data = data;
		}
	}
	// add elements
	void insertElement(int data) {
		Node newNode = new Node(data);
		if(head == null && head == null) { 
			head = newNode;
			tail = newNode;
			tail.next = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	// display all elements
	void displayElements() {
		Node n1 = head;
		if(tail == null) {
			System.out.println("Circular LL is Empty");
		} else {
			do {
				System.out.println(n1.data);
				n1=n1.next;
			}while(tail.next!=head);
		}
		
	}
	// delete elements
	void deleteElements() {
		if(tail != head) {
			head = head.next;
			tail.next = head;
		} else {
			
		}
	}
	public static void main(String[] args) {
		LListSolution list1 = new LListSolution();
		list1.insertElement(2);
		list1.insertElement(7);
		list1.insertElement(10);
		list1.displayElements();
		list1.deleteElements();
		list1.displayElements();
	}
}
