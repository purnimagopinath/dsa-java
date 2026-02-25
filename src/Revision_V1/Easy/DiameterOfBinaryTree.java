package Revision_V1.Easy;
//https://leetcode.com/problems/diameter-of-binary-tree/

import com.sun.source.tree.Tree;

public class DiameterOfBinaryTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args){
        TreeNode balanced = new TreeNode(1);
        balanced.left = new TreeNode(2);
        balanced.right = new TreeNode(3);
        balanced.right.left = new TreeNode(4);
        balanced.right.right = new TreeNode(5);

        DiameterOfBinaryTree tree = new DiameterOfBinaryTree();
        int d = tree.diameterOfBinaryTree(balanced);
        System.out.println(d);

    }
}
