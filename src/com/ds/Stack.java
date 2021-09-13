package com.ds;

/**
 * @author jayeshkumar Implemeted stack using linkedlist
 */
public class Stack {
	Node head;
	int size;
	int top;
	LinkedList stack = new LinkedList();
	
	Stack(int size){
		this.size=size;
		top=-1;
	}
	
	public boolean isFull(){
		//System.out.println("top= "+top+"Size= "+size);
		if(top==size-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(top==-1) {
			return true;
		}
		return false;
	}

	/**
	 * @param data value of node Adds new node at the begining.This will call the
	 *             push method defined in LinkedList class
	 */
	public void push(int data) {
		if(isFull()) {
			System.out.println("Overflow");
			return;
		}

		head = stack.push(data);
		top++;

	}

	/**
	 * @return the top value of stack. Doesn't remove the top element,just returns
	 *         the content
	 */
	public int peek() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return -1;
		}
		/*if (head == null) {
			System.out.println("Stack is empty:Underflow");
			return 0;
		}*/
		return (int) head.data;

	}

	/**
	 * Prints the content of stack
	 */
	public void display() {
		if (head == null) {
			System.out.println("empty");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + "---> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	/**
	 * Removes the top element of the stack
	 */
	public void pop() {
		if(isEmpty()) {
			System.out.println("Underflow");
			return;
		}
		
		/*if (head == null) {
			System.out.println("empty stack");
			return;
		}*/
		head = head.next;
		top--;
	}

}
