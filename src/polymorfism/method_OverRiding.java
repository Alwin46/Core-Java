package polymorfism;

public class method_OverRiding extends for_MethodOverRiding
{

    @Override
    public void method1()
    {
        System.out.println("I am a method one");
        //super.method1();
    }

    @Override
    public void method2()
    {
        System.out.println("I am a method two");
        //super.method2();
    }

    public static void main(String[] args)
    {
        for_MethodOverRiding overRiding=new method_OverRiding();
        overRiding.method1();
        overRiding.method2();
    }

}
