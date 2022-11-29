public class static_Key
{
    //The static block is also has a first priority while run the program
    static
    {
        System.out.println("I am static block 1");
    }

    static
    {
        System.out.println("I am static block 2");
    }

    static String name="Alwin";

    public static void method()
    {
        System.out.println("method");
    }

    public static void main(String[] args) {
        System.out.println("Name :"+name);
        method();

        /*if we have Static access for a variable and method then we can access the method and variables
         without creating object for the particular class*/
    }
}
