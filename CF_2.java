import java.util.ArrayList;
import java.util.List;

public class CF_2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // list1 = List.of(11,13,14,15,65);
        // list2 = List.of(24,35,67,55);
          list1.add(11);  list2.add(71);
                            list2.add(87);
          list1.add(12);
          list1.add(13);
          list1.add(14);  

        System.out.println(list1);
        list1.removeAll(list2);
        System.out.println(list1);
        
    }
}
