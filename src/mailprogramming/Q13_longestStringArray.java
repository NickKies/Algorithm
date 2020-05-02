package mailprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * String이 주어지면, 중복된 char가 없는 가장 긴 서브스트링 (substring)의 길이를 찾으시오.
 * Given a string, find the longest substring that does not have duplicate characters.
 *
 * 예제)
 *
 * Input: “aabcbcbc”
 * Output: 3 // “abc”
 *
 * Input: “aaaaaaaa”
 * Output: 1 // “a”
 *
 * Input: “abbbcedd”
 * ﻿Output: 4 // “bced”
 */
public class Q13_longestStringArray {

    public static void main(String[] args) {
        String input1 = "aabcbcbc";
        String input2 = "aaaaaaaa";
        String input3 = "abbbcedd";

        System.out.println(longestSubstringLength(input1));
        System.out.println(longestSubstringLength(input2));
        System.out.println(longestSubstringLength(input3));
    }



    private static int longestSubstringLength(String s) {
        int ret = 0;
        int start = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                start = Math.max(map.get(s.charAt(j)), start);
            }
            ret = Math.max(ret, j - start + 1);
            map.put(s.charAt(j), j + 1); // 캐릭터 인덱스 저장
        }
        return ret;
    }
}
