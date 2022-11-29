package hash;

import java.util.HashMap;
import java.util.Map;


public class hashMap
{

    public static void method()
    {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"Ducati");
        hashMap.put(2,"Triumph");
        hashMap.put(3,"Kawasaki");
        hashMap.put(4,"Bmw");
        hashMap.put(5,"Benelli");
        hashMap.put(null,"Benelli");


        System.out.println(hashMap);


        HashMap<Integer, String> hashMap1 = new HashMap<>(hashMap);
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        hashMap1.clear();
        System.out.println(hashMap1);

        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Ducati"));
        System.out.println(hashMap.clone());
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.values());
        System.out.println(hashMap.size());

        for (Map.Entry<Integer,String> entry:hashMap.entrySet())
        {
            System.out.println("Key :"+entry.getKey()+" "+"Value :"+entry.getValue());
        }


    }

    public static void main(String[] args) {
        method();
    }
}
