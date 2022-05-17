/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        if( !original ) return original;
        if( original == target ) return cloned;
        TreeNode* left_res=getTargetCopy(original->left, cloned->left, target);
        TreeNode* right_res=getTargetCopy(original->right, cloned->right, target);
        return left_res ? left_res : ( right_res ? right_res : nullptr );
    }
};