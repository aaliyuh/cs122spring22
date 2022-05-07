package assignments.assignment6;

//***************************************************************
//LinkedStack.java
//
//A linked implementation of an Object stack class with operations push,
//pop, and isEmpty and isFull.
//
//***************************************************************
public class LinkedStack implements StackADT
{
	private Node top; // reference to top of stack
	//------------------------------------------------
	//Constructor -- initializes top
	//---------------------------------------------------
	public LinkedStack()
	{
		top = null;
	}
	//---------------------------------------------------
	//Adds element to top of stack if it's not full, else
	//does nothing.
	//---------------------------------------------------
	public void push(Object val)
	{
		Node test = new Node(val);
		test.setNext(top);
		top = test;
	}
	//---------------------------------------------------
	//Removes and returns value at top of stack. If stack
	//is empty returns null.
	//---------------------------------------------------
	public Object pop()
	{
		if (isEmpty()) {
			return null;
		}
		Object test2 = top.getElement();
		top = top.getNext();
		return test2;
	}
	//---------------------------------------------------
	//Returns true if stack is empty, false otherwise.
	//---------------------------------------------------
	public boolean isEmpty()
	{
		return top == null;
	}
	//---------------------------------------------------
	//Returns true if stack is full, false otherwise.
	//---------------------------------------------------
	public boolean isFull()
	{
		return false;
	}
} 
