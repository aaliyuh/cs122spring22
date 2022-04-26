package classSamples.collections.Decode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
	LinkedList <String> list = new LinkedList<String>();

	public Queue() {
		this.list = new LinkedList<String>();
	}


	public void enqueue(String s) {
		// adding to the end of the linked list
		list.add(s);
	}

	public String dequeue() {
		return list.removeFirst();
	}

	public String peek() {
		return list.peek();
	}

	public boolean empty() {
		return list.isEmpty();
	}

}
