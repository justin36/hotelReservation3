package service;

import model.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class ReservationService {

    Map<String, IRoom> rooms = new HashMap<>();

    public void addRoom(IRoom room) {
        rooms.put(room.getRoomNumber(), room);
    }

//    public IRoom getARoom(String roomNumber) {
//        return rooms.get(roomNumber);
//    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {




        return null;
    }

    public Collection<Reservation> getCustomersReservation(Customer customer) {
        Collection<Reservation> customerReservation_HashSet = new HashSet<>();


        return

    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);

        return reservation;
    }



//    public static void main(String[] args) {
//        Customer joon = new Customer("Joon", "Kim", "pauluskim0306@gmail.com");
//
//        Room room = new Room("101", 0.0, RoomType.SINGLE);
////        Date startDate = new SimpleDateFormat("MM-dd-yy").parse("10-22-22");
////        Date endDate = new SimpleDateFormat("MM-dd-yy").parse("10-23-22");
//
//        Reservation reser = reserveARoom(joon, room, new Date(2022,04,15), new Date(2022, 04,16));
//
//        System.out.println(reser);


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
