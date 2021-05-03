package com.test.ds;

import java.util.LinkedList;
import java.util.Queue;

public class BfsLeftView {
	
	
static void leftView(Node node) {
		
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
	//	queue.add(null);
		boolean hasPrinted = false;
		queue.add(node);
    	queue.add(null);

	//	int level = 1;
	//	int currentLevel = 0;
		
		while(!queue.isEmpty()){
				
			node = queue.poll();
			
			if(node == null)
				continue;
//			if(node!= null && !hasPrinted)
//			{
//				System.out.println(node.data);
//				hasPrinted = true;
//			}
//			if(node == null )
//			{
//				node = queue.poll();
//				System.out.println(node.data);
//			}
//			if(node != null)
//			{
//				if(currentLevel < level)
//				{
//					currentLevel = level;
//					System.out.println(node.data);
//				}
				
			if(!hasPrinted)
			{
				System.out.println(node.data);
				hasPrinted = true;
			}
			
			if(node.left != null)
			{	queue.add(node.left);
			}
			if (node.right != null)
				queue.add(node.right);
			
			if(queue.peek()==null)
			{
			//	level = level +1;
				queue.add(null);
				hasPrinted = false;
			}
				
//			}
		}
	}

}
