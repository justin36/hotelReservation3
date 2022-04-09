package model;

public class FreeRoom extends Room{

    @Override
    public double getRoomPrice() {
        return 0.0;
    }

    public FreeRoom() {

    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
