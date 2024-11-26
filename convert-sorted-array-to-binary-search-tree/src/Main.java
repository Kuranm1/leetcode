
public class Main {
    public static TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if(start > end) return null;
        int midIndex = start + (end-start)/2;
        TreeNode node = new TreeNode(nums[midIndex]);
        node.left = sortedArrayToBST(nums, start, midIndex-1);
        node.right = sortedArrayToBST(nums, midIndex+1,  end);
        return node;
    }
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        TreeNode node = sortedArrayToBST(new int[]{1,2,3,4,5,6,7});

        RecursiveBinarySearchTree BST = new RecursiveBinarySearchTree(node);
        System.out.println("======== BST Traversal ========");
        System.out.println(BST.bfs());

    }
}