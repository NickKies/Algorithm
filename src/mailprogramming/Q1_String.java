package mailprogramming;

/**
 * 문자열 배열(string array)이 주어지면, 제일 긴 공통된 접두사(prefix)의 길이를 찾으시오. *
 * Given an array of strings, find the longest common prefix of all strings.
 *
 *
 *
 * 예제)
 *
 * Input: [“apple”, “apps”, “ape”]
 *
 * Output: 2 // “ap”
 *
 *
 *
 * Input: [“hawaii”, “happy”]
 *
 * Output: 2 // “ha”
 *
 *
 *
 * Input: [“dog”, “dogs”, “doge”]
 *
 * Output: 3 // “dog”
 */
public class Q1_String {

    public static void main(String[] args){
        String[] input1 = {"apple", "apps", "ape"};
        String[] input2 = {"hawaii", "happy"};
        String[] input3 = {"dog","dogs","doge"};

        int output1 = longestPrefixLength(input1);
        int output2 = longestPrefixLength(input2);
        int output3 = longestPrefixLength(input3);

        System.out.println(output1);
        System.out.println("--------------------------------------------");
        System.out.println(output2);
        System.out.println("--------------------------------------------");
        System.out.println(output3);
    }


    private static int longestPrefixLength(String[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        String max_prefix = arr[0];
        for (int i = 0; i < max_prefix.length(); i++) {
            char c = max_prefix.charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (i == arr[j].length() || arr[j].charAt(i) != c) {
                    return i;
                }
            }
        }
        return max_prefix.length();
    }
}
// 시간 복잡도 : O(n) // n은 모든 단어들의 문자 개수의 합.
// 공간 복잡도 : O(1)