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
    int counter =0;
    public int goodNodes(TreeNode root) {
        isGoodNode(root, Integer.MIN_VALUE);
        return counter;
    }

    public void isGoodNode(TreeNode root, int maxSoFar){
        if(root==null){
            return;
        }
        if(root.val>=maxSoFar){
            counter++;
        }
        isGoodNode(root.left, Math.max(root.val , maxSoFar));
        isGoodNode(root.right, Math.max(root.val , maxSoFar));
    }

}
