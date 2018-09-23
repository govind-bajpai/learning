package tree;

public class Test {

	public static void main(String[] args) {
		 /* creating a binary tree and entering the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
//         1
//      2     3
//     4 5  6   7
        
     //   1 2 4 5 3 6 7
        
        
        
        
        
        tree.preOrderTraversal(tree.root);
        
 
//        System.out.println("The diameter of given binary tree is : "
//                           + tree.diameter());
//        
//        System.out.println("Number of Nodes in  tree "+tree.getNumberOfNodesInATree(tree.root));
//        
//        //tree.printRootToLeafPath(tree.root);
//        tree.checkExistingPathWithGivenSum(tree.root, 7);
//        tree.printLevelOreder(tree.root);
//        
//        System.out.println("zig zag traversal is :");
//        tree.printZigZagOrder(tree.root);
	}

}
