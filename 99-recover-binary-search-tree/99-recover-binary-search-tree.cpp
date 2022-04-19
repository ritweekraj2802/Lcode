/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode *first;
    TreeNode *second;
    TreeNode *pre;
    
    void inOrder(TreeNode *root){
        if (root==NULL){return;}
        else{
            inOrder(root->left);
            if (pre == NULL){pre = root;}
            else {
                if (pre->val > root->val){
                    if (first==NULL) {first = pre;}
                    second = root;
                }
                pre = root;
            }
            inOrder(root->right);
            
        }
    }
    void recoverTree(TreeNode* root) {
         pre = NULL;
        first = NULL;
        second= NULL;
        inOrder(root);
        int val;
        val = first->val;
        first->val=second->val;
        second->val=val;
        return;
    }
};