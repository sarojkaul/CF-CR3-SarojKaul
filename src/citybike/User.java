package citybike;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;


public class User {
    private int userID;
    private String username;
    private String userSurname;
    private ArrayList<Bike> rentedbike;
    private ArrayList<Station> stations;

    public void setUsername(String username) {
        this.username = username;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }
    public void setRentedbike(ArrayList<Bike> rentedbike){
        this.rentedbike=rentedbike;
    }
    public String getUserSurname() {
        return userSurname;
    }
    //creating currently rented method
    public ArrayList<Bike> getRentedbike(ArrayList<Bike> rentedbike){
                 return rentedbike;

    }
    public void userrentedbike(Bike bike){
         this.rentedbike.add(bike);
        System.out.println(getUsername() +"user renting" +bike +"from station" +stations); //Start from next after class
    }
    public void userReturnbike(Bike bike){

        this.rentedbike.remove(bike);
        System.out.println(getUsername() +"User returning a bike" +rentedbike +"to station" +stations);
    }

    @Override
    public java.lang.String toString() {
        return "User{" +
                "userID=" + userID +
                ", username=" + username +
                ", userSurname=" + userSurname +
                '}';
    }


}


