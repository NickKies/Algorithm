package mailprogramming;

/**
 *정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
 *
 * Given an integer, check if it is a palindrome.
 *
 * 예제)
 * Input: 12345
 * Output: False
 *
 * Input: -101
 * Output: False
 *
 * Input: 11111
 * Output: True
 *
 * Input: 12421
 * Output: True
 */
public class Q7_palindrome {
    private static int input1 = 12345;
    private static int input2 = -101;
    private static int input3 = 11111;
    private static int input4 = 12421;
    private static boolean ans;

    public static void main(String[] args) {
        ans = isPalindrome(input1);
        System.out.println(ans);

        ans = isPalindrome(input2);
        System.out.println(ans);

        ans = isPalindrome(input3);
        System.out.println(ans);

        ans = isPalindrome(input4);
        System.out.println(ans);
    }


    private static boolean isPalindrome(int input) {
        if(input < 0 || (input % 10 == 0 && input != 0)) {
            return false;
        }
        int revertedHalf = 0;
        while(input > revertedHalf) {
            revertedHalf = revertedHalf * 10 + input % 10;
            input /= 10;
        }
        return input == revertedHalf || input == revertedHalf/10;
    }
}

// 시간복잡도 O(log n)
// 공간복잡도 O(1)