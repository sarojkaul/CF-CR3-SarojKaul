package citybike;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Rent {
    ArrayList<Bike> bikeID;
    Date rentStart;
    Date rentEnd;

    public void setBikeID(ArrayList<Bike> bikeID) {
        this.bikeID = bikeID;
    }

    public ArrayList<Bike> getBikeID() {
        return bikeID;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "bikeID=" + bikeID +
                ", rentStart=" + rentStart +
                ", rentEnd=" + rentEnd +
                '}';
    }
}
