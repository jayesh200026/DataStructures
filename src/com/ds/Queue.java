package com.ds;

public class Queue {
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public void enueue(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
		}
		
			}
	
	public void display() {
		if(head==null) {
			System.out.println("empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
	public void dequeue() {
		if(head==null) {
			System.out.println("empty");
		}
		else {
			head=head.next;
		}
	}

}
