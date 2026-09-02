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
    long prev=Long.MIN_VALUE;
    boolean check=true;

    public void inorder(TreeNode node){
        if(node==null){
            return;
        }

        if(node.left!=null){
            inorder(node.left);
        }
        if(node.val<=prev){
            check=false;
            return;
        } else {
            prev=node.val;
        }

        if(node.right!=null){
            inorder(node.right);
        }

        return;
    }

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        if(check==true){
            return true;
        } 

        return false;
    }
}