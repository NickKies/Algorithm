package mailprogramming;

/**
 * 정수 배열(int array)이 주어지면 0이 아닌 정수 순서를 유지하며 모든 0을 배열 오른쪽 끝으로 옮기시오. 단, 시간복잡도는 O(n), 공간복잡도는 O(1)여야 합니다.
 * Given an integer array, move all the 0s to the right of the array without changing the order of non-zero elements.
 *
 * 예제)
 * Input: [0, 5, 0, 3, -1]
 * Output: [5, 3, -1, 0, 0]
 *
 * Input: [3, 0, 3]
 * ﻿Output: [3, 3, 0]
 */
public class Q12_Swap {
    public static void main(String[] args) {
        int[] input1 = {0, 5, 0, 3, -1};
        int[] input2 = {3, 0, 3};

        solve(input1);
        solve(input2);

        printer(input1);
        printer(input2);
    }

    private static void solve(int[] input) {
        int position = 0; // 0이 아닌 정수가 들어갈 곳
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                swap(input, i, position);
                position++;
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        if (a == b) return;
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void printer(int[] arr) {

        System.out.print("[");
        for ( int i = 0; i < arr.length - 1; i++ ) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length -1] + "]");
    }
}

// 시간 복잡도 : O(n)

// 공간 복잡도 : O(1)
