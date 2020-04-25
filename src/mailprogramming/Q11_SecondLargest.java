package mailprogramming;

/**
 * 정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.
 * Given an integer array, find the second largest element.
 *
 * 예제)
 *
 * Input: [10, 5, 4, 3, -1]
 * Output: 5
 *
 * Input: [3, 3, 3]
 * Output: Does not exist.
 */

public class Q11_SecondLargest {

    public static void main(String[] args) {
        int[] input1 = {10, 5, 4, 3, -1};
        int[] input2 = {3, 3, 3};

        secondLargest(input1);

        secondLargest(input2);
    }

    private static void secondLargest(int[] arr) {
        int first, second;
        if (arr.length < 2) {
            System.out.println("두 번째로 큰 값은 없습니다.");
            return;
        }
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("두 번째로 큰 값은 없습니다.");
        } else {
            System.out.println(second);
        }
    }
}
