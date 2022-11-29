package linkedHash;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class linkedHashSet {

    public static void method() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
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

        LinkedHashSet<String> forAddAll = new LinkedHashSet<>();

        forAddAll.addAll(set);
        System.out.println(forAddAll);
        forAddAll.clear();
        System.out.println(forAddAll);

        System.out.println("______________________________");
        //Iterating
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("______________________________");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }


    public static void main(String[] args) {
        method();
    }
}

