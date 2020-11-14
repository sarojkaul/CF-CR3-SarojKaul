package citybike;


import java.util.*;

public class TestApp {
       public static void main(String[] args) {

        // Creating 8 bikes objects
        Bike bike1 = new Bike(1,"Red");
        Bike bike2 = new Bike(2,"Blue");
        Bike bike3 = new Bike(3,"Red");
        Bike bike4 = new Bike(4,"Yellow");
        Bike bike5 = new Bike(5,"Red");
        Bike bike6 = new Bike(6,"Green");
        Bike bike7 = new Bike(7,"Green");
        Bike bike8 = new Bike(8,"Blue");
        //putting all Bikes into Hashmap
        HashMap<Integer,String> bikes = new HashMap<>();
        //bike1.getBike because here we need to increase BikeId automatically with creating a new object.

        bikes.put(bike1.getBikeID(),bike1.getColor());
        bikes.put(bike2.getBikeID(),bike2.getColor());
        bikes.put(bike3.getBikeID(),bike3.getColor());
        bikes.put(bike4.getBikeID(),bike4.getColor());
        bikes.put(bike5.getBikeID(),bike5.getColor());
        bikes.put(bike6.getBikeID(),bike6.getColor());
        bikes.put(bike7.getBikeID(),bike7.getColor());
        bikes.put(bike8.getBikeID(),bike8.getColor());

        //creating 3 station objects and puting them in Hashmap stations

     Station station1 = new Station(001,"Karlsplatz");
     Station station2 = new Station(002,"Landstraße");
     Station station3 = new Station(003,"Schwedenplatz");
     HashMap<Integer,String> stations = new HashMap<>();
     stations.put(station1.stationID,station1.location);
     stations.put(station2.stationID,station2.location);
     stations.put(station3.stationID,station3.location);
           Station station = new Station(bikes);



      //usage of addMethod to adding the 3 bikes in station1 and putting 4 bikes in station2 and rest in station3station1.addBike(bike1);/*station1.addBike(bike2);
      //usage of addMethod to adding the 3 bikes in station1 and putting 4 bikes in station2 and rest in station3station1.addBike(bike1);/*station1.addBike(bike2);
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


           System.out.println(user1.getUsername()+" rents " +"Bike"+Bike.getBikeID() +" from " +station1.location);

           station1.removeBike(bike8);//Remove the bike8 from station 1
           System.out.println("Bike" +Bike.getBikeID() +" is removed from that station and connected to " +user1.getUsername());
             //user1 renting bike from station3
           user1.getRentedbike(station3.bikes);
           System.out.println(user1.getUsername()+" is now renting that bike");

           System.out.println(user1.getUsername()+" returns  a bike to station" +station2.location);

           System.out.println(station1);
           //user2 renting bike from station2
           user2.getRentedbike(station2.bikes);
           System.out.println(user2.getUsername() +" is now renting Bike ID " +bike6.getBikeID() +"from Station" + station2.location);
           System.out.println(user2.getUsername() +" returned bike " +bike6.getBikeID() +" Station " +station2.location);
           System.out.println(user2.getUsername() +" tries to return a bike to a full station");
           station2.addBike(bike6);

           Date date1 = new Date(2020,11,12);
           Date date2 = new Date(2020,11,13);



    }
}
