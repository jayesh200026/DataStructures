package com.ds;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(72);
		//linkedlist.search(30);
		linkedlist.addAfter(30,40);
		linkedlist.deleteNode(30);
		//linkedlist.deleteLast();
		linkedlist.inBetween(20, 3);
		linkedlist.print();
		
		OrderedLinkedList orderedList = new OrderedLinkedList();
		orderedList.add(56);
		orderedList.add(30);
		orderedList.add(40);
		orderedList.add(72);
		System.out.println("ordered list is");
		orderedList.print();
	}

}
