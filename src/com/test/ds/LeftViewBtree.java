package com.test.ds;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class LeftViewBtree {

	int maxLevel = 0;
	
	void leftview(Node1 root,int level,  List<Integer> result)
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
	
	void rightView(Node1 root,int level,  List<Integer> result)
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
		
		Node1 root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.right.right = new Node1(6);
		
		List<Integer> result = new ArrayList<>();
		LeftViewBtree lftView = new LeftViewBtree();
		lftView.leftview(root,1, result);
		result.stream().forEach(System.out::println);
	}
	

}

class Node1{
	int data;
	Node1 left, right;
	
	Node1(int data)
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
