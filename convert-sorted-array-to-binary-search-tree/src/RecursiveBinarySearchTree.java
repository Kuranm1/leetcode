import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class RecursiveBinarySearchTree {
    private TreeNode root;

    RecursiveBinarySearchTree() {}

    RecursiveBinarySearchTree(TreeNode node) {
        this.root = node;
    }



    public ArrayList<Integer> bfs (){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return list;
    }
}
