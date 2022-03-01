package dataStructures.binarySearchTree;

public class BinarySearchTree {
	
	//kok dugum
	Node root;
	
	//ikili agacimizi ilk olusturdugumuzda (herhangi bir data deðerine sahip olmayan agac olusumu)
	public BinarySearchTree() {
		root = null;
	}
	
	//agac olusurken datayi da verdik
	public BinarySearchTree(int data) {
		root = new Node(data);
	}
	
	
	//recursive ile:
	Node add(Node root, int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		//saga yerles
		if(data < root.data) {
			root.right = add(root.right, data);
			return root;
		}
				
		//sola yerles
		else {
			root.left = add(root.left, data);
			return root;
		}
	}
	
	//iterasyon ile:
	void add(int key) {
		Node node = new Node(key);
		if(root == null) {
			root = node;
		}
		
		Node prev = null;
		Node temp = root;
		while(temp != null) {
			if(key < temp.data) {
				prev = temp;
				temp = temp.left;
			}
			else {
				prev = temp;
				temp = temp.right;
			}
		}
		
		if(key < prev.data) prev.left = node;
		else                prev.right = node;
	}
	
	void traversalWithRecursive(Node root) {
		if(root != null) {
			traversalWithRecursive(root.left);
			System.out.println(root.data);
			traversalWithRecursive(root.right);
		}
	}
	
	void traversalWithLoop() {
		
	}
	
	
}
