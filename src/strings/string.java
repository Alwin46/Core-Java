package strings;

public class string {

    public static void main(String[] args) {

        //That's why I say strings.string is immutable
        String name="Alwin";
        System.out.println(name.concat("THOR"));
        System.out.println(name);

        int number=3;

        //get the value's length
        System.out.println(name.length());

        //find out the 2nd char
        System.out.println(name.charAt(2));

        //get the upperCases for name value
        System.out.println(name.toUpperCase());

        //get the lowerCases for name value
        System.out.println(name.toLowerCase());

        //find out is that equal to name value
        System.out.println(name.equals("Alwin"));

        //find out is that equalIgnoreCase to name value
        System.out.println(name.equalsIgnoreCase("ALWIN"));

        //find is it empty
        System.out.println(name.isEmpty());

        //find is it blank
        System.out.println(name.isBlank());

        //verify that contains char
        System.out.println(name.contains("A"));

        //get all char by excluded index level with single parameter
        System.out.println(name.substring(1));

        //get all char by excluded index level with two parameter
        System.out.println(name.substring(1,4));

        //replace the char from the particular strings.string
        System.out.println(name.replace("A","O"));

        //replace the char from the particular strings.string
        System.out.println(name.replace("Alwin","Thor"));

        //check the char index position
        System.out.println(name.indexOf('A'));

        //which index position is have the 'i' after 1 index
        System.out.println(name.indexOf("i",1));

        //we have to trim the waste space of the strings.string
        System.out.println(name.trim());

        //we have to convert a strings.string from any given object like int,float,double etc....
        String newName=String.valueOf(number);
        System.out.println(newName);
        Integer newValue=Integer.valueOf(newName);
        System.out.println(newValue);

        //we have to join the String with use the join method
        System.out.println(String.join("-","Alwin","Thor","46"));
        System.out.println(String.join("/","11","04","2002"));

        //we have to split the strings.string chars to this split method
        String splitChar="I,Am,A,Good,Boy";
        String[] allChar=splitChar.split(",");
        for (String s:allChar)
        {
            System.out.println(s);
        }


    }
}