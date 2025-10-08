package methodrefreshment;
import java.util.Scanner;
public class MethodRefreshment {

    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
        Display("STUDENT INFORMATION:\n\n");
        String strFirstName= GetString("Enter First Name:");
        String strSecondName= GetString("Enter Middle Name:");
        String strLastName= GetString("Enter Last Name:");
        String strCourse= GetString("Enter Course:");
        int iYear= GetNumbers("Enter Year level:");
        String strContactNum= GetString("Enter Contact Number:");
        Info(strFirstName,strSecondName,strLastName,strCourse,iYear,strContactNum);
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
 
    public static void Info(String strFirName1,String strMidName1, String strLasName1, String strCourse1, int iYear1,String strContNum1){
        System.out.println("\nHere IS YOUR INFO\n" + "\nFirst Name:" + strFirName1 +"\nMiddle Name:"+ strMidName1 +"\nLast Name"+ strLasName1 + "\nCourse:" + strCourse1 +"\nYear Level:"+ iYear1 + "\nContact Number:" + strContNum1);
        
    }
}
