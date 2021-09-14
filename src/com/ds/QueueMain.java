package com.ds;

public class QueueMain {

	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.enueue(56);
		queue.enueue(30);
		queue.enueue(72);
		queue.display();
		queue.dequeue();
		queue.display();
	}

}
