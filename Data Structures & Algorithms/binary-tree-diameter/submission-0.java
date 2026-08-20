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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        int diaR = diameterOfBinaryTree(root.right);
        int diaL = diameterOfBinaryTree(root.left);
        return Math.max(left+right, Math.max(diaL, diaR));
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right)+1;
    }
}
