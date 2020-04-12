package basic;

import static basic.MyScanner.myScanner_int;

/**
 * 문제
 * 열개의 숫자를 입력받아 다음과 같은 정렬 과정이 출력되도록 하는 프로그램을 작성하세요.
 * 이때 힙 생성을 함에 있어서 하향식을 ㅗ구현을 하셔야 정상적으로 답이 출력됩니다.
 *
 *  예시 입력
 *  10
 *  26 5 37 1 61 11 59 15 48 19
 *
 *  예시 출력
 *  61 48 598 26 19 11 37 15 1 5
 *  59 48 37 26 19 11 5 15 1 61
 *  48 26 37 15 19 11 5 1 59 61
 *  37 26 11 15 19 1 5 48 59 61
 *  26 19 11 15 5 1 37 48 59 61
 *  19 15 11 1 5 26 37 48 59 61
 *  15 5 11 1 19 26 37 48 59 61
 *  11 5 1 15 19 26 37 48 59 61
 *  5 1 11 15 19 26 37 48 59 61
 *  1 5 11 15 19 26 37 48 59 61
 *
 */

public class Q8_Heap_Sort_2_x {
    private static int length;
    private static int[] heap = new int[1000001];

    public static void main(String[] args){
        // 숫자들을 입력받습니다.
        heap = MyScanner.myScanner_int();
        length = heap.length;

        // 힙을 생성합니다.
        for(int i = length / 2; i >= 0; i--){
            heapify(i);
        }

        // 정렬을 수행합니다.
        for(int i = length -1; i >=0; i--){
            for(int j = 0; j < length; j++){

            }
        }
    }

    private static void heapify(int i) {
        // 왼쪽 자식 노드를 가리킵니다.
        int c = 2 * i + 1;

        //오른쪽 자식 노드가 있고, 왼쪽 자식노드보다 크다면
        if(c < length && heap[c] < heap[c + 1]){
            c++;
        }

        // 부모보다 자식이 더 크다면 위치를 교환합니다.
        if(heap[i] < heap[c]){
            int temp = heap[i];
            heap[i] = heap[c];
            heap[c] = temp;
        }
        // length /2 까지만 수행하면 됩니다.
        if(c <= length / 2) heapify(c);
    }
}
