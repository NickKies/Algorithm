package mailprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * 정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.
 * 단, 시간복잡도 O(n) 여야 합니다.
 * Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.
 *
 * 예제)
 *
 * Input: [2, 5, 6, 1, 10], 타겟 8
 *
 * Output: [0, 2] // 배열[0] + 배열[2] = 8
 */
public class Q8_HashMap_constainsKey {
    private static int[] intArry = new int[2];
    public static void main(String[] args) {
        int[] input = {2, 5, 6, 1, 10};
        int target = 8;
        solution(input, target);
        System.out.print("[" + intArry[0] + ", " + intArry[1] + "]" );
    }
    
    private static int[] solution(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (map.containsKey(complement)) {
                intArry = new int[]{map.get(complement), i};
                return intArry;
            }
            map.put(input[i], i);
        }
        return intArry = new int[] { -1, -1 }; // No solution
    }
}

// 시간 복잡도: O(n). 해쉬맵의 containsKey 는 보편적으로 O(1). O(n)*O(1) = O(n).

// 공간 복잡도: O(n)