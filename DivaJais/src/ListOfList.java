import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class ListOfList {
    public static void main(String[] args)
    {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        listOfLists.add(list1);
        listOfLists.add(list2);

        System.out.println("The first list contains: " + listOfLists.get(0));
        System.out.println("The second list contains: " + listOfLists.get(1));
    }
}
