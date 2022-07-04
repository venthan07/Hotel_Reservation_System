

package hotelreservationsystem;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Venthan Ganesh
 */
public class Task extends TimerTask{

    private Timer timer;
    private int count;
    
    public Task(Timer timer){
        this.timer = timer;
    }
    public void run(){
       
        Scanner sc = new Scanner(System.in);
        Login login = null;
        
        do {

            if (count == 3) {
                System.out.println("you have made too many attempts");
                timer.cancel();
                break;
            }
            System.out.print("Username: ");
            String userName = sc.next();
            System.out.print("Password: ");
            String password = sc.next();

            login = new Login(userName, password);
            count++;
        } while (login.getValidator() == -1);
    }
}
