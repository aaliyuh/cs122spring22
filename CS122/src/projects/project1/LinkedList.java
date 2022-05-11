package projects.project1;
import assignments.assignment5.Node;
import assignments.assignment5.QueueADT;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LinkedList implements QueueADT {

	private Node front, back;
	private int numElements;
	//---------------------------------------------
	// Constructor; initializes the front and back pointers
	// and the number of elements.
	//---------------------------------------------
	public LinkedList()
	{
		front = back = null;
		numElements = 0;
	}
	//---------------------------------------------
	// Puts item on end of queue.
	//---------------------------------------------
	public void enqueue(Object item)
	{
		Node node = new Node(item);
		numElements++;
		if (back == null) {
			back = node;
			back.setNext(node);
			return;
		}
	}
	//---------------------------------------------
	// Removes and returns object from front of queue.
	//---------------------------------------------
	public Object dequeue()
	{
		if (front==null) {
			return null;
		}
		Object item = null;
		numElements--;
		return item;
	}
	//---------------------------------------------
	// Returns true if queue is empty.
	//---------------------------------------------
	public boolean isEmpty()
	{
		if( numElements == 0)
		{
			return true;
		} else
			return false;

	}
	//---------------------------------------------
	// Returns true if queue is full, but it never is.
	//---------------------------------------------
	public boolean isFull()
	{
		return false;
	}
	//---------------------------------------------
	// Returns the number of elements in the queue.
	//---------------------------------------------
	public int size()
	{
		return numElements;
	}

	//---------------------------------------------
	// Returns a string containing the elements of the queue
	// from first to last
	//---------------------------------------------
	public String toString()
	{
		String result = "\n";
		Node temp = front;
		while (temp != null)
		{
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}
		return result;
	}

}
