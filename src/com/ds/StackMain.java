package com.ds;

public class StackMain {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		//stack.pop();
		//stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		System.out.println("Stack top is "+stack.peek());

	}

}
