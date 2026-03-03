package Revision_V1.Easy;
//https://leetcode.com/problems/same-tree/description/
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q!=null) return false;
        if(p!=null && q==null) return false;
        if(p==null && q==null) return true;
        if(p.val!=q.val) return false;
        boolean isLeftSame = isSameTree(p.left, q.left);
        boolean isRightSame = isSameTree(p.right, q.right);
        if(isRightSame&&isLeftSame) return true;
        return false;
    }

    public static void main(String[] args){

        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        q.left = new TreeNode(2);
        q.right = new TreeNode(3);


        SameTree obj = new SameTree();
        System.out.println("Is same : "+obj.isSameTree(p,q));

        TreeNode m = new TreeNode(1);
        m.left = new TreeNode(2);

        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);

        System.out.println("Is same : "+obj.isSameTree(m,n));
    }
}
