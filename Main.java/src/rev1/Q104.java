package rev1;

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(dfs(root));
    }

    private static int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftDepth = dfs(node.left);
        int rightDepth = dfs(node.right);
        int maxDepth = Math.max(leftDepth, rightDepth) + 1;

        return maxDepth;
    }
}
