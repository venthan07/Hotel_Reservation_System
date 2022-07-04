package hotelreservationsystem;

/**
 *
 * @author Venthan Ganesh
 */
public class BookRoom {

    private int numNights;
    private int numOccupants;
    private RoomTypes roomType;
    private String checkInDate;
    private String checkOutDate;
    private AddAmenities amenities;
    private boolean parkingRequested;


     public BookRoom(int numNights, int numOccupants, RoomTypes roomType, String checkInDate, String checkOutDate, boolean parkingRequested
                     , AddAmenities amenities) {
        this.setNumNights(numNights);
        this.setNumOccupants(numOccupants);
        this.setRoomType(roomType);
        this.setCheckInDate(checkInDate);
        this.setCheckOutDate(checkOutDate);
        this.isParkingRequested(parkingRequested);
       this.setAmenities(amenities);

    }
    
    public int getNumNights() {
        return numNights;
    }

    public int getNumOccupants() {
        return numOccupants;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public void setNumOccupants(int numOccupants) {
        this.numOccupants = numOccupants;
    }

    public void setRoomType(RoomTypes roomType) {
        this.roomType = roomType;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
    
    public void isParkingRequested(boolean parkingRequested){
        this.parkingRequested = parkingRequested;
    }
    
    public void setAmenities(AddAmenities amenities){
        this.amenities = amenities;
    }

    @Override
    public String toString() {
        return "\nRoomtype: " + this.roomType.getName() + "\nTotal number of nights: " + this.numNights + "\nNumber of occupants: "
                + this.numOccupants + "\nCheck-In Date: " + this.checkInDate + "\nCheck-Out Date: " + this.checkOutDate + "\nParking Requested: "
                + (this.parkingRequested ? "yes" : "no")  + "\n" + amenities.toString() + "\n" ;
    }

}
