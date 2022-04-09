package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.*;

public class ReservationService {

    Map<String, Room> rooms = new HashMap<>();

    public void addRoom(IRoom room) {
        rooms.put(room.getRoomNumber(), new Room(room.getRoomNumber(), room.getRoomPrice(), room.getRoomType()));
    }

    public IRoom getARoom(String roomId) {
        return rooms.get(roomId);
    }

   public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkoutDate) {

   }

   public Collection<Reservation> findRooms(Date checkInDate, Date checkOutDate){

   }

   public Collection<Reservation> getCustomersReservation(Customer customer) {

   }

   public void printAllReservation() {

   };


}
