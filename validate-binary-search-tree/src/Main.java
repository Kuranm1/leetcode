import java.util.ArrayList;

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

    public static ArrayList<Integer> DFSInOrder(TreeNode node, ArrayList<Integer> list){
        if(node == null) return list;
        if(node.left != null) DFSInOrder(node.left, list);
        list.add(node.val);
        if(node.right != null) DFSInOrder(node.right, list);
        return list;
    }

    public static boolean isSorted(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        list = DFSInOrder(root, list);
        return isSorted(list);

    }

    public static void main(String[] args) {
        RecursiveBinarySearchTree BST = new RecursiveBinarySearchTree();
        BST.insert(2);
        BST.insert(1);
        BST.insert(3);
        BST.insert(4);
        BST.insert(0);

        System.out.println("===== Is valid? before invert ====");
        System.out.println(isValidBST(BST.root));

        System.out.println("===== Is valid? after invert ====");
        invertTree(BST.root);
        System.out.println(isValidBST(BST.root));
    }
}