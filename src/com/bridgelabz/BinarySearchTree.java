package com.bridgelabz;

public class BinarySearchTree {
Node root;
	
	public void addNode(int data) {
		/**
		 * Node Object Created with Constructor Passing data
		 * If Else Condition Needed.
		 * If - root equal to null, root = node and returns from function
		 * Else - parent and current stores root
		 * 		  While Looping till current node equals null.
		 * While Loop - If   - node is greater than present data it moves to right leaf node
		 * 				Else - data moves to left leaf node.
		 * 
		 */
		Node node = new Node(data);
		node.data = data;
		node.left = null;
		node.right = null;
		
		if(root == null) {
			root = node;
			return;
		}
		else {
			Node parent = root;
			Node current = root;
			while(current != null) {
				parent = current;
				if(node.data > current.data) {
					current = current.right;
				}
				else {
					current = current.left;
				}
			}
			if(node.data > parent.data) {
				parent.right = node;
			}
			else {
				parent.left = node;
			}
		}
	}
	//To Print Tree its Function
	public void printTree(Node node) {
		if(node.left != null) {
			printTree(node.left);
		}
		System.out.println(node.data+" ");
		if(node.right != null) {
			printTree(node.right);
		}
	}

}
