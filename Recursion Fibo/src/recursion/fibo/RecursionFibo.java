package recursion.fibo;
import java.util.Scanner;
public class RecursionFibo {

    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
         int iF0, iF1, iFN, iFTotal=0, iCount=0;
        Display("WELCOME! \nFIBONACCI SEQUENCE CALCULATOR\n");
        iF0= GetNumbers("Enter the F0: ");
        iF1= GetNumbers("Enter the F1: ");
        iFN= GetNumbers("Enter the FN: ");
        Compute(iF0, iF1, iFN, iCount, iFTotal);   
        
    }

    public static void Compute(int iFx, int iFy, int iFz, int iC, int iFt){
        
        if(iC<=iFz){
            int iStore = iFx;
            iFx= iFy;
            iFy= iStore + iFx; 
            System.out.print( "F"+iC+":"+ iStore +" \n");
            iFt= iFt+iStore;
            
            Compute(iFx, iFy, iFz, iC+1, iFt);
            
        }
        else {
            
           System.out.print("Fibonacci Total:"+iFt+"\n Computation Done"); 
           
        }
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
    public static String Display(String strM){
        System.out.print(strM);
        
        return strM;
    }     
 
    

}
