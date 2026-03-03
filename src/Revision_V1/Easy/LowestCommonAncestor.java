package Revision_V1.Easy;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) {
            return root; // This is LCA
        }

        return left != null ? left : right;

    }


    public static void main(String[] args){
        LowestCommonAncestor obj = new LowestCommonAncestor();
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        root.left = p;
        root.right = q;
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);


        TreeNode sortedRoot = obj.lowestCommonAncestor(root, p, q);

        System.out.println("Tree Built successfully!");
        System.out.println(sortedRoot.val);

    }
}
