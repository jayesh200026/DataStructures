package com.ds;

/**
* @author jayeshkumar
*Every node will have 2 field ,one data,other reference to next node
*/
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		next=null;
	}
}