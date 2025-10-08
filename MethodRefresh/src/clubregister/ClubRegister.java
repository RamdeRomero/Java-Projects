
package clubregister;
import java.util.Scanner;
        
public class ClubRegister {
    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
        displayOption();

        
    }
    public static void displayOption(){
      

    }
    public static int GetNumbers(String strM){
        System.out.print(strM);
        int iInteger= oscan.nextInt();
        return iInteger; 
    }
    public static String GetString(String strM){
        System.out.print(strM);
        String strString= oscan.next();
        return strString; 
    }
    public static float GetFloat(String strM){
        System.out.print(strM);
        float fFloat= oscan.nextFloat();
        return fFloat;
    }
    public static char GetChar(String strM){
        System.out.print(strM);
        char cChar= oscan.next().charAt(0);
        return cChar;
    }
     
}
