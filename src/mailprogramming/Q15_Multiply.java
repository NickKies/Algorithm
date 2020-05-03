package mailprogramming;

/*
정수로된 배열이 주어지면, 각 원소가 자신을 뺀 나머지 원소들의 곱셈이 되게하라.
단, 나누기 사용 금지, O(n) 시간복잡도
Given an integer array, make each element a product of all element values without itself.

예제)
input: [1, 2, 3, 4, 5]
output: [120, 60, 40, 30, 24]

 */
public class Q15_Multiply {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        int n = input.length;

        int[] one = new int[n];
        int product = 1;

        for ( int i = 0; i < n; i++ ) {
            one[i] = product;
            product *= input[i];
        }

        int[] two = new int[n];
        product = 1;
        for ( int i = n - 1; i >= 0; i-- ) {
            two[i] = product;
            product *= input[i];
        }

        int[] output = new int[n];
        for ( int i = 0; i < n; i++ ) {
            output[i] = one[i] * two[i];
        }

        System.out.print("[");

        for ( int i = 0; i < n -1; i++ ) {
            System.out.print(output[i] + ", ");
        }

        System.out.print(output[n-1] + "]");
    }

}
