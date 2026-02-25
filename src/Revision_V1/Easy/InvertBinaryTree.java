package Revision_V1.Easy;
//https://leetcode.com/problems/invert-binary-tree/description/

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }


    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        InvertBinaryTree obj = new InvertBinaryTree();
        TreeNode invertedRoot = obj.invertTree(root);

        System.out.println("Tree inverted successfully!");
    }
}
