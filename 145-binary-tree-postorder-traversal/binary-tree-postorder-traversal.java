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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>res = new ArrayList<>();
        helper(res,root);
        return res;
        
    }
    void helper(List<Integer>res,TreeNode root){
        if(root==null){
            return;
        }
        helper(res,root.left);
        helper(res,root.right);
        res.add(root.val);
    }
}