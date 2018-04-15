package basicDataStructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Node{
	int key;
	Node left,right;
	public Node(int key) {
		this.key = key;
	}	
}


public class sampleBinaryTree {

	Node root;
	
	public int height(Node root){
		if(root==null) 
		{ 
		  return 0;
		}
		else
		{
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight>rheight) return lheight+1;
			else return rheight+1;
		}
		
	}
	
	public void queueBFSTraversal(){
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node n = q.poll();
			System.out.println(n.key);
			if(n.left!=null)
			q.add(n.left);
			
			if(n.right!=null)
			q.add(n.right);
		}
		
	}
	
	public void InOrderTraversal(Node n){
		if(n!=null){					
		InOrderTraversal(n.left);
		System.out.println(n.key);
		InOrderTraversal(n.right);
		}
	}
	
	public void PreOrderTraversal(Node n){
		if(n!=null){	
		System.out.println(n.key);
		PreOrderTraversal(n.left);		
		PreOrderTraversal(n.right);
		}
	}

	public void PostOrderTraversal(Node n){
		if(n!=null){	
		PostOrderTraversal(n.left);		
		PostOrderTraversal(n.right);
		System.out.println(n.key);
		}
	}
	
	public static void main(String[] args) {
		sampleBinaryTree tree = new sampleBinaryTree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Height Of Tree "+tree.height(tree.root));
		//tree.bfs_traversal();
		System.out.println("Breadth First Traversal");
		tree.queueBFSTraversal();
		System.out.println("In Order Traversal");
		tree.InOrderTraversal(tree.root);		
		System.out.println("Pre Order Traversal");
		tree.PreOrderTraversal(tree.root);
		System.out.println("Post Order Traversal");
		tree.PostOrderTraversal(tree.root);
		
	}

}
