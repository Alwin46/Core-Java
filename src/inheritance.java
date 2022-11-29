public class inheritance
{

    static class a
    {
        public void method1()
        {
            System.out.println("method a from a class");
        }
    }

    static class b extends a
    {
        public void method2()
        {
            System.out.println("method b from b class");
        }
    }

    //we can access a methods and variables and all stuffs from subClass to superClass,which is

    /*
    *We have a four level of inheritance like one is
    * Single level
    * multi level
    * hierarchical
    * multiple ; note: we can't use the multiple inheritance in java because the multiple inheritance is not supports in java ,
      we can satisfy that in interface implementation.
    */

    public static void main(String[] args) {

        b B=new b();
        B.method1();
        B.method2();
    }
}
