package mailprogramming;

/**
 * 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
 *
 * Given an integer array, find the largest consecutive sum of elements.
 *
 * 예제}
 * Input: [-1, 3, -1, 5]
 * Output: 7 // 3 + (-1) + 5
 *
 * Input: [-5, -3, -1]
 * Output: -1 // -1
 *
 * Input: [2, 4, -2, -3, 8]
 * Output: 9 // 2 + 4 + (-2) + (-3) + 8
 */

public class Q4_IntArray {
    public static void main(String[] args){
        int[] input1 = {-1, 3, -1, 5};
        int[] input2 = {-5, -3, -1};
        int[] input3 = {2, 4, -2, -3, 8};

        int output1 = solution(input1);
        System.out.println(output1);

        int output2 = solution(input2);
        System.out.println(output2);

        int output3 = solution(input3);
        System.out.println(output3);
    }
    private static int solution(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(currentSum + arr[i], arr[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}

// 시간 복잡도 O(n)
// 공간 복잡도 O(1)
