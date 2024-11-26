import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RecursiveBinarySearchTree {
    public TreeNode root;

    RecursiveBinarySearchTree() {}

    RecursiveBinarySearchTree(TreeNode node) {
        this.root = node;
    }

    private void rInsert(TreeNode node, int value){
        if(value < node.val) {
            if(node.left == null)
                node.left = new TreeNode(value);
            else
                rInsert(node.left, value);
        }
        else if(value > node.val) {
            if(node.right == null)
                node.right = new TreeNode(value);
            else
                rInsert(node.right, value);
        }
    }

    public void insert(int value) {
        if(root == null) this.root = new TreeNode(value);
        rInsert(root, value);
    }
    
}
