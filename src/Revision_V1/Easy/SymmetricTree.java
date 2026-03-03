package Revision_V1.Easy;
//https://leetcode.com/problems/symmetric-tree/description/
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;

        return checkSymmetry(root.left, root.right);
    }

    public boolean checkSymmetry(TreeNode left, TreeNode right){
        if(left!=null && right==null) return false;
        if(left==null && right!=null) return false;

        if(left==null && right==null) return true;

        if(left.val!=right.val) return false;

        return (checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left));

    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);



        SymmetricTree obj = new SymmetricTree();
        System.out.println("Is symmetric : "+obj.isSymmetric(root));

        TreeNode m = new TreeNode(1);
        m.left = new TreeNode(2);
        m.left.right = new TreeNode(3);
        m.right = new TreeNode(2);
        m.right.right = new TreeNode(3);

        System.out.println("Is symmetric : "+obj.isSymmetric(m));
    }
}
