package service;

import model.*;

import java.util.*;

public class ReservationService {

    static Map<String, Room> mapOfRooms = new HashMap<String, Room>();

    public static void addRoom(Map<String, Room> map, Room room) {
        map.put(room.getRoomNumber(), room);
    }

    public static Room getARoom(String roomNumber) {
        return mapOfRooms.get(roomNumber);
    }

    public static Collection<Room> getAllRooms() {
        return mapOfRooms.values();
    }

//    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
//        return null;
//    }
//
//    public Collection<Reservation> getCustomersReservation(Customer customer) {
//        Collection<Reservation> customerReservation_HashSet = new HashSet<>();
//        return null;
//    }

//    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
//        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
//
//        return reservation;
//    }



    public static void main(String[] args) {
        Room room101 = new Room("101", 100.0, RoomType.SINGLE);

        ArrayList<Room> room = new ArrayList<Room>();
        room.add(room101);

//        for (Room r : room) {
//            ReservationService.addRoom(mapOfRooms, r);
//        }

        System.out.println(getARoom("101"));

        System.out.println(getAllRooms());
    }

}
