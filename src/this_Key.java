public class this_Key
{
    String name;
    this_Key(String name)
    {
        this.name=name;
        System.out.println("name :"+this.name);
    }

    //we can't use the static key while we use the "this" keyword on both constructor and methods

    String color;
    public void method(String color)
    {
       this.color=color;
       System.out.println("color :"+this.color);
    }

    public static void main(String[] args)
    {
        this_Key key=new this_Key("Alwin");
        key.method("red");
    }
}
