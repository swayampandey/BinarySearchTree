package com.bridgelabz;

public class BstMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Binary search tree");
		
			BinarySearchTree binaryTree = new BinarySearchTree();
			
			binaryTree.addNode(56);
			binaryTree.addNode(30);
			binaryTree.addNode(70);
			
		System.out.println("\nBinary Search Tree After Adding Elements\n ");
		
			binaryTree.printTree(binaryTree.root);
			binaryTree.addNode(22);
			binaryTree.addNode(40);
			binaryTree.addNode(11);
			binaryTree.addNode(3);
			binaryTree.addNode(16);
			binaryTree.addNode(60);
			binaryTree.addNode(95);
			binaryTree.addNode(65);
			binaryTree.addNode(63);
			binaryTree.addNode(67);
			
		System.out.println("\nAfter Adding Remaining Elements into Tree\n");
		
		binaryTree.printTree(binaryTree.root);
	}

}
