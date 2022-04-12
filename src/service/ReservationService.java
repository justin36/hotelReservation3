package service;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;

import java.util.*;

public class ReservationService {

    Map<String, IRoom> rooms = new HashMap<>();

    public void addRoom(IRoom room) {
        rooms.put(room.getRoomNumber(), room);
    }

    public IRoom getARoom(String roomNumber) {
        return rooms.get(roomNumber);
    }

    public Collection<IRoom> getAllRooms() {
        return rooms.values();
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);

        return reservation;
    }

    public static void main(String[] args) {
        reserveARoom("A", 101, 01/01/22, 03/01/22);

    }



    // Here what I think I need is to give parameters to look for values that don't contain that values
//    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
//
//
//        if (reservation.isEmpty()) {
//
//        }
//    }

//    public Collection<Reservation> getCustomersReservation(Customer customer) {
//
//
//    }




}
