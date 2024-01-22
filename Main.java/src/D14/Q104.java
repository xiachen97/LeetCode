package D14;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Q104 {

    public static void main(String[] args) {
        // Create the binary tree [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Call the maxDepth function and print the result
        int result = dfs(root);
        System.out.println("Maximum Depth of the Binary Tree: " + result);
    }

    // Recursive DFS function
    private static int dfs(TreeNode node) {
        // Base case: if the node is null, return 0
        if (node == null) {
            return 0;
        }

        // Recur for left and right subtrees
        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);

        // Calculate the maximum depth for the current node
        int maxDepth = Math.max(leftDepth, rightDepth) + 1;

        return maxDepth;
    }
}
