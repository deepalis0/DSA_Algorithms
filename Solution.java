
 ///Definition for a binary tree node.
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

public class Solution {
    int res ;
    public int sumNumbers(TreeNode root) {
        res = 0;
        solve(root,new StringBuilder());
        return res;
    }
    void solve(TreeNode root,StringBuilder sb)
    {
        if(root==null)
            return;
        sb.append(root.val);
        if(root.left ==null && root.right==null)
        {
            if(sb.length()>0)
            {
                res += Integer.valueOf(sb.toString());
                //System.out.println(res);
                sb.deleteCharAt(sb.length()-1);
                return;
            }
        }
        solve(root.left,sb);
        solve(root.right,sb);
        sb.deleteCharAt(sb.length()-1);
    }
}