package com.test.ds;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {

	static void traversal(Node node) {
		
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()){
			
			node = queue.remove();
			
			System.out.println(node.data + " ");
			
			if(node.left != null)
				queue.add(node.left);
			
			if(node.right != null)
				queue.add(node.right);
			
		}
	}
}
