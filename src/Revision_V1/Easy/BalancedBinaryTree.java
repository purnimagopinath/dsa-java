package Revision_V1.Easy;
//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;

        int left = getHeight(root.left);
        if(left == -1) return -1;   // ⭐ early stop

        int right = getHeight(root.right);
        if(right == -1) return -1;  // ⭐ early stop

        if(Math.abs(left - right) > 1) return -1;

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args){

        BalancedBinaryTree obj = new BalancedBinaryTree();

        // 🌳 Balanced Tree
        //        3
        //      /   \
        //     9     20
        //          /  \
        //         15   7
        TreeNode balanced = new TreeNode(3);
        balanced.left = new TreeNode(9);
        balanced.right = new TreeNode(20);
        balanced.right.left = new TreeNode(15);
        balanced.right.right = new TreeNode(7);

        System.out.println("Balanced tree? " + obj.isBalanced(balanced));


        // 🌳 Unbalanced Tree
        //        1
        //       /
        //      2
        //     /
        //    3
        //   /
        //  4
        TreeNode unbalanced = new TreeNode(1);
        unbalanced.left = new TreeNode(2);
        unbalanced.left.left = new TreeNode(3);
        unbalanced.left.left.left = new TreeNode(4);

        System.out.println("Unbalanced tree? " + obj.isBalanced(unbalanced));
    }
}
