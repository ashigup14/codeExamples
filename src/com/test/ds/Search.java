package com.test.ds;

public class Search {

	public Search() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try{
			Node tree = sample_tree();
			Bfs.traversal(tree);
			
			System.out.println("----------");
			
			BfsLeftView.leftView(tree);
			
			System.out.println("----------");
			
			BfsRightView.rightView(tree);
		}
		catch (Exception e) {
			System.out.println("error!!");
		}

	}
	
	private static Node sample_tree(){
		Node root = new Node("A",
						new Node("B", new Node("C"), new Node("D")),  
						new Node("E", new Node("F"), new Node("G" , new Node("H"), null)));
		
		return root;
	}

}
