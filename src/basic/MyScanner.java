package basic;

import java.util.Scanner;

public class MyScanner {
    private static Scanner sc = new Scanner(System.in);
    private static int n, i;

    public static int[] myScanner_int(){
        System.out.println("몇 개의 숫자인지 입력하세요.");
        System.out.print("입력>");
        n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("숫자를 입력하세요.");
        System.out.print("입력>");
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
