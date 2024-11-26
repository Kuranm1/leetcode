import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static TreeNode invertTree(TreeNode node){
        if(node == null) return null;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertTree(node.left);
        invertTree(node.right);
        return node;
    }
    public static void main(String[] args) {
        RecursiveBinarySearchTree BST = new RecursiveBinarySearchTree();
        BST.insert(2);
        BST.insert(1);
        BST.insert(3);
        BST.insert(4);
        BST.insert(0);

        System.out.println("===== BFS Traversal ====");
        System.out.println(BST.bfs());

        System.out.println("===== BFS Traversal after invert ====");
        invertTree(BST.root);
        System.out.println(BST.bfs());



    }
}