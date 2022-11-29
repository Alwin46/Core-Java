package hash;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet
{
    //methods
    public static void method()
    {
        HashSet<String> set=new HashSet<>();
        set.add("Ducati");
        set.add("Triumph");
        set.add("Bmw");
        set.add("Yamaha");
        set.add("Suzuki");
        set.add("Kawasaki");
        set.add("Kawasaki");
        set.add(null);

        System.out.println(set);
        set.remove(null);
        System.out.println(set.size());
        System.out.println(set.contains("Kawasaki"));
        System.out.println(set.clone());
        System.out.println(set.isEmpty());

        HashSet<String> forAddAll = new HashSet<>(set);

        forAddAll.addAll(set);
        System.out.println(forAddAll);
        forAddAll.clear();
        System.out.println(forAddAll);

        System.out.println("______________________________");
        //Iterating
        for (String s:set)
        {
            System.out.println(s);
        }

        System.out.println("______________________________");
        Iterator<String> iterator=set.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }

    public static void main(String[] args) {
        method();
    }
}
