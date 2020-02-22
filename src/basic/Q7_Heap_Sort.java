package basic;

import static basic.Printer.show;

/**
 * Heap Sort (상향식)
 *
 * 다음 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
 * 7 6 5 8 3 5 9 1 6
 *
 * 힙정렬 - Heap Tree Structure 를 이용해서 정렬.
 * 일반적으로 퀵정렬보다는 느리고, 메모리 측면에서 효율적
 * 하향식 힙정렬, 상향식 힙정렬.
 */
public class Q7_Heap_Sort {
    private static int length = 9;
    private static int[] heap = {7, 6, 5, 8, 3, 5, 9, 1, 6};
    public static void main(String[] args){
        // 힙을 구성
        for(int i = 1; i < length; i++){
            int c = i;
            do {
                int root = (c - 1) / 2;
                if(heap[root] < heap[c]){
                    int temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while (c != 0);
        }

        // 크기를 줄여가며 반복적으로 힙을 구성
        for(int i = length - 1; i >= 0; i--){
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;
            int root = 0;
            int c = 1;
            do {
                c = 2 * root + 1;

                // 자식 중에 더 큰 값을 찾기
                if(c < i - 1 && heap[c] < heap[c + 1]){
                    c++;
                }

                // 루트보다 자식이 크다면 교환
                if(c < i && heap[root] < heap[c]) {
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                root = c;
            } while (c < i);
        }

        // 결과 출력
        String tc = "O(N*logN)";
        Printer.show(heap, tc);
    }
}
