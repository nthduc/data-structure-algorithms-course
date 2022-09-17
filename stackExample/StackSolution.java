package stackExample;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
	
	public static void main(String[] args) {
		// LIFO -> Last In First Out
		// Create a Stack
		Stack<Integer> s1 = new Stack<>();
		
		// insert element into stack
		s1.push(2);
		s1.push(4);
		s1.push(9);
		System.out.println(s1); // Output : [2, 4, 9]
		
		// remove top Element
		s1.pop();
		System.out.println(s1); // Output : [2, 4]
		// Peek operation
		System.out.println(s1.peek()); // Output : 4
		//s1.pop();
		//s1.pop();
		// check s1 Empty ?
		boolean status = s1.empty();
		System.out.println(status); // Output : true
		
		int indexFound = s1.search(4);
		System.out.println(indexFound);
		// how to iterate over a stack (lap lai) Loop in stack
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			Object s2  = it.next();
			System.out.print(s2 + " ");
		}
		System.out.println("\n----------------------");
		System.out.println(s1.size()); // size in stack
		s1.sort(null);
		System.out.println(s1);
	}
}
