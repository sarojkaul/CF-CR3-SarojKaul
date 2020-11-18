package citybike;

import java.util.ArrayList;

public class Station {
        int stationID;
        String location;
        ArrayList<Bike> bikes; //Arraylist containing bikes from Bike class

           int diffTime = 4;
          int  upperLimit = 4;

    public Station(int stationID,String location){
            this.stationID = stationID;
            this.location=location;
            this.bikes = new ArrayList<>();

        }


    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    //Method that add the bikes to station
        public boolean addBike(Bike bike) {
            if (this.upperLimit <= this.bikes.size()) {
                System.out.println("\n The station" + this.stationID + " is full");
            } else {
                bikes.add(bike);

            }
            return false;
        }
        //Method for returning Bike
        public void removeBike(Bike bike){

            bikes.remove(bike);
            System.out.println("Bike"+bike.getBikeID() +" is remove from" +location);

        }
        public static void rentBike( User user,Bike bike,Station station){
            //user.userrentedbike(bike);
            station.removeBike(bike);
            System.out.println("\n User" +user.getUsername() +" " + "is now renting Bike" +bike.getBikeID()+" from the station " +station.location);
        }
        public static void returnbike(User user,Bike bike,Station station){
        if(station.addBike(bike)){
             user.userReturnbike(bike);
            System.out.println("\n User" +user.getUsername() +"has returned bike" +bike.getBikeID() +"to station" +station.location);
        }
        }

       /*public void rentBikes(Bike bike,Rent rent){
            LocalDate rentstart = rent.getRentStart();
            LocalDate rentenddate = rent.getRentEnd();
           Period diff =  Period.between(rentstart,rentenddate);
            if(diffTime<=diff){

            }

        }*/

            @Override
            public String toString() {
                return "Station{" +
                        "stationID=" + stationID +
                        ", location='" + location + '\'' +
                        ", bikes=" + bikes +
                        '}';
            }
        }



