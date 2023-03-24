public class Person {

    private static int count;
    public Person(){
        count++;
    }

    public void getCount(){
        System.out.println("Количество: " + count);
    }
}
