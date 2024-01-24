package D15;

import java.sql.Time;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Q1448 {
    public static int count;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);


        System.out.println(goodNodes(root));
    }
    //Time complexity: O(# of nodes in tree)
    //Space complexity: O(H) where H is the height of the tree
    public static int goodNodes(TreeNode root) {
        count=0;
        ans(root,root.val);
        return count;
    }
    public static void ans(TreeNode root,int max){
       
        if(root==null){
            return;
        }
        if(root.val>=max){
            count++;
        }
        max=Math.max(max,root.val);
        ans(root.left,max);
        ans(root.right,max);

    }
}
