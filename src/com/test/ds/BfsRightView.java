package com.test.ds;

import java.util.LinkedList;
import java.util.Queue;

public class BfsRightView {

static void rightView(Node node) {
		
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);
//		int level = 1;
		
		while(!queue.isEmpty()){
				
			node = queue.poll();
			if(node != null)
			{
				if(node.left != null)
				{	queue.add(node.left);
				}
				if (node.right != null)
					queue.add(node.right);
				
				if(queue.peek()==null)
				{
					System.out.println(node.data);
	//				level = level +1;
					queue.add(null);
				}
			}
		}
	}
}
