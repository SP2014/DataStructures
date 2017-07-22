/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BSTRangePrinter
{
	
	static class Node{
		int data;
		Node left,right;
		
		public Node(int val){
			this.data = val;
			this.left=this.right=null;
		}
	}
	
	static class BinarySearchTree{
		
		Node root;
		public BinarySearchTree(){this.root = null;}
		
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinarySearchTree bst = new BinarySearchTree();
		bst.root = new Node(10);
		bst.root.left = new Node(2);
		bst.root.right = new Node(12);
		bst.root.left.left = new Node(1);
		bst.root.left.right = new Node(8);
		bst.root.right.left = new Node(10);
		bst.root.right.right = new Node(19);
		
		RangePrinter(bst.root,2,12);
	}
	
	public static void RangePrinter(Node root,int a,int b){
		if(root==null) return;
		if(a<=root.data) RangePrinter(root.left,a,b);
		if(root.data>=a&&root.data<=b) System.out.println(root.data+" ");
		if(b>=root.data) RangePrinter(root.right,a,b);
	}
}