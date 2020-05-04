package mailprogramming;
/*
정수 배열(int array)과 정수 N이 주어지면, N번째로 큰 배열 원소를 찾으시오.
Given an integer array and integer N, find the Nth largest element in the array.

예제)
Input: [-1, 3, -1, 5, 4], 2
Output: 4

Input: [2, 4, -2, -3, 8], 1
Output: 8

Input: [-5, -3, 1], 3
﻿Output: -5

 */
public class Q16_QuickSelect {
    public static void main(String[] args) {
        int[] input1_1 = {-1, 3, -1, 5, 4};
        int input1_2 = 2;
        int[] input2_1 = {2, 4, -2, -3, 8};
        int input2_2 = 1;
        int[] input3_1 = {-5, -3, 1};
        int input3_2 = 3;
        int output;

        output = quickSort(input1_1, input1_2);
        System.out.println(output);

        output = quickSort(input2_1, input2_2);
        System.out.println(output);

        output = quickSort(input3_1, input3_2);
        System.out.println(output);
    }

    private static int quickSort(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickSelect(int[] arr, int first, int last, int k) {
        if (first <= last) {
            int pivot = partition(arr, first, last);
            if (pivot == k) {
                return arr[k];
            }
            if (pivot > k) {
                return quickSelect(arr, first, pivot - 1, k);
            }
            return quickSelect(arr, pivot + 1, last, k);
        }
        return Integer.MIN_VALUE;
    }

    private static int partition(int[] arr, int first, int last) {
        int pivot_spot = first;
        for (int i = first; i < last; i++) {
            if (arr[i] > arr[last]) {
                swap(arr, i, pivot_spot);
                pivot_spot++;
            }
        }
        swap(arr, pivot_spot, last);
        return pivot_spot;
    }

    private static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}

//시간 복잡도: O(n)

//공간 복잡도: O(1)

//최악의 시간 복잡도: O(n^2)