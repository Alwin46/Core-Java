package tree_Map_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet
{

    //methods
    public static void method()
    {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(6);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.clone());
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.headSet(4));
        System.out.println(set.tailSet(4));
        System.out.println(set.subSet(1,5));
        System.out.println(set.comparator());
        System.out.println(set.higher(3));
        System.out.println(set.lower(5));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.descendingSet());

        System.out.println("_______________________________");
        //Iterating
        Iterator<Integer> iterator=set.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("_______________________________");

        Iterator<Integer> iterator1=set.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }

        System.out.println("_______________________________");
        for (Integer integer:set)
        {
            System.out.println(integer);
        }


    }
    public static void main(String[] args) {
        method();
    }
}
