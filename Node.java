package com.nasir.mnc;


//Class of the node
class Node
{
	int val;
	Node left, right;
	
	// Creating  new node

	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
class MNC
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	
	// Conversion to Skewed Tree increasing / decreasing order
	static void convesionToSkewed(Node root,int order)
	{
	
		// Base Case
		if(root == null)
		{
			return;
		}
	
		if(order > 0)
		{
			convesionToSkewed(root.right, order);
		}
		else
		{
			convesionToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;
	
		// Condition to check if the root Node is not deined 
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		// Similarly recurse for the left / right
		// subtree on the basis of the order required
		if (order > 0)
		{
			convesionToSkewed(leftNode, order);
		}
		else
		{
			convesionToSkewed(rightNode, order);
		}
	}

	// traverse the right
	
	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);	
	}

	// Tree Code
	public static void main (String[] args)
	{
	
		MNC tree = new MNC();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);	
		
		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		convesionToSkewed(node, order);
		traverseRightSkewed(headNode);
	}
}

