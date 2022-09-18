package linkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList {
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		// adding elements to Linked list
		l1.add(3);
		l1.add(7);
		l1.add(10); // Output : 3,7,10
		l1.add(2,6); // index 2 -> value 6 . Output: 3,7,6,10
		// remove elements from linked list
		l1.remove(2); // remove index 2 Output: 3,7,10
		l1.removeFirst(); // Output: 7,10
		l1.removeLast(); // Output: 7
		
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n----------------------");
		System.out.println(l1.size());
		boolean b1 = l1.contains(7); // check co chua so 7 trong Linked list hay khong
		System.out.println(b1); // Output : true
		
		// copy elements from stack to linked list
		
		Stack<String> s1 = new Stack<>();
		LinkedList<String> l2 = new LinkedList<>();
		
		s1.push("hello");
		s1.push("everyone");
		l2.addAll(s1);
		
		Iterator it2 = l2.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}
	
		/* 
		 * 1 Insert
		 * 2 Delete
		 * 3 Display the contents of linked list
		 * */
	}
}
