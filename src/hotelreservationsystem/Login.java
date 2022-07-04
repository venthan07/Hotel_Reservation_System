package hotelreservationsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Venthan Ganesh
 */
public class Login {

    private String userName;
    private String password;
    private int validator;
    private int count;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.validator = validateLogin();
    }

    public int getValidator() {
        return this.validator;
    }

    private int validateLogin() {
        File loginFile = new File("loginDetails.txt");

        try {

            Scanner sc = new Scanner(loginFile);
            if (loginFile.exists()) {

                outer:
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    String[] fields = line.split("\\|");

                    for (int i = 0; i < fields.length; i++) {
                        if (fields[i].equals(userName) && fields[i + 1].equals(password)) {
                            System.out.println("welcome: " + userName);
                            break outer;
                        }
                    }
                    if (!sc.hasNextLine()) {
                        System.out.println("wrong login and password");
                        return -1;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return 1;
    }
    
    
//    private void timeout(){
//        System.out.println("you have been locked out");
//    }
}
