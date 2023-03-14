public class Main {
    public static void main(String[] args) {
        //ООП: Классы и объекты
        Transport bmw = new Transport();
        bmw.setValues(500.1f, 2500, "green", new byte[]{0,0,0});
        String res1 =  bmw.getValues();
        System.out.println(res1);
//        bmw.speed = 500.1f;
//        bmw.weight = 2500;
//        bmw.color = "green";
//        bmw.coordinate = new byte[] {0,0,0};

        Transport truck = new Transport();
//        truck.speed = 130.5f;
//        truck.weight = 5400;
//        truck.color = "grey";
//        truck.coordinate = new byte[] {50,50,50};
//        String res2 = truck.getValues();
//        System.out.println(res2);

        Transport mercedes = new Transport(300.5f, 2200, "blue", new byte[]{100,100,100});
        Transport gazel = new Transport(4990, new byte[]{125,125,125});

    }
}