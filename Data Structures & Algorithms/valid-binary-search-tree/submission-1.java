/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isValid=true;
    public boolean isValidBST(TreeNode root) {
        checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return isValid;
    }

    private void checkBST(TreeNode root, int minSoFar, int maxSoFar){
        if(root==null)
            return ;
        if(root.val<= minSoFar || root.val>= maxSoFar){
            isValid= false;
        }
        checkBST (root.left, minSoFar, root.val);
        checkBST (root.right, root.val, maxSoFar);
    }
}
