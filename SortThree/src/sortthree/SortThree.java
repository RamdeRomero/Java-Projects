package sortthree;
import java.util.Scanner;

public class SortThree {

    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to 3 Number Sorting Program");
        int x,y,z;
        System.out.print("Enter First Number: ");
        x = oscan.nextInt();
        System.out.print("Enter Second Number: ");
        y = oscan.nextInt();
        System.out.print("Enter Third Number: ");
        z = oscan.nextInt();
        System.out.print("Numbers Before Sorting: ");
        System.out.println( x + "," + y + "," + z);
        System.out.print("Numbers After Sorting: ");
        if(x<y && x<z){
            if(y<z){
                System.out.println( x + "," + y + "," + z);
            }
            else if(y>z){
                System.out.println( x + "," + z + "," + y);
            }
        }
        if(y<x && y<z){
            if(x<z){
                System.out.println( y + "," + x + "," + z);
            }
            else if(x>z){
                System.out.println( y + "," + z + "," + x);
            }
        }
        if(z<x && z<y){
            if(x<y){
                System.out.println( z + "," + x + "," + y);
            }
            else if(x>y){
                System.out.println( z + "," + y + "," + x);
            }
        }
        
        
    }
    
}
