
package hotelreservationsystem;

/**
 *
 * @author Venthan Ganesh
 */
public enum RoomTypes {

    SINGLE("Single Room",149.99,65,2,39.99),
    DOUBLE("Double Room",189.98,35,2,49.99),
    SUITE("Suite", 269.98,26,4,69.99),
    LUXURY_SUITE("Luxury Suite", 499.99,12,4,99.99),
    PENTHOUSE_SUITE("Penthouse Suite", 1399.00, 2,8,199.99);
    
    final private String name;
    final private double price;
    final private int totalNumRooms;
    final private int defaultOccupancy;
    final private double addCost;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getTotalNumRooms() {
        return totalNumRooms;
    }

    public int getDefaultOccupancy() {
        return defaultOccupancy;
    }

    public double getAddCost() {
        return addCost;
    }
    
    
    private RoomTypes(String name, double price, int totalNumRooms, int defaultOccupancy, double addCost){
        this.name = name;
        this.price = price;
        this.totalNumRooms = totalNumRooms;
        this.defaultOccupancy = defaultOccupancy;
        this.addCost = addCost;
    }
}
