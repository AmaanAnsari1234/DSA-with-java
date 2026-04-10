// Largest Element in the array using List(ArrayList)

import java.util.ArrayList;
import java.util.List;

public class P1
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);
        System.out.println(list);
        list.sort((o1, o2) -> o1-o2);
        System.out.println(list);                                               // Before Sorting [3, 7, 2, 9, 5]
        System.out.println("Largest Element in the array is "+list.getLast());  // After Sorting [2, 3, 5, 7, 9]
    }
}
