package com.test.ds;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class LeftViewBtree {

	int maxLevel = 0;
	
	void leftview(Node root,int level,  List<Integer> result)
	{
		if(root == null)
			return;
		
		if(maxLevel < level)
		{
			result.add(root.data);
			maxLevel = level;
		}
		
		leftview(root.left, level+1, result);
		leftview(root.right, level+1, result);
	}
	
	void rightView(Node root,int level,  List<Integer> result)
	{
		if(root == null)
			return;
		
		if(maxLevel < level)
		{
			result.add(root.data);
			maxLevel = level;
		}
		
		leftview(root.left, level+1, result);
		leftview(root.right, level+1, result);
	}
	
	public static void main(String args[])
	{
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		
		List<Integer> result = new ArrayList<>();
		LeftViewBtree lftView = new LeftViewBtree();
		lftView.leftview(root,1, result);
		result.stream().forEach(System.out::println);
	}
	

}

class Node{
	int data;
	Node left, right;
	
	Node(int data)
	{
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

/*
 *    1        ---> level 1
 * 
 *  2    3     ---> level 2
 *  
 *         6 
 * 
 * we need to print 1 and 2 and 6
 */
