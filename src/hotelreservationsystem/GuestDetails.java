

package hotelreservationsystem;

/**
 *
 * @author Venthan Ganesh
 */
public class GuestDetails {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String address;
    private String phoneNum;
    private String email;
    
    public GuestDetails(String firstName, String lastName,String dateOfBirth, String address, String phoneNum, String email){
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dateOfBirth);
        setAddress(address);
        setPhoneNum(phoneNum);
        setEmail(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
      public String getDateOfBirth() {
        return dateOfBirth;
    }


    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth =dateOfBirth;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "First Name: " + this.firstName + "\nLast Name: " + this.lastName + "\nDOB: " + this.dateOfBirth + 
                "\nAddress: " + this.address + "\nPhone Number: " + this.phoneNum + "\nEmail: " + this.email;
    }
    
}
