package mailprogramming;

/**
 * 문자배열이 주어지면, 주어진 문자로 만들수 있는 모든 문자배열 조합을 프린트 하시오.
 *
 * Given a string, print all permutations of characters in the string.
 *
 *
 * input: ABC
 *
 * output: ABC ACB BAC BCA CBA CAB
 */
public class Q3_RecursiveFunction {
    public static void main(String[] args) {
        String str = "ABC";
        solve(str, 0, str.length() - 1);
    }

    private static void solve(String str, int l, int r) {
        if (l == r) {
            System.out.print(str+" ");
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                solve(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
}
//시간 복잡도 : O(n!)
