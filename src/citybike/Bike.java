package citybike;

public class Bike {
    private static int bikeID;
    private static String color;
    private static int counter = 0;

    public  Bike(String color){
        counter++;
         this.bikeID = counter;
         this.color=color;


    }

    public static int getBikeID() {
          return bikeID;
          
    }
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
