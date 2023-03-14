public class Transport {
    //модификаторы доступа: public, protected, private
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(){
        System.out.println("Object created");
    }
    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setValues(_speed,_weight,_color,_coordinate);
        System.out.println(getValues());
    }
    public Transport(int _weight, byte[] _coordinate){
        System.out.println("Object created");
        weight = _weight;
        coordinate = _coordinate;
        System.out.println(getValues());
    }
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues(){
        String info = "Object speed: " + speed + ", Weight: "+ weight+", Color: " +color + "\n";
        String infoCoordinates = "Coordinates: ";
        for (int i=0; i<coordinate.length;i++)
            infoCoordinates += coordinate[i] + " ";

        return info + infoCoordinates;
    }
}
