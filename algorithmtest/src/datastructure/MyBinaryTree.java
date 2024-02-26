package datastructure;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class BinaryTree {
	private TreeNode root;
	
	// 생성자
	public BinaryTree() {
		this.root = null;
	}
	
	// 이진 트리에 노드를 추가하는 메서드
	public void insert(int val) {
		root = insertRecursive(root, val);
	}
	
	// 재귀적으로 노드를 추가하는 보조 메서드
	private TreeNode insertRecursive(TreeNode root, int val) {
		if(root == null) {
			return new TreeNode(val);
		}
		if(val < root.val) {
			root.left = insertRecursive(root.left, val);
		}
		if(val > root.val) {
			root.right = insertRecursive(root.right, val);
		}
		
		return root;
	}
	
	// 이진 트리를 전위 순회하여 노드 값을 출력하는 메서드
	public void preorderTraversal() {
		preorderTraversalRecursive(root);
	}
	
	// 전위 순회를 재귀적으로 수행하는 보조 메서드
	private void preorderTraversalRecursive(TreeNode root) {
		
	}
	
	// 이진 트리를 중위 순회(inorder traversal) 하여 노드 값을 출력하는 메서드
	public void inorderTraversal() {
		
	}
	
	// 중위 순회를 재귀적으로 수행하는 보조 메서드
	private void inorderTraversalRecursive(TreeNode root) {
		
	}
	
	// 이진 트리를 후위 순회하여 노드 값을 출력하는 메서드
	public void postorderTraversal() {
		postorderTraversalRecursive(root);
	}
	
	private void postorderTraversalRecursive(TreeNode root) {
		
	}
}

public class MyBinaryTree {

	public static void main(String[] args) {

		
	}

}
