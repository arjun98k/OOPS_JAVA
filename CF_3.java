import java.util.ArrayList;
import java.util.List;

public class CF_3 {
    public static void main(String[] args) {
        List<Integer> ls1 = new ArrayList<>();  
        ls1.add(11); 
        ls1.add(12);
        ls1.add(13);
        ls1.add(14);
        System.out.println(ls1);
        // System.out.println(ls1.get(0 ));
        ls1.set(0, 98);
        System.out.println(ls1);
    }
 
}
