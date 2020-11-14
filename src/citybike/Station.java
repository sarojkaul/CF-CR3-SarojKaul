package citybike;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

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

            public Station(HashMap<Integer, String> bikes) {

            }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    //Method that add the bikes to station
        public void addBike(Bike bike) {
            if (this.upperLimit <= this.bikes.size()) {
                System.out.println("\n The station" + this.stationID + "is full");
            } else {
                bikes.add(bike);
            }
        }
        //Method for returning Bike
        public void removeBike(Bike bike){

            bikes.remove(bike);

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



