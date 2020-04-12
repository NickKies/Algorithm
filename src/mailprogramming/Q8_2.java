package mailprogramming;

import java.util.ArrayList;
import java.util.List;

public class Q8_2 {
        private static int[] input = {2,5,6,1,10,3};
        private static int target = 8;
        private static List<Integer> output = new ArrayList<>();

        public static void main(String[] args) {

            long start = System.currentTimeMillis(); //시작하는 시점 계산

            searchTargetSum(input.length-1);

            int line =0;
            for(int i : output) {
                if(line % 2 == 0) {
                    System.out.println(" ");
                }
                System.out.print(i+" ");
                line++;

            }

            long end = System.currentTimeMillis(); //프로그램이 끝나는 시점 계산
            System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");

        }

        public static void searchTargetSum(int index) {
            if(index == 0) {
                return;
            }else {
                for(int i=index-1;i>=0;i--) {
                    int sum = input[index] + input[i];
                    if(sum == target ) {

                        output.add(i);
                        output.add(index);
                    }
                }

                searchTargetSum(index-1);
            }

        }
}
