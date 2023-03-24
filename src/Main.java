import db.DB;

public class Main {
    public static void main(String[] args) {
        //ООП: Классы и объекты
/*        Car bmw = new Car(300.5f, 2200, "blue", new byte[]{100,100,100});
        bmw.engine.setValues(false, 2000);
        bmw.engine.info();

        Truck truck = new Truck(4990, new byte[]{125,125,125}, false);
        truck.engine.setValues(true,500);
        truck.engine.info();*/
//        truck.setValues(300.5f, 2200, "blue", new byte[]{100,100,100});
//        System.out.println(truck.getValues());

        /*
        Car flyCar = new Car(400.5f, 999, "green", new byte[]{100,100,100}){
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Машина летит! ");
            }
        };

        flyCar.moveObject(450);*/

        DB db = new DB();
        info();
        info("Hello world!!");

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        Person obj4 = new Person();
        obj4.getCount();

        final int count = 10;
        //count++; //будет ошибка

    }
    //перегрузка методов
    public static void info(){
        System.out.println("HellO!!");
    }

    public static void info (String word){
        System.out.println("Hello world!!");
    }
}