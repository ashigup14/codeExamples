package com.test.lrucache;

public class Node {

	private int key;

	private int val;
	private Node prev;
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public void setVal(int val) {
		this.val = val;
	}

	public int getKey() {
		return key;
	}

	public int getVal() {
		return val;
	}

	private Node next;
	
	public Node(int key, int val) {
		this.key = key;
		this.val = val;
	}
	
	public Node() {
		
	}
}
