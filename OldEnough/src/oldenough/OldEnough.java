package oldenough;
import java.util.Scanner;

public class OldEnough {
    
    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Program Venue");
        System.out.print("Enter your age: ");
        int iAge = oscan.nextInt();
        if (iAge>=18){
            System.out.print("You can Enter");
           
        }
        else if(iAge<18){
            System.out.print("Sorry, you are not allowed to enter");
        }
        
    }
    
}
