package com.ds;




/**
 * @author jayeshkumar
 *Linked list is collection of nodes
 *Implemented features of linked list like adding,removing
 */
public class LinkedList {
	
	public Node head;
	
	
	/**
	 * @param data the value node will store
	 * @return head of the linked list
	 * Add the new node at end
	 */
	public  Node add(final int data) {
		
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return head;
			
		}
		else {
			Node temp=head;
			while(temp.next != null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return head;
	}
	
	
	/**
	 * @param data 
	 * @return head of the list
	 * Adds new node at begining
	 */
	public Node push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
		return head;
		
	}
	
	
	/**
	 * @param data value of node
	 * @param dest index where the node needs to be added
	 */
	public void inBetween(int data,int dest)
	{
	
		if(dest==1) {
			push(data);
		}
		else {
			Node newNode = new Node(data);
			int count =1;
			Node temp=head;
			Node q=temp;
			while(count < dest) {
				q=temp;
				temp=temp.next;
				count++;
			}
			q.next=newNode;
			newNode.next=temp;
			
		}
		
	}
	
	/**
	 *  Deletes the first node from linkedList
	 */
	public void deleteFirst()  {//USECASE5
		if(head==null) {
			System.out.println("Underflow");
			return;
		}
		Node temp=head;
		if(head.next==null) {
			head=null;
		}
		else {
			head=temp.next;
		}
	}
	
	/**
	 *  Deleted the last node from LinkedList
	 */
	public void deleteLast()  {//USECASE6
		if(head==null) {
			System.out.println("Underflow");
			return;
		}
		Node temp=head;
		Node q=temp;
		if(head.next==null) {
			head=null;
		}
		else {
			while(temp.next!=null) {
				q=temp;
				temp=temp.next;
			}
			q.next=null;
		}
	}
	
	/**
	 * @param data values to be searched
	 * Travers the linkedlist to search for particular node.
	 */
	public void search(int data) {//USECASE7
		Node temp=head;
		int count=0;
		if(head==null) {
			System.out.println("Underflow");
			return;
		}
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("Found at "+(count+1));
				return;
			}
			else {
				temp=temp.next;
				count++;
			}
		}
	}
	
	/**
	 *  Prints the content of linkedlist
	 */
	public void print() {
		Node temp= head;
		if(temp==null) {
			System.out.println("Underflow");
			return;
		}
		while(temp.next!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	/**
	 * @param key value of existing node
	 * @param data value of new node
	 * 
	 * Add newnode after the exiting node with value=key
	 */
	public void addAfter(int key, int data) {//USECASE8
		
		Node newNode= new Node(data);
		if(head==null) {
			System.out.println("underflow");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==key) {
				if(temp.next==null) {
					temp.next=newNode;
					return;
				}
				else {
					newNode.next=temp.next;
					temp.next=newNode;
					return;
				}
				
				
				
			}
			temp=temp.next;
		}
		System.out.println("Key not found");
		
		
		
	}
	
	/**
	 * @param data value of node to be deleted
	 * 
	 * Deletes a particular node with value=data
	 */
	public void deleteNode(int data) {

		if(head==null) {
			System.out.println("underflow");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		else {
			Node temp=head;
			Node q=temp;
			while(temp.next!=null) {
				if(temp.data==data) {
					q.next=temp.next;
					
				}
				q=temp;
				temp=temp.next;
			}
		}
		
		
	}
	
	

}
