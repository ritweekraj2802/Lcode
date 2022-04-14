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
    public TreeNode searchBST(TreeNode root, int key) {
        
        if (root.val == key) {
			return root;
		}
		if (root.val > key && root.left != null) {
			return searchBST(root.left, key);
		}
		if (root.val < key && root.right != null) {
			return searchBST(root.right, key);
		}
		return null;
    }
}