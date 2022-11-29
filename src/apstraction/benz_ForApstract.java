package apstraction;

public class benz_ForApstract extends cars
{

    @Override
    public void engine() {
        System.out.println("benz engine");
    }

    @Override
    public void body() {
        System.out.println("mercedes benz body");
    }

    @Override
    public void color() {
        System.out.println("red");
    }

    public static void main(String[] args) {
        cars car=new benz_ForApstract();
        car.engine();
        car.body();
        car.color();
    }

}
