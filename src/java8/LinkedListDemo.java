package java8;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		MLinkedList mLinkedList = new MLinkedList();
		for(Long i = 0L ;i <= Long.parseLong("100") ;i++)
		{
			mLinkedList.add(i);
		}
		mLinkedList.add(1000,50);
		mLinkedList.displayList();
	}

}
