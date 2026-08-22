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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inorderlist = new ArrayList<>();
        inorder(root, inorderlist);
        return inorderlist;


        
    }


    public void inorder(TreeNode root, List<Integer> inorderlist){

        if(root == null)
        return;

        inorder(root.left, inorderlist);

        inorderlist.add(root.val);

        inorder(root.right, inorderlist);

    }
}
