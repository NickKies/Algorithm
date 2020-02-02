package basic;
/*
    Q1. 다음의 숫자들을 오름차순으로 정렬하는 프로그램을 작성하세요.
    1 10 5 8 7 6 4 3 2 9

    Q2.  임의의 숫자를 입력받아 오름차순 과정을 모두 보여주는 프로그램을 작성하세요.
         총 몇 개의 숫자인지 먼저 입력합니다.

        <예시 입력>
        10
        26 5 37 1 61 11 59 15 48 19

        <예시 출력>
        26
        5 26
        5 26 37
        ...


삽입 정렬 - 각 숫자를 적절한 위치에(필요할 때만) 삽입하는 방법
            데이터가 이미 거의 정렬된 상태에서는 어떤 알고리즘 보다도 빠름
 */

import java.util.Scanner;


public class Q3_Insert_Sort {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        boolean run = true;
        while(run) {
            System.out.println("-------------------------------------------");
            System.out.println("문제를 선택하세요.");
            System.out.println("1. Q1 | 2. Q2 | 3. 끝내기");
            System.out.println("-------------------------------------------");
            System.out.print("선택>");
            int selectNum = sc.nextInt();

            if(selectNum == 1) {
                Q1();
            } else if (selectNum == 2) {
                Q2();
            } else {
                run = false;
            }
        }
        System.out.println("종료.");
    }

    private static void Q1() {
        int i, j, temp;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};

        for(i = 0; i < 9; i++){
            j = i;
            while(j > 0 && array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        for(i = 0; i < 10; i++){
            System.out.print(array[i]+", ");
        }
        System.out.println("시간 복잡도 O(N^2)");
    }

    private static void Q2() {
        int n, i, j, temp;
        int[] array = new int[101];

        System.out.println("몇 개의 숫자인지 입력하세요.");
        System.out.print("입력>");
        n = sc.nextInt();

        System.out.println("숫자를 입력하세요.");
        System.out.print("입력>");
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
            for (j = 0; j < i; j++) {
                System.out.print(array[j] + ", ");
            }
            System.out.println(array[i]);
        }
        System.out.println("시간 복잡도 O(N^2)");
    }
}