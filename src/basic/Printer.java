package basic;

public class Printer {
    public static void show(int[] a){
        int length = a.length;
        for(int i = 0; i < length - 1; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println(a[length - 1]);
    }

    public static void show(int[] a, String b){
        show(a);
        System.out.print("시간 복잡도 "+ b);
    }

}
