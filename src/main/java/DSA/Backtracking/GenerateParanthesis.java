package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    // ArrayList<String> balancedBraces(int n) {
    //     ArrayList<String> output = new ArrayList<>();
    //     backtrack(output, "", 0, 0, n);
    //     return output;
    // }

    // public void backtrack(ArrayList<String> output, String ans, int open, int close, int max){
    //     if(ans.length() == max*2){
    //         output.add(ans);
    //         return;
    //     }
    //     if(open < max) backtrack(output, ans + "(", open+1, close, max);
    //     if(close < open) backtrack(output, ans + ")", open, close+1, max);
    // }

    /**
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

        Example 1:

        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]
        Example 2:

        Input: n = 1
        Output: ["()"]
     */

     public List<String> generateParenthesis(int n) {
        if(n <= 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(res, n, n, sb);
        return res;
    }

    public void backtrack(List<String> res, int leftOpen, int rightOpen, StringBuilder sb) {
        if(leftOpen == 0 && rightOpen == 0){
            res.add(sb.toString());
            return;
        }
        if(leftOpen > 0){
            sb.append("(");
            backtrack(res, leftOpen-1, rightOpen, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(leftOpen < rightOpen){
            sb.append(")");
            backtrack(res, leftOpen, rightOpen-1, sb);
            sb.deleteCharAt(sb.length()-1);
        }   
    }
}
