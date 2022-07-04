package hotelreservationsystem;

import java.util.*;

/**
 *
 * @author Venthan Ganesh
 * @version 1.1
 */
public class HotelReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tries = getLogin();
        int choice = 0;

//        Timer timer = new Timer();
//        Task task = new Task();
//        if (tries == 3) {
//            timer.schedule(task, 10000);
//        }
        if (tries <= 3) {
            System.out.println("\nPlease choose one of the following options: ");
            System.out.println("1: Create new reservation\n2: View all reservations for specific date\n3: View all reservations");
            choice = sc.nextInt();
        }

        switch (choice) {
            case 1:
                Reservation reservation = reservationInputs(sc);
                int numberOfRooms = reservation.getNumRooms();
                int i = 0;

                while (numberOfRooms > 0) {
                    int roomNumber = numberOfRooms - (numberOfRooms - 1);
                    BookRoom roomBooked = roomDetails(sc, roomNumber + i++);
                    reservation.getBookedRooms().add(roomBooked);
                    numberOfRooms--;
                }
                System.out.println(reservation);

                break;
            case 2:
                break;
            case 3:
                break;
        }

    }

    public static int getLogin() {
        Scanner sc = new Scanner(System.in);
        Login login = null;
        int count = 0;
        do {

            if (count == 3) {
                System.out.println("you have made too many attempts");
                break;
            }
            System.out.print("Username: ");
            String userName = sc.next();
            System.out.print("Password: ");
            String password = sc.next();

            login = new Login(userName, password);
            count++;
        } while (login.getValidator() == -1);
        return count;
    }

    public static Reservation reservationInputs(Scanner sc) {

        System.out.print("First Name: ");
        String fName = sc.next();
        sc.nextLine();
        System.out.print("Last Name: ");
        String lName = sc.next();
        sc.nextLine();
        System.out.print("DOB: ");
        String dob = sc.next();
        sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Phone#: ");
        String phoneNum = sc.next();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();
        System.out.print("Number of rooms: ");
        int numRooms = sc.nextInt();

        return new Reservation(numRooms, fName, lName,
                dob, address, phoneNum, email);

//Reservation reservation = new Reservation(numRooms, startDate, endDate, fName, lName,
//                dob, address, phoneNum, email);
        // System.out.println("\nReservation details" + "\n" + reservation);
    }

    public static BookRoom roomDetails(Scanner sc, int numberOfRooms) {

        String type = "";
        boolean parkingRequested;
        System.out.println("\nDetails for room " + numberOfRooms);
        System.out.print("Number of nights: ");
        int numNights = sc.nextInt();
        System.out.print("Number of occupants: ");
        int numOccupants = sc.nextInt();
        System.out.print("Room Type: \n1.Single\n2.Double\n3.Suite\n4.Luxury Suite\n5.Penthouse Suite\n:");
        int roomType = sc.nextInt();
        switch (roomType) {
            case 1:
                type = "SINGLE";
                break;
            case 2:
                type = "DOUBLE";
                break;
            case 3:
                type = "SUITE";
                break;
            case 4:
                type = "LUXURY_SUITE";
                break;
            case 5:
                type = "PENTHOUSE_SUITE";
                break;
        }
        System.out.print("Check-In Date: ");
        String checkInDate = sc.next();
        System.out.print("Check-Out Date: ");
        String checkOutDate = sc.next();

        String toAdd = "";
        boolean quit = false;
        AddAmenities amenitiesList = new AddAmenities();

        while (!quit) {
            System.out.println("Add Amenities: ");
            System.out.println("1. No Amenities\n2. Pool\n3. Gym\n4. Sauna\n5. Private Lounge\n6. All Access\n7. Finished Adding");
            int amenity = sc.nextInt();

            switch (amenity) {
                case 1:
                    toAdd = "NONE";
                    checkAmenities(amenitiesList, toAdd);
                    if (amenitiesList.getBookedAmenities().contains(Amenities.valueOf("NONE"))) {
                        amenitiesList.getBookedAmenities().clear();
                        amenitiesList.getBookedAmenities().add( Amenities.NONE);
                    };
                    quit = true;
                    break;
                case 2:
                    toAdd = "POOL";
                    checkAmenities(amenitiesList, toAdd);
                    break;
                case 3:
                    toAdd = "GYM";
                    checkAmenities(amenitiesList, toAdd);
                    break;
                case 4:
                    toAdd = "SAUNA";
                    checkAmenities(amenitiesList, toAdd);
                    break;
                case 5:
                    toAdd = "PRIVATE_LOUNGE";
                    checkAmenities(amenitiesList, toAdd);
                    break;
                case 6:
                    toAdd = "ALL_ACCESS";
                    checkAmenities(amenitiesList, toAdd);
                     if (amenitiesList.getBookedAmenities().contains(Amenities.valueOf("ALL_ACCESS"))) {
                        amenitiesList.getBookedAmenities().clear();
                        amenitiesList.getBookedAmenities().add( Amenities.ALL_ACCESS);
                    }
                     quit = true;
                    break;
                case 7:
                   
                    quit = true;
                    break;
            }
        }
     

        System.out.print("Parking requested: ");
        String parkingRequest = sc.next();
        if (parkingRequest.equalsIgnoreCase("y")) {
            parkingRequested = true;
        } else {
            parkingRequested = false;
        }

        return new BookRoom(numNights, numOccupants, RoomTypes.valueOf(type), checkInDate, checkOutDate, parkingRequested, amenitiesList);

    }

    public static void checkAmenities(AddAmenities amenitiesList, String toAdd) {
        Iterator<Amenities> it = amenitiesList.getBookedAmenities().iterator();
        while (it.hasNext()) {
            it.next();
            if (amenitiesList.getBookedAmenities().contains(Amenities.valueOf(toAdd))) {
                int index = amenitiesList.getBookedAmenities().indexOf(Amenities.valueOf(toAdd));
                amenitiesList.getBookedAmenities().set(index, Amenities.valueOf(toAdd));
                break;
            }
        }
        if (!it.hasNext()) {
            amenitiesList.add(Amenities.valueOf(toAdd));
        }
    }
}
