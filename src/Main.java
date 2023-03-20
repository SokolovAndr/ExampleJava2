public class Main {
    public static void main(String[] args) {
        //ООП: Классы и объекты
//        Car bmw = new Car(300.5f, 2200, "blue", new byte[]{100,100,100});
        Truck truck = new Truck(4990, new byte[]{125,125,125}, false);
        truck.setValues(300.5f, 2200, "blue", new byte[]{100,100,100});
        System.out.println(truck.getValues());

    }
}