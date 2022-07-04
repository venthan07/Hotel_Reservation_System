package hotelreservationsystem;

import java.util.ArrayList;

/**
 *
 * @author Venthan Ganesh
 */
public class AddAmenities {

    private final ArrayList<Amenities> bookedAmenities;

    public AddAmenities() {
        this.bookedAmenities = new ArrayList();
    }

    public ArrayList<Amenities> getBookedAmenities(){
        return this.bookedAmenities;
    }
    
    public void add(Amenities amenity){
        this.bookedAmenities.add(amenity);
    }
    
    private String printAmenities(){
        String amenitiesList = "";
        for(Amenities amenity: bookedAmenities){
            amenitiesList += "\n -" + amenity.getName();
        }
        return amenitiesList;
    }
    
    @Override
    public String toString(){
       
            return "List of added amenities: " + printAmenities();
        
    }

}
