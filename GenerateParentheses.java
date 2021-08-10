

// Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
// Example 1:
// Input n = 3
// Output: [((())), (()()), (())(), ()(()), ()()()]
// Input n = 1
// Output: [()]
import java.util.*;
public class GenerateParentheses {

    public  List<String>generateParentheses(int n){
        List<String> res = new ArrayList<>();
        backtrack(res, n, "", 0, 0);
        return res;

    }

    public void backtrack(List<String> res, int n, String curr, int open, int close){
        // Base Case
        if(curr.length() == n*2){
            res.add(curr);
        }

        if(open < n){
            backtrack(res, n, curr+"(", open+1, close);
        }
        if(close < open){
            backtrack(res, n, curr+")", open, close+1);
        }
    }

    public static void main(String[] args){
        GenerateParentheses g = new GenerateParentheses();
        System.out.println(g.generateParentheses(3));
    }
}
