public class super_Key
{
   static class a
    {
        String name;
        public void method1()
        {
            System.out.println("I am method 1 from class a");
        }
    }

    static class b extends a
    {
        String name;
        public void method2()
        {
            System.out.println("I am method 2 from class b");
            name="Alwin";
            super.name="Guna";
            System.out.println("Name from b class :"+name);
            System.out.println("Name from a class :"+super.name);

        }

    }
    public static void main(String[] args)
    {
    b B=new b();
    B.method1();
    B.method2();
    }
}
