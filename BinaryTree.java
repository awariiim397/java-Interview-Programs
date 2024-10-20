
public class BinaryTree {

	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class Binary {
		static int index = -1;
// this method for  parent node
		public static Node binaryTree(int Nodes[]) {
			index++;
			if (Nodes[index] == -1) {
				return null;
			}
			Node n_node = new Node(Nodes[index]);
			n_node.left = binaryTree(Nodes);
			n_node.right = binaryTree(Nodes);
			return n_node;
		}
	}

//this method for PreOrder
	public static void preOrder(Node root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
//This is for inorder
         public static void inorder(Node root){
         if(root==null){
       return;
           }
        inorder(root.left);
     System.out.print(root.data+" ");
     inorder(root.right);
}

public  static void postOrder(Node root){
if(root ==null){
return;
}
postOrder(root.left);
postOrder(root.right);
System.out.print(root.data+" ");
}

	
	
	

	public static void main(String args[]) {
		int Nodes[] = { 1, 2, 4 ,- 1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Binary bt = new Binary();
		Node root = bt.binaryTree(Nodes);
               System.out.println(root.data);//..............this is for only parent root o/p=>1
		preOrder(root);//..............this is for only preOrder o/p=>1,2,4,5,3,6
System.out.println();
              inorder(root);//..............this is for only inOrder o/p=>4,2,5,1,3,6

System.out.println();
               postOrder(root);//..............this is for only postOrder o/p=>4,5,2,6,3,1


	}
}
