package basic;

import static basic.Printer.show;

/*
    Q. 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
    1 10 5 8 7 6 4 3 2 9


퀵 정렬 - 특정한 값을 기준으로 큰 숫자와 작은 숫자를 서로 교환한 뒤에 배열을 반으로 나누어 정렬하는 방식.
          퀵정렬의 평균 시간 복잡도는 O(N*logN)이지만 데이터가 이미 정렬돼 있을경우 O(N^2)
 */
public class Q4_Quick_Sort {
    private static int num = 10;
    private static int[] data = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    private static String tc = "O(N*logN) ~ O(N^2)";

    public static void main(String[] args){
        quickSort(data, 0, num -1);
        Printer.show(data, tc);
    }

    private static void quickSort(int[] data, int start, int end) {
        if(start >= end) {
            return;
        }

        int key = start;
        int i = start + 1, j = end, temp;

        while(i <= j){
            while(i <= end && data[i] <= data[key]){
                i++;
            }
            while(j > start && data[j] >= data[key]){
                j--;
            }
            if(i > j) {
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data, start, j -1);
        quickSort(data, j + 1, end);

    }
}
