package Revision_V1.Easy;

import com.sun.source.tree.Tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right){
        if(left > right) return null;
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid-1);
        root.right = build(nums, mid+1, right);
        return root;
    }

    public static void main(String[] args){
        int[] input = {-10, -3, 0, 5, 9};

        SortedArrayToBST obj = new SortedArrayToBST();
        TreeNode sortedRoot = obj.sortedArrayToBST(input);

        System.out.println("Tree Built successfully!");
        TreeNode.printLevelOrder(sortedRoot);
    }
}
