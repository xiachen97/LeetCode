package D14;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
}
public class Q111 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(3);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        System.out.println(minDepth(root));


    }
    public static int minDepth(TreeNode root) {


        if(root==null){
            return 0;
        }
        // If the current node is a leaf, return 1
        if (root.left == null && root.right == null) {
            return 1;
        }
        
         // Initialize the minimum depth
         int min = Integer.MAX_VALUE;

         // Recur for left and right subtrees
         if (root.left != null) {
             min = Math.min(min, minDepth(root.left));
         }
         if (root.right != null) {
             min = Math.min(min, minDepth(root.right));
         }
 
         // Add 1 for the current level
        return min+1;
    }
}
