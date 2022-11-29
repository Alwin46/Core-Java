package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrayList {

    public static void method()
    {

        //ArrayList Methods
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Kawasaki");
        arrayList.add("Bmw");
        arrayList.add("Ducati");
        arrayList.add("Triumph");
        arrayList.add("Benelli");
        arrayList.add("Yamaha");
        arrayList.add("Benelli");
        arrayList.add(null);




        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf("Benelli"));
        System.out.println(arrayList.lastIndexOf("Benelli"));
        System.out.println(arrayList.indexOf("suzuki"));

        ArrayList<String> newArray=new ArrayList<String>();
        newArray.addAll(arrayList);

        System.out.println(newArray);
        newArray.clear();
        System.out.println(newArray);

        arrayList.remove(0);
        System.out.println(arrayList);

        arrayList.remove("Bmw");
        System.out.println(arrayList);

        arrayList.set(0,"MvAgusta");
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());

        System.out.println("After methods");


        //Iterating
        System.out.println("_____________________________________________");
        for (String s:arrayList)
        {
            System.out.println("Using for each :"+s);
        }

        System.out.println("_____________________________________________");
        for (int i=0; i<arrayList.size(); i++)
        {
            System.out.println("Using for loop :"+arrayList.get(i));
        }

        System.out.println("_____________________________________________");
        ListIterator<String> iterator=arrayList.listIterator();
        while (iterator.hasNext())
        {
            System.out.println("List iterator forward :"+iterator.next());
        }

        System.out.println("_____________________________________________");
        while (iterator.hasPrevious())
        {
            System.out.println("list iterator reverse :"+iterator.previous());
        }


        System.out.println("_____________________________________________");
        Iterator<String>iterator1=arrayList.iterator();

        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next());
        }


    }

    public static void main(String[] args) {
        method();
    }

    }

