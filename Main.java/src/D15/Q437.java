package D15;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Q437 {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left=new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.left = new TreeNode(5);
        root1.right.right.right = new TreeNode(1);

        int ans=pathSum(root1, 22);
        System.out.println(ans);

    }
    public static int counter = 0;
    public static int pathSum(TreeNode root, int sum) {

        if (root == null) return 0;

        pathSumHelper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);

        return counter;

    }

    public static void pathSumHelper(TreeNode root, int sum, int currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if (currentSum == sum) {
            counter++;
        }
        pathSumHelper(root.left, sum, currentSum);
        pathSumHelper(root.right, sum, currentSum);
    } 
}
