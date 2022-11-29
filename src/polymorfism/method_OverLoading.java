package polymorfism;

public class method_OverLoading
{

    public static void method(int id)
    {
        System.out.println("id :"+id);
    }

    public static void method(String name)
    {
        System.out.println("name :"+name);
    }

    public static void method(float id)
    {
        System.out.println("float_id :"+id);
    }

    public static void main(String[] args)
    {
    method(12456);
    method("Alwin");
    method(134.22f);
    }
}
