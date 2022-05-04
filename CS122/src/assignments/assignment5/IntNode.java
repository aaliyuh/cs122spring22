package assignments.assignment5;

//*************************************************************
//An inner class that represents a node in the integer list.
//The public variables are accessed by the IntList class.
//*************************************************************
class IntNode
{
	public int val; //value stored in node
	public IntNode next; //link to next node in list
	//------------------------------------------------------------------
	//Constructor; sets up the node given a value and IntNode reference
	//------------------------------------------------------------------
	public IntNode(int val, IntNode next)
	{
		this.val = val;
		this.next = next;
	}
}

