package basic;

import static basic.Printer.show;

/**
 * Merge Sort
 *
 * 다음 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
 * 7 6 5 8 3 5 9 1
 *
 * 병합 정렬 - 하나의 큰 문제를 두개의 작은 문제로 나누어 각자 계산하고 나중에 합친다.
 *
 * 병합정렬은 데이터를 담을 추가적인 공간을 필요하기 때문에 메모리를 비효율적으로 활용
 * * 병합정렬은 일반적으로 퀵정렬보다 느리지만 어떠한 상황에서도 O(N*logN)의 시간복잡도를 보장
 */

public class Q6_Merge_Sort {

    private static int length = 8;
    private static int[] sorted = new int[length];
    private static int[] array = new int[]{7, 6, 5, 8, 3, 5, 9, 1};
    private static String tc = "시간 복잡도 O(N*logN)";

    public static void main(String[] args){
        mergeSort(array, 0, length -1);
        Printer.show(array, tc);
    }

    private static void merge(int[] a, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;

        // 작은 순서대로 배열에 삽입
        while(i <= middle && j <= n){
            if(a[i] <= a[j]) {
                sorted[k] = a[i];
                i++;
            } else {
                sorted[k] = a[j];
                j++;
            }
            k++;
        }

        // 남은 데이터도 삽입
        if(i > middle) {
            for(int t = j; t <= n; t++) {
                sorted[k] = a[t];
                k++;
            }
        } else {
            for(int t = i; t <= middle; t++ ) {
                sorted[k] = a[t];
                k++;
            }
        }

        // 정렬된 배열을 삽입
        for(int t = m; t <= n; t++){
            a[t] = sorted[t];
        }
    }

    private static void mergeSort(int[] a, int m, int n) {
        // 이외의 경우는 크기가 1인 경우
        if(m < n) {
            int middle = (m + n) / 2;
            mergeSort(a, m, middle);
            mergeSort(a, middle + 1, n);
            merge(a, m ,middle, n);
        }
    }
}
