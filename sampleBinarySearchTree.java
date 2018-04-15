package basicDataStructure;


class TreeNode{
	int key;
	TreeNode left,right;
	public TreeNode(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class sampleBinarySearchTree {
	
	TreeNode root;

	public void insert(int value){
		root = insertTree(root,value);
	}
	
	public TreeNode insertTree(TreeNode root,int value){
		if(root==null){
			root = new TreeNode(value);
			return root;
		}
		else if(root.key>value){
			root.left = insertTree(root.left,value);
		}
		else if(root.key<value){
			root.right = insertTree(root.right,value);
		}
		return root;
	}
	
	public void InOrderTraversal(TreeNode root){
		if(root!=null){			
			InOrderTraversal(root.left);
			System.out.println(root.key);
			InOrderTraversal(root.right);
		}		
	}

	TreeNode findKey(int n,TreeNode root){
		if(root==null || root.key ==n)
			return root;
		
		if(root.key>n){
			root= findKey(n,root.left);
		}
		
		if(root.key<n)
			root= findKey(n,root.right);	
		return root;
		
	}
	public void deleteNode(int n){
		
		
		
	}
	
	public static void main(String[] args) {
		sampleBinarySearchTree tree = new sampleBinarySearchTree();
		
		tree.insert(20);
		tree.insert(1);
		tree.insert(3);
		tree.insert(5);
		tree.insert(4);
		tree.insert(100);
		tree.deleteNode(100);
		//tree.InOrderTraversal(tree.root);

	}

}
