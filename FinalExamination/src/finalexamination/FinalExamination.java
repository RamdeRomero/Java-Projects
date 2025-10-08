package finalexamination;
import java.util.Scanner;

public class FinalExamination {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Array someArr = new Array();
        someArr.inputElement();   
    
    }
       
        
        

}
class Array{
    private int iInteger;
        
    public static Scanner input = new Scanner(System.in);
        
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
    
    public static void inputElement(){
        char cAgain = 0;
        
        SOP("Welocome to Array Operation Program!");
        int iSize= GetNumbers("First Enter how many Data you will input: ");
        int iData[] = new int[iSize];
        int iUpdateData[]= new int[iSize];
        SOP("Now Input "+iSize+" Numbers!");
        for(int x=0; x<iData.length; x++){
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
                        Traverse(iData);
                    
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
                            Traverse(iUpdateData);
                        }
                        else if(iSearch==2){
                            SOP("Welocome to Update Element");
                            iUpdateData = UpdateElement(iData);
                            SOP("New Values:");
                            Traverse(iUpdateData);
                        }
                        
                        break;
                }
                case 4:{
                    SOP("Welocome to  Delete Operation");
                    Delete(iData);
                    break;
                }
                case 5:{
                    SOP("Welocome to  Insert Operation");
                    Insert(iData);

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
    public static void Traverse(int iNewData[]){    
        
        for(int x=0; x<iNewData.length; x++){
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
        public static int[] Delete(int iNewData[]){
        int iDeleteIdx = GetNumbers("Enter The index to Delete: ");
        int ia = 0;
        SOP("Before");
        //Traverse
        Traverse(iNewData);
        //Deletion
        for(int x= iDeleteIdx; x<iNewData.length-1; x++){
            iNewData[x] = iNewData[x+1];
            ia=1;
        }
        SOP("AFTER");  
        for(int a=0; a<iNewData.length-1; a++){
            SOP("Data "+ (a)+": "+ iNewData[a]);
        }
        if(ia !=1){
            SOP("Index not Found" );
        }
        return iNewData;
    }
    public static int[] Insert(int iNewData[]){
        int iInsert = GetNumbers("Enter The Value to Insert: ");
        int iIndex = GetNumbers("Enter The index whero to Insert: ");
        int ia = 0;
        SOP("Before");
        //Traverse
        Traverse(iNewData);
        iNewData[iIndex]=iInsert;

        SOP("AFTER");  
        for(int a=0; a<iNewData.length+1; a++){
            if(a<iNewData.length){
                SOP("Data "+ (a)+": "+ iNewData[a]);
                ia=1;
            }
            else if(a==iNewData.length+1){
                iNewData[a]=0;
                SOP("Data "+ (a)+": "+ iNewData[a]);
                ia=1;
            }
        }
        if(ia !=1){
            SOP("Index not Found" );
        }
        return iNewData;
    }
}
