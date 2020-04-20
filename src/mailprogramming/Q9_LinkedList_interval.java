package mailprogramming;


import java.util.*;

/**
 * 간격(interval)로 이루어진 배열이 주어지면, 겹치는 간격 원소들을 합친 새로운 배열을 만드시오. 간격은 시작과 끝으로 이루어져 있으며 시작은 끝보다 작거나 같습니다.
 *
 * Given a list of intervals, merge intersecting intervals.
 *
 * 예제)
 *
 * Input: {{2,4}, {1,5}, {7,9}}
 * Output: {{1,5}, {7,9}}
 *
 *
 * Input: {{3,6}, {1,3}, {2,4}}
 * Output: {{1,6}}
 */

public class Q9_LinkedList_interval {
    private static List<Interval> input = new LinkedList<>();
    private static List<Interval> input2 = new LinkedList<>();
    private static List<Interval> output = new LinkedList<>();

    public static class Interval {
        private int start ;
        private int end ;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        input.add(new Interval(2, 4));
        input.add(new Interval(1, 5));
        input.add(new Interval(7, 9));

        output = merge(input);
        show(output);

        input2.add(new Interval(3, 6));
        input2.add(new Interval(1, 3));
        input2.add(new Interval(2, 4));

        output = merge(input2);
        show(output);
    }

    private static  List<Interval> merge(List<Interval> intervals) {
        int cnt = 0;
        List<Interval> solution = new ArrayList<>();
        solution.add(intervals.get(cnt));

        for (int i = 1; i < intervals.size(); i++) {

            if (intervals.get(cnt).start <= intervals.get(i).end && input.get(cnt).start > intervals.get(i).start) {
                solution.get(cnt).start = intervals.get(i).start;
            }
            if (intervals.get(i).end > intervals.get(cnt).end) {
                if (intervals.get(i).end > intervals.get(cnt).end + 1) {
                    cnt++;
                    solution.add(intervals.get(i));
                    break;
                } else {
                    solution.get(cnt).end = intervals.get(i).end;
                }
            }
        }
        return solution;
    }

    private static void show(List<Interval> output) {
        System.out.print("Output : {");
        for(int i = 0; i < output.size() - 1; i++) {
            System.out.print("{");
            System.out.print(output.get(i).start);
            System.out.print(", ");
            System.out.print(output.get(i).end);
            System.out.print("} , ");
        }
        System.out.print("{");
        System.out.print(output.get(output.size()-1).start);
        System.out.print(", ");
        System.out.print(output.get(output.size()-1).end);
        System.out.print("}");
        System.out.println("}");
    }
}

/**
 *  private static int compare(Interval a, Interval b) {
 *         return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
 *     }
 *
 *     private static List<Interval> merge(List<Interval> intervals) {
 *         LinkedList<Interval> solution = new LinkedList<>();
 *
 *         //sort(intervals, compare);
 *
 *         solution.add(intervals.get(0));
 *
 *         for (int i = 1; i < intervals.size(); i++) {
 *             Interval interval = intervals.get(i);
 *             if (solution.getLast().end < interval.start) {
 *                 solution.add(interval);
 *             }
 *             else {
 *                 solution.getLast().end = Math.max(solution.getLast().end, interval.end);
 *             }
 *         }
 *         return solution;
 *     }
 */
