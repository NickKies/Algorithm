package mailprogramming;

/**
 * 정수 배열이 주어지면 , 배열 안의 모든 정수의 최대 공약수(GCD)를 구하시오.
 * 시간 복잡도 제한 O(n)
 * Given an integer array, find the greatest common denominator of all elements.
 *
 * input: [3, 2, 1]
 * output: 1
 *
 * input: [2, 4, 6, 8]
 * output: 2
 */

public class Q18_greatest_common_denominator {
    private static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    private static int getGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {3, 2, 1};
        int[] input2 = {2, 4, 6, 8};


        int output1 = getGCD(input1, input1.length);
        int output2 = getGCD(input2, input2.length);

        System.out.println("output1: " + output1);
        System.out.println("output2: " + output2);

    }
}
