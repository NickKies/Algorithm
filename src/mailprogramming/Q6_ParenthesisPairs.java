package mailprogramming;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수 n이 주어지면, n개의 여는 괄호 "("와 n개의 닫는 괄호 ")"로 만들 수 있는 괄호 조합을 모두 구하시오. (시간 복잡도 제한 없습니다).
 *
 * Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.
 *
 * 예제)
 * Input: 1
 * Output: ["()"]
 *
 * Input: 2
 * Output: ["(())", "()()"]
 *
 * Input: 3
 * Output: ["((()))", "(()())", "()(())", "(())()", "()()()"]
 *
 */
public class Q6_ParenthesisPairs {
    private static int input1 = 1;
    private static int input2 = 2;
    private static int input3 = 3;
    private static List<String> ans = new ArrayList<>();

    public static void main(String[] args){
        ans = parenthesisPairs(input1);
        System.out.println(ans);

        ans = parenthesisPairs(input2);
        System.out.println(ans);

        ans = parenthesisPairs(input3);
        System.out.println(ans);
    }



    private static List<String> parenthesisPairs(int n) {
        recurse(ans, "", 0, 0, n);
        return ans;
    }

    private static void recurse(List<String> ans, String cur, int open, int close, int n){
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
        }
        if (open < n) {
            recurse(ans, cur + "(", open + 1, close, n);
        }
        if (close < open) {
            recurse(ans, cur + ")", open, close + 1, n);
        }
    }

}