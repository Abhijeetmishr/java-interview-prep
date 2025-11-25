package DSA.DivideAndConquer;

public class SortedArrayToBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] arr) {
        return constructBST(arr, 0, arr.length - 1);
    }

    public TreeNode constructBST(int[] arr, int low, int high) {
        if (low > high)
            return null;
        int mid = low + (high - low) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = constructBST(arr, low, mid - 1);
        root.right = constructBST(arr, mid + 1, high);
        return root;
    }
}
