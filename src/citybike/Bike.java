package citybike;

public class Bike {
    private static int bikeID;
    private static String color;

    public  Bike(int bikeID,String color){
         this.bikeID = bikeID;
         this.color=color;

    }

    public static int getBikeID() {
        return bikeID;   //return bikeID++; tried to create here increment bikeid with creating new object but not come desire result
    }//bikeID will increase with creating the new bike objects

    public static String getColor() {
        return color;
    }

    public static void setBikeID(int bikeID) {
        Bike.bikeID = bikeID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                '}';
    }
}