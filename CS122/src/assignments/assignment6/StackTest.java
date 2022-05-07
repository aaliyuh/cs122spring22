package assignments.assignment6;


//***************************************************************
//StackTest.java
//
//A simple driver to test a stack.
//
//***************************************************************
import java.util.Stack;
public class StackTest
{
	public static void main(String[] args)
	{
		//Declare and instantiate a stack
		Stack stack = new Stack();
		//push some stuff on the stack
		for (int i=0; i<10; i++)
			stack.push(i);
		stack.push(5);
		//call printStack to print the stack
		printStack(stack);
		//call reverseStack to reverse the stack
		stack = reverseStack(stack);
		//call printStack to print the stack again
		printStack(stack);
		//call removeElement to remove all occurrences of the value 5 - save the
		//stack returned from this call
		stack = removeElement(stack, 5);
		//call printStack to print the original stack and the new stack.
		printStack(stack);
	}

	private static Stack removeElement(Stack stack, int i) {
		// TODO Auto-generated method stub
		Stack<Integer> item = new Stack();
		while (!stack.empty()) {
			int e = (int)stack.pop();
			if (e != i) {
				item.push(e);
			}
		}
		return item;
	}

	private static Stack reverseStack(Stack stack) {
		// TODO Auto-generated method stub
		Stack item1 = new Stack();
		while(!stack.empty()) {
			item1.push(stack.pop());
		}
		return item1;
	}

	private static void printStack(Stack stack) {
		// TODO Auto-generated method stub
		Object[] stackList = stack.toArray();
		for (Object element : stackList) {
			System.out.println(element);
		}
		
	} 
}