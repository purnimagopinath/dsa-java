package Revision_V1.Easy;
//https://leetcode.com/problems/subtree-of-another-tree/description/

public class SubtreeOfAnotherTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(subRoot==null) return true;

        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) ||
                isSubtree(root.right, subRoot);

    }

    public boolean isSame(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p!=null && q==null) return false;
        if(p==null && q!=null) return false;
        if(p.val!=q.val) return false;
        return isSame(p.left, q.left)&& isSame(p.right,q.right);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode p = new TreeNode(4);
        p.left = new TreeNode(1);
        p.right = new TreeNode(2);


        SubtreeOfAnotherTree obj = new SubtreeOfAnotherTree();
        System.out.println("Is subtree : "+obj.isSubtree(root, p));

        root.left.right.left = new TreeNode(0);

        System.out.println("Is subtree : "+obj.isSubtree(root, p));
    }
}
