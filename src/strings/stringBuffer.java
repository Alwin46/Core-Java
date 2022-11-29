package strings;

public class stringBuffer
{
    public static void main(String[] args) {

        StringBuffer name=new StringBuffer("Alwin");

        //we have to append a strings.string with append method
        System.out.println(name.append("THOR"));

        //we have the reverse the strings.string order in strings.stringBuffer class
        System.out.println(name.reverse());

        //we have to replace the String with this replace method
        System.out.println(name.replace(0,4,"Gamer"));

        //check what is the capacity of strings.stringBuffer
        System.out.println(name.capacity());

        //insert some chars
        System.out.println(name.insert(4,"THOR"));

        //delete
        System.out.println(name.delete(0,7));

        System.out.println(name.length());

        System.out.println(name.substring(1));

        System.out.println(name.substring(0,3));

        System.out.println(name.isEmpty());

        /*
        StringBuilder also similar to String buffer but the only difference is strings.string builder is applicable to run with more than one thread
         but the strings.string buffer is only run with single thread
        */

        //StringBuffer is synchronized
        //StringBuilder is non Synchronized

        //The String Builder is more effective than strings.stringBuffer

        //The String buffer methods are also similar for String builder

    }
}
