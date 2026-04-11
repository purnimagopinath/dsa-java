package Revision_V2.Medium;

//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val==p.val || root.val==q.val) return root;
        TreeNode left = lowestCommonAncestor(root.left,p, q);
        TreeNode right = lowestCommonAncestor(root.right,p, q);
        if(left==null&&right==null) return null;
        if(left!=null && right!=null) return root;
        return left==null? right:left;
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(4);
        TreeNode q = new TreeNode(2);

        TreeNode root = new TreeNode(3);
        root.left = p;
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = q;

        LowestCommonAncestor obj = new LowestCommonAncestor();
        System.out.println("LCA is : "+obj.lowestCommonAncestor(root,p,q).val);


    }
}
