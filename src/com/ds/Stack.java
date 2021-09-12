package com.ds;



public class Stack {
	Node head;
	
	class Node<T>{
		T data;
		Node next;
		
		Node(T data){
			this.data=data;
			next=null;
		}
		
	}
	
	//LinkedList stack = new LinkedList(); //implementing stack using linkedlist
	
	public void push(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			
		}
		else {
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	public int peek() {
		if(head==null) {
			System.out.println("Stack is empty:Underflow");
			return 0;
		}
		return (int) head.data;
		
	}
	
	public void display() {
		if(head==null) {
			System.out.println("empty");
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			System.out.print(temp.data+"---> ");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
public void pop() {
	if(head==null) {
		System.out.println("empty stack");
		return;
	}
	head=head.next;
}
	

}
