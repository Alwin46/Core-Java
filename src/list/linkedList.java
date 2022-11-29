package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedList
{


    //methods
 public static void method()
 {

     LinkedList<Integer> linkedList=new LinkedList<Integer>();
     linkedList.add(1);
     linkedList.add(2);
     linkedList.add(3);
     linkedList.add(4);
     linkedList.add(5);
     linkedList.add(6);

     System.out.println(linkedList);
     linkedList.addFirst(0);
     System.out.println(linkedList);
     linkedList.addLast(7);
     System.out.println(linkedList);

     System.out.println(linkedList.getFirst());
     System.out.println(linkedList.getLast());

     System.out.println(linkedList.get(0));

     System.out.println(linkedList.removeFirst());
     System.out.println(linkedList.removeLast());

     System.out.println(linkedList.pollFirst());
     System.out.println(linkedList.pollLast());

     linkedList.add(null);
     linkedList.add(2);
     System.out.println(linkedList);

//Iterating
     System.out.println("________________________________");

     for (int index=0; index<linkedList.size(); index++)
     {
         System.out.println("for loop :"+linkedList.get(index));
     }

     System.out.println("________________________________");

     for (Integer list:linkedList)
     {
         System.out.println("for each :"+list);
     }

     System.out.println("________________________________");

     Iterator<Integer> iterator=linkedList.iterator();
     while (iterator.hasNext())
     {
         System.out.println("iterator :"+iterator.next());
     }

     System.out.println("________________________________");

     ListIterator<Integer> iterator1=linkedList.listIterator();
     while (iterator1.hasNext())
     {
         System.out.println("forward iterator :"+iterator1.next());
     }

     System.out.println("________________________________");

     while (iterator1.hasPrevious())
     {
         System.out.println("reverse iterator :"+iterator1.previous());
     }


 }
    public static void main(String[] args) {
     method();
    }
}
