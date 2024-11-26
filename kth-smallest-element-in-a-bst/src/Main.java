import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> DFSInOrder(TreeNode node, ArrayList<Integer> list){
        if(node == null) return list;
        if(node.left != null) DFSInOrder(node.left, list);
        list.add(node.val);
        if(node.right != null) DFSInOrder(node.right, list);
        return list;
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        list = DFSInOrder(root, list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        RecursiveBinarySearchTree BST = new RecursiveBinarySearchTree();
        BST.insert(2);
        BST.insert(1);
        BST.insert(3);
        BST.insert(4);
        BST.insert(0);

        System.out.println("===== Kth smallest element in BST ====");
        System.out.println(kthSmallest(BST.root,3));

    }
}