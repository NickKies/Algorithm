package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Sort_ArrayList {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args){
        list.add(98);
        list.add(156);
        list.add(12);
        list.add(5);
        list.add(684);
        list.add(1);
        list.add(321);
        list.add(-54);

        C_Sort();
        C_ReverseOrder();
        C_Shuffling();

    }

    private static void C_Sort(){
        System.out.println("Sort()");
        Collections.sort(list);
        show((ArrayList) list);
    }

    private static void C_ReverseOrder(){
        System.out.println("reverseOrder()");
        Collections.sort(list, Collections.reverseOrder());
        show((ArrayList)list);
    }

    private static void C_Shuffling() {
        System.out.println("shuffle()");
        Collections.shuffle(list);
        show((ArrayList)list);
    }

    private static void show(ArrayList a) {
        for(int i = 0; i < a.size() - 1; i++){
            System.out.print(a.get(i) +", ");
        }
        System.out.println(a.get(a.size() -1));
    }
}
