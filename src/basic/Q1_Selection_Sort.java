package basic;
/*
    Q. 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
    1 10 5 8 7 6 4 3 2 9


선택정렬 - 가장 작은 것을 선택해서 제일 앞으로 보내는 알고리즘
 */
public class Q1_Selection_Sort {
    public static void main(String[] args) {
        int i, j, min, temp;
        int index = 0;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(i=0; i<10; i++){
            min = 9999;
            for(j=i; j<10; j++){
                if(min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        for(i=0; i<9; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[9]);
        System.out.println("시간 복잡도 O(N^2)");
    }
}