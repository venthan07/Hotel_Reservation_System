package hotelreservationsystem;

import java.util.ArrayList;

/**
 *
 * @author Venthan Ganesh
 */
public class Reservation {

    private int numRooms;
    private final ArrayList<BookRoom> bookedRooms;
    private GuestDetails details;

    public Reservation(int numRooms, String firstName, String lastName, String dateOfBirth, String address,
            String phoneNum, String email) {
        setNumRooms(numRooms);
        setDetails(firstName, lastName, dateOfBirth, address, phoneNum, email);
        this.bookedRooms = new ArrayList();
    }

    public ArrayList<BookRoom> getBookedRooms() {
        return this.bookedRooms;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public GuestDetails getDetails() {
        return details;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public void setDetails(String firstName, String lastName, String dateOfBirth, String address, String phoneNum, String email) {
        this.details = new GuestDetails(firstName, lastName, dateOfBirth, address, phoneNum, email);
    }

    private String printList(){
        String roomDetails = "\n";
        int roomNumber = (this.numRooms - this.numRooms) + 1;
        for(BookRoom room: bookedRooms){
            roomDetails += "\nRoom #" + roomNumber++ +room.toString();
        }
        
        return roomDetails;
    }
    @Override
    public String toString() {
        String info = "\nBOOKING DETAILS:\n" + this.details.toString() + "\nNumber of Rooms: " + this.numRooms;
        return info += printList();
    }

}
