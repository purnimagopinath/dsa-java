//https://leetcode.com/problems/all-possible-full-binary-trees/description/?envType=problem-list-v2&envId=recursion

//894
//Medium

package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }
public class AllPossibleFullBinaryTrees {
    private Map<Integer, List<TreeNode>> possibleTreeMap = new HashMap<>();

    public List<TreeNode> allPossibleFBT(int n) {
        if (n%2==0){
            return new ArrayList<>();
        }
        if (possibleTreeMap.containsKey(n)) {
            return possibleTreeMap.get(n);
        }
        List<TreeNode> result = new ArrayList<>();
        if (n==1) {
            result.add(new TreeNode(0));
        } else {
            for (int leftCount = 1; leftCount < n; leftCount += 2) {
                int rightCount = n-1-leftCount;
                for (TreeNode left : allPossibleFBT(leftCount)) {
                    for (TreeNode right : allPossibleFBT(rightCount)) {
                        result.add(new TreeNode(0, left, right));
                    }
                }
            }
        }
        possibleTreeMap.put(n, result);
        return result;

    }
}

/*Example 1:
Input: n = 7
Output: [[0,0,0,null,null,0,0,null,null,0,0],
[0,0,0,null,null,0,0,0,0],
[0,0,0,0,0,0,0],
[0,0,0,0,0,null,null,null,null,0,0],
[0,0,0,0,0,null,null,0,0]]

Example 2:

Input: n = 3
Output: [[0,0,0]]

 */