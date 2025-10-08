package examination;
import java.util.Scanner;

public class Examination {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char cAgain = 0;
        
        SOP("Welocome to Array Operation Program!");
        int iSize= GetNumbers("First Enter how many Data you will input: ");
        int iData[] = new int[iSize];
        int iUpdateData[]= new int[iSize];
        SOP("Now Input "+iSize+" Numbers!");
        for(int x=0; x<iSize; x++){
            iData[x]= GetNumbers("Data #"+ (x)+": ");
        }
        
        
        do{
            
        
            SOP("\nMENU: \n\t1.TRAVERSE \n\t2.SEARCH DATA  \n\t3.UPDATE DATA\n\t4.DELETE \n\t5.INSERT \n\t6.EXIT");
            SOP("\nPlease enter the number of your desired Operation:");
             int iOperation= GetNumbers(" ");
        
            switch (iOperation) {
                case 1:{
                        SOP("Welocome to Traverse Operation");
                        SOP("This are your Data");
                        Traverse(iData,iSize);
                    
                        break;
                }
                case 2:{
                        SOP("Welocome to Search Data Operation");
                        
                        int iSearch=  GetNumbers("Options:\n\t\t1.SEARCH INDEX  \n\t\t2.SEARCH ELEMENT \nEnter The number of your desired option:  ");
                        if(iSearch==1){
                            SOP("Welocome to Search Index");
                            SearchIndex(iData);
                        }
                        else if(iSearch==2){
                            SOP("Welocome to Search Element");
                            SearchElement(iData);
                        }
                        break;
                }
                case 3:{
                        SOP("Welocome to Update Data Operation");
                        
                        int iSearch=  GetNumbers("Options:\n\t\t1.UPDATE INDEX  \n\t\t2.UPDATE ELEMENT \nEnter The number of your desired option:  ");
                        if(iSearch==1){
                            SOP("Welocome to Update Index");
                            iUpdateData = UpdateIndex(iData);
                            SOP("New Values: ");
                            Traverse(iUpdateData, iSize);
                        }
                        else if(iSearch==2){
                            SOP("Welocome to Update Element");
                            iUpdateData = UpdateElement(iData);
                            SOP("New Values:");
                            Traverse(iUpdateData, iSize);
                        }
                        
                        break;
                }
                case 4:{
                    SOP("Welocome to Search Delete Operation");
                    
                    break;
                }
                case 5:{
                    SOP("Welocome to Search Insert Operation");
                    Insert(iData,iSize);

                    break;
                }
                case 6:{
                    SOP("Bye!");
                    break;
                }
                default:{
                    SOP("\t\tINPUT Error. Please Try Again!");
                    
                    break;
                }
            }
            if(iOperation!=6){
                cAgain= GetChar("\nPress y to Try Again or Another key to Exit:");
            }
            else if(iOperation==6){
                cAgain='n';
            }
        }while(cAgain=='y');
    }
        
    
    public static int GetNumbers(String strM){
        System.out.print(strM);
        int iInteger = input.nextInt();
        return iInteger;
    }
    public static String SOP(String strM){
        System.out.println(strM);
        
        return strM;
    }
    public static String GetString(String strM){
        System.out.print(strM);
        String strString;
        strString = input.nextLine();
        return strString;
    }
    public static char GetChar(String strM){
        System.out.print(strM);
        char cChar;
        cChar = input.next().charAt(0);
        return cChar;
    }
    
    public static void Traverse(int iNewData[], int iSize1){    
        
        for(int x=0; x<iSize1; x++){
            SOP("Data "+ (x)+": "+ iNewData[x]);
        }
    }
    public static int[] UpdateIndex(int iNewData[]){
        int iIndex= GetNumbers("Enter Idex Number to Update: ");
        int ia = 0;
        for(int x=0; x<iNewData.length; x++){
            if(iIndex== x){
            int iNewVal= GetNumbers("Enter New Value: ");
            iNewData[iIndex]=iNewVal;
            ia=1;
            } 
            
        }
        if(ia !=1){
            SOP("No Element Found" );
        }    
        
        return iNewData;
    }
    public static int[] UpdateElement(int iNewData[]){
        int iValue= GetNumbers("Enter The Value to Update: ");
        int ia = 0;
        for(int x=0; x<iNewData.length; x++){
            if(iValue==iNewData[x]){
                int iNewVal= GetNumbers("Input The New Value:");
                iNewData[x]=iNewVal;
                ia=1;
            }
        }
        if(ia !=1){
            SOP("No Element Found" );
        }
        return iNewData;
    }
    public static int[] SearchIndex(int iNewData[]){
        int iIndex= GetNumbers("Enter Index Number to Search:");
        int ia = 0;
        for(int x=0; x<iNewData.length; x++){
            if(iIndex== x){
                SOP("Result:" );
                SOP("Index is in Data "+(x)+". containing:"+ iNewData[x]);
                ia=1;
            } 
        }
        
        if(ia !=1){
            SOP("No index Found" );
        }
        return iNewData;
    }
    public static int[] SearchElement(int iNewData[]){
        int iValue= GetNumbers("Enter The Value to Search: ");
        int ia = 0;
        for(int x=0; x<iNewData.length; x++){
            if(iValue==iNewData[x]){
                SOP("Result:" );
                SOP("Value is in Data "+(x)+". containing:"+ iNewData[x]);
                ia=1;
            }

        }
        if(ia !=1){
            SOP("No value Found" );
        }
        return iNewData;
    }
    public static int[] Insert(int iNewData[],int iSize1){
        SOP("List of Values:");
        Traverse(iNewData,iSize1);
        //iSize1++;
        int iInsert= GetNumbers("Enter the value that you want to insert: ");
        int iIndex = GetNumbers("Enter the index where you want to put the value: ");
        iNewData[iIndex]=iInsert;
        SOP("Updated List");
        Traverse(iNewData, iSize1);
        return iNewData;
    }
}
