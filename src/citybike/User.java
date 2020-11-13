package citybike;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;


public class User {
    private int userID;
    private String username;
    private String userSurname;
    ArrayList<Bike> rentedbike;

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
    public String getUserSurname() {
        return userSurname;
    }
    //creating currently rented method
    public ArrayList<Bike> getRentedbike(ArrayList<Bike> rentedbike){
         return rentedbike;

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


