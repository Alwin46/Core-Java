package apstraction;

public class audi_ForApstract extends cars
{

    @Override
    public void engine() {
        System.out.println("audi engine");
    }

    @Override
    public void body() {
        System.out.println("audi car's body");
    }

    @Override
    public void color() {
        System.out.println("white color");
    }

    public static void main(String[] args) {
        cars car=new audi_ForApstract();
        car.engine();
        car.body();
        car.color();
    }
}
