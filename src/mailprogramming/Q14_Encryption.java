package mailprogramming;

import java.util.HashMap;

/**
 * 길이가 같은 두 문자열(string) A 와 B가 주어지면, A 가 B 로 1:1 암호화 가능한지 찾으시오.
 * Given two strings of equal length, check if two strings can be encrypted 1 to 1.
 *
 * 예제)
 * Input: “EGG”, “FOO”
 * Output: True // E->F, G->O
 *
 * Input: “ABBCD”, “APPLE”
 * Output: True // A->A, B->P, C->L, D->E
 *
 * Input: “AAB”, “FOO”
 * Output: False
 */
public class Q14_Encryption {
    public static void main(String[] args) {
        String input1_1 = "EGG";
        String input1_2 = "FOO";
        String input2_1 = "ABBCD";
        String input2_2 = "APPLE";
        String input3_1 = "AAB";
        String input3_2 = "FOO";
        boolean output;

        output = solve(input1_1, input1_2);
        System.out.println(output);

        output = solve(input2_1, input2_2);
        System.out.println(output);

        output = solve(input3_1, input3_2);
        System.out.println(output);
    }

    private static boolean solve(String a, String b) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)) {
                    return false;
                }
                map.put(c1, c2);
            }
        }
        return true;
    }
}

// 시간 복잡도: O(n)  n은 문자 A의 길이
//공간 복잡도: O(n)