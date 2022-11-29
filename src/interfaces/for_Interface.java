package interfaces;

public class for_Interface implements interface_One,interface_Two
{

    //We can satisfy the multiple inheritance with implementing the interfaces
    @Override
    public void methodOne() {
        System.out.println("I am method One from interface one");
    }

    @Override
    public void methodTwo() {
        System.out.println("I am method Two from interface one");
    }

    @Override
    public void methodThree() {
        System.out.println("I am method Three from interface one");
    }

    @Override
    public void method1() {
        System.out.println("I am method1 from interface two");
    }

    @Override
    public void method2() {
        System.out.println("I am method2 from interface two");
    }

    @Override
    public void method3() {
        System.out.println("I am method3 from interface two");
    }

    public static void main(String[] args) {

        interface_One one=new for_Interface();
        one.methodOne();
        one.methodTwo();
        one.methodThree();

        interface_Two two=new for_Interface();
        two.method1();
        two.method2();
        two.method3();
        
    }


}
