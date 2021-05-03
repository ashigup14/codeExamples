package com.test.ds;

public class Node {

		String data;
		Node left, right;
		
		Node(String data)
		{
			this.data = data;
			this.right = null;
			this.left = null;
		}
		
		Node(String data, Node leftNode, Node rightNode)
		{
			this.data = data;
			this.right = rightNode;
			this.left = leftNode;
		}
		

}
