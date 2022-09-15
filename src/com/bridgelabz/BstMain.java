package com.bridgelabz;

public class BstMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Binary search tree");
		BinarySearchTree tree = new BinarySearchTree();
		tree.addNode(56);
		tree.addNode(30);
		tree.addNode(70);
		System.out.println("\nBinary Search Tree After Adding Elements\n ");
		tree.printTree(tree.root);
	}

}
