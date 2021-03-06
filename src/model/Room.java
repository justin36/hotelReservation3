package model;

public class Room implements IRoom {
    String roomNumber;
    Double price;
    RoomType enumeration;


    public String getRoomNumber() {
        return this.getRoomNumber();
    }

    public double getRoomPrice() {
        return this.getRoomPrice();
    }

    public RoomType getRoomType() {
        return this.getRoomType();
    }

    public boolean isFree() {
        return this.isFree();
    }

    public Room(String roomNumber, Double price, RoomType enumeration) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.enumeration = enumeration;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + enumeration +
                '}';
    }
}
