package java8;

public class MLinkedList {
	
	private Node head;
	
	public boolean add(Object data)
	{
		boolean result = false;
		Node n = new Node();
		n.setData(data);
		if(head == null)
		{
			head = n;
			result = true;
		}
		else
		{
			Node traverser = head;
			while(traverser.getNext() != null)
			{
				traverser = (Node) traverser.getNext();
			}
			traverser.setNext(n);
			result = true;
		}
		return result;
	}


	public boolean add(Object data, int pos)
	{
		boolean result = false;
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		if(pos == 0)
		{
			n.setNext(head);
			head = n;
			result = true;
		}
		else
		{
			Node traverser = head;
			int counter = 0;
			while(traverser.getNext() != null && counter < pos-1)
			{
				traverser = (Node) traverser.getNext();
				counter++;
			}
			if(traverser.getNext() == null)
			{
				System.out.println("Index Specified is greater than the list length, So inserting Data at end of List");
			
				traverser.setNext(n);
				result = true;
			}
			else
			{
				n.setNext(traverser.getNext());
				traverser.setNext(n);
				result = true;
			}
			
		}
		return result;
	}

	
	public void displayList()
	{
		int pos = 0;
		Node traverser = head;
		while(traverser.getNext() != null)
		{
			System.out.println("Printing Element in " + pos + " = " + traverser.getData());
			traverser = (Node) traverser.getNext();
			pos++;
		}
		System.out.println("Printing Element in " + pos + " = " + traverser.getData());
	}
	
}
