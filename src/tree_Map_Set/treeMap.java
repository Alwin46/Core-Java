package tree_Map_Set;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {


    public static void method()
    {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"Ducati");
        treeMap.put(3,"Triumph");
        treeMap.put(4,"Kawasaki");
        treeMap.put(6,"Benelli");
        treeMap.put(2,"Bmw");
        System.out.println(treeMap);

        TreeMap<Integer,String> treeMap1=new TreeMap<>();
        treeMap1.putAll(treeMap);
        System.out.println(treeMap1);

        treeMap1.clear();
        System.out.println(treeMap1);

        System.out.println(treeMap.headMap(3));
        System.out.println(treeMap.tailMap(3));
        System.out.println(treeMap.subMap(2,5));
        System.out.println(treeMap.containsKey(1));
        System.out.println(treeMap.containsValue("Ducati"));
        System.out.println(treeMap.clone());
        System.out.println(treeMap.isEmpty());
        System.out.println(treeMap.keySet());
        System.out.println(treeMap.get(1));
        System.out.println(treeMap.values());
        System.out.println(treeMap.size());
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.comparator());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.remove(3));
        System.out.println(treeMap.remove(4,"Kawasaki"));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap.pollLastEntry());



        for (Map.Entry<Integer,String> entry:treeMap.entrySet())
        {
            System.out.println("Keys :"+entry.getKey()+" "+"Values :"+entry.getValue());
        }

    }
    public static void main(String[] args) {
        method();
    }
}
