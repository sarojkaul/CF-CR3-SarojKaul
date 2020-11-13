package citybike;

import java.util.ArrayList;
import java.util.HashMap;

public class Station {
        int stationID;
        String location;
        ArrayList<Bike> bikes; //Arraylist containing bikes from Bike class

    public Station(int stationID,String location){
            this.stationID = stationID;
            this.location=location;

        }

            public Station(HashMap<Integer, String> bikes) {

            }

    public ArrayList<Bike> getBikes() {
        return bikes;
    }

    //Method that add the bikes to station
        public void addBike(Bike bike){

              //need to add limit for adding bikes

            bikes.add(bike);


        }
        //Method for returning Bike
        public void removeBike(Bike bike){

            bikes.remove(bike);

        }

            @Override
            public String toString() {
                return "Station{" +
                        "stationID=" + stationID +
                        ", location='" + location + '\'' +
                        ", bikes=" + bikes +
                        '}';
            }
        }



