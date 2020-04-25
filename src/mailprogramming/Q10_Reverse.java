package mailprogramming;

import java.util.ArrayList;

/**
 * 주어진 string 에 모든 단어를 거꾸로 하시오.
 *
 * Reverse all the words in the given string.
 *
 * 예제)
 *
 * Input: “abc 123 apple”
 *
 * Output: “cba 321 elppa”
 */
public class Q10_Reverse {
    private static String input = "abc 123 apple";
    private static String output;

    public static void main(String[] args){
        output = reverseString(input);

        System.out.print(output);
    }

    public static String reverseString(String s) {
        String words[] = split(s);
        StringBuilder res = new StringBuilder();
        for (String word: words) {
            res.append(reverse(word) + " ");
        }
        return res.toString().trim();
    }

    public static String[] split(String s) {
        ArrayList <String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            } else {
                word.append(s.charAt(i));
            }
        }
        words.add(word.toString());
        return words.toArray(new String[words.size()]);
    }

    public static String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.insert(0, s.charAt(i));
        }
        return res.toString();
    }

}
