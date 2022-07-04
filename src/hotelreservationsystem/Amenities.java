
package hotelreservationsystem;

/**
 *
 * @author Venthan Ganesh
 */
public enum Amenities {

    NONE("No Amenities", 0),
    POOL ("Pool", 9.99),
    GYM ("Gym", 9.99),
    SAUNA ("Sauna", 4.99),
    PRIVATE_LOUNGE("Private Lounge", 14.99),
    ALL_ACCESS("All Access", 34.99);
    
    private final String name;
    private final double cost;

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
    
    
    
    private Amenities(String name, double cost){
        this.name = name;
        this.cost = cost;
    }
}
