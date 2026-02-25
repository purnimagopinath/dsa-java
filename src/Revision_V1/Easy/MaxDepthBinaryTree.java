package Revision_V1.Easy;

//https://leetcode.com/problems/maximum-depth-of-binary-tree/

public class MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        return traverse(root);
    }

    public int traverse(TreeNode root){
        if(root==null) return 0;
        int left = traverse(root.left);
        int right = traverse(root.right);
        return 1+Math.max(left, right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxDepthBinaryTree obj = new MaxDepthBinaryTree();
        int depth = obj.maxDepth(root);

        System.out.println("Max Depth = " + depth);
    }
}
