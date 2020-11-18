package citybike;


import java.util.*;

public class TestApp {
       public static void main(String[] args) {

        // Creating 8 bikes objects
        Bike bike1 = new Bike("Red");
        Bike bike2 = new Bike("Blue");
        Bike bike3 = new Bike("Red");
        Bike bike4 = new Bike("Yellow");
        Bike bike5 = new Bike("Red");
        Bike bike6 = new Bike("Green");
        Bike bike7 = new Bike("Green");
        Bike bike8 = new Bike("Blue");
        //putting all Bikes into Hashmap
        HashMap<Integer,Bike> bikes = new HashMap<>();
        //bike1.getBike because here we need to increase BikeId automatically with creating a new object.

        bikes.put(bike1.getBikeID(),bike1);
        bikes.put(bike2.getBikeID(),bike2);
        bikes.put(bike3.getBikeID(),bike3);
        bikes.put(bike4.getBikeID(),bike4);
        bikes.put(bike5.getBikeID(),bike5);
        bikes.put(bike6.getBikeID(),bike6);
        bikes.put(bike7.getBikeID(),bike7);
        bikes.put(bike8.getBikeID(),bike8);

        //creating 3 station objects and puting them in Hashmap stations

     Station station1 = new Station(001,"Karlsplatz");
     Station station2 = new Station(002,"Landstraße");
     Station station3 = new Station(003,"Schwedenplatz");

     HashMap<Integer,Station> stations = new HashMap<>();
     stations.put(station1.stationID,station1);
     stations.put(station2.stationID,station2);
     stations.put(station3.stationID,station3);

      //usage of addMethod to adding the 3 bikes in station1 and putting 4 bikes in station2 and rest in station3
           station1.addBike(bike1);
           station1.addBike(bike2);
           station1.addBike(bike3);
           station2.addBike(bike4);
           station2.addBike(bike5);
           station2.addBike(bike6);
           station2.addBike(bike7);
           station3.addBike(bike8);

       //creating user using set and get method
           User user1 = new User();
           User user2 = new User();
           user2.setUsername("John Doe");
           user1.setUsername("UserZ");




             //user1 renting bike from station3
           Station.rentBike(user2,bike1,station1);
           //user1 returning  bike
           Station.returnbike(user2,bike1,station2); //User1 is trying to return bike in the full station
           Station.returnbike(user2,bike1,station1);
             //User returning Bike

           Station.rentBike(user1,bike1,station2);//user2 renting bike



           Date date1 = new Date(2020,11,12);
           Date date2 = new Date(2020,11,13);



    }
}
