package mailprogramming;

/**
 * 정수 배열과 정수 k가 주어지면 모든 원소를 k칸씩 앞으로 옮기시오.
 *
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * input: [1, 2, 3, 4, 5], k=2
 * output: [3, 4, 5, 1, 2]
 *
 * input: [0, 1, 2, 3, 4], k=1
 * output: [1, 2, 3, 4, 0]
 *
 * 시간복잡도를 최대한 최적화 하시오.
 */
public class Q2_Array {
    public static void main(String[] args){
        int k1 = 2;
        int k2 = 1;
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {0, 1, 2, 3, 4};
        int n = input1.length;
        int m = input2.length;

        rotate(input1, k1);

        System.out.print("input1 : [");

        for(int i = 0; i < n - 1; i++){
            System.out.print(input1[i]+", ");
        }
        System.out.println(input1[n-1]+"]");

        rotate(input2, k2);

        System.out.print("input2 : [");

        for(int i = 0; i < m - 1; i++){
            System.out.print(input2[i]+", ");
        }
        System.out.println(input2[n-1]+"]");
    }

    private static void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
// 시간 복잡도 : O(k * n) = O(n)
