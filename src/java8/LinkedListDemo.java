package java8;

import java.util.LinkedList;

public abstract class LinkedListDemo {
	
	static
	{
		System.out.println("Class LinkedListDemo loaded");
	}

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		MLinkedList mLinkedList = new MLinkedList();
		for(Long i = 0L ;i <= Long.parseLong("1000") ;i++)
		{
			mLinkedList.add(i);
			System.out.println("added Element " + i);
		}
		mLinkedList.add(1000,50);
		mLinkedList.add(1000,51);
		mLinkedList.add(1000,52);
		mLinkedList.displayList();
	}

}
