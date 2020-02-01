package basic;
/*
    Q. 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
    1 10 5 8 7 6 4 3 2 9


버블 정렬 - 앞에 있는 값과 비교해서 더 작은 값을 앞으로 보내는 알고리즘
 */
public class Q2_Bubble_Sort {
    public static void main(String[] args) {
        int i, j, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(i = 0; i < 9; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[9]);
        System.out.println("시간 복잡도 O(N^2)");
    }
}