public class constructor
{
    static String name;
    //default constructor
   /* if we assign a variable without any value then the default constructor will give the value for the variable and also default
    constructor is not visible we can't see that with our naked eyes.
    */


    String color;
    int id;
    //non parameterized constructor
    /*The non parameterized constructor's disadvantage is which is not a reusable one*/
    constructor()
    {
        color="red";
        id=2022123;
        System.out.println("color :"+color);
        System.out.println("id :"+id);
    }

    //parameterized constructor is reusable with any variables and values
    constructor(String name,int id)
    {
        System.out.println("name :"+name);
        System.out.println("id :"+id);
    }


    //This is actual constructor overloading
    constructor(String Name,String color)
    {
        System.out.println("Name :"+Name);
        System.out.println("num :"+color);
    }

    constructor( int id,float num)
    {
        System.out.println("id :"+id);
        System.out.println("num :"+num);
    }


    public static void main(String[] args) {
        System.out.println(name);
        /*if we don't have any non parameterized constructor then we can't use the non parameterized object with the particular class,if we need to call any method we should  give the
        static key for the particular method and call the method directly in main method*/
        constructor C = new constructor();
        constructor C1 = new constructor("Alwin", 790244);
        constructor C2 = new constructor("Gun", 5177);
        constructor C3 = new constructor("THOR", "red");
        constructor C4 = new constructor(2133,6566.f);
    }
}
