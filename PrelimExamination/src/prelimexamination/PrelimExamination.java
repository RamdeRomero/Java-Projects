package prelimexamination;
import java.util.Scanner;

public class PrelimExamination {

    public static Scanner oscan = new Scanner(System.in);
    public static void main(String[] args) {
        int iS=0;
        int[] iN= new int[iS];
        input(iS,iN);
    }
  
    
    public static void input(int iSize, int iNumber[]){
        System.out.println("WELCOME TO VALUE INSERTION PROGRAM "
                + "\n   Where you can enter a value between elements "
                + "\n   That is greater than the sum of the values  ");
        System.out.print("\nEnter how many number/s you want to input: ");
        iSize= oscan.nextInt();
        iNumber = new int[(iSize+1)];
        System.out.println("Enter the value/s:");
        //input loop
        for(int x=0; x<iSize; x++){
            System.out.print((x+1) +": " );
            iNumber[x]=oscan.nextInt();
        }
        insert(iSize, iNumber);
    }
    public static void insert(int iSi, int iNum[]){
        int iNewNum,iSum, iWhere;
        //Sum loop
        iSum=0;
        for(int x=0; x<iSi; x++){
            iSum=iSum+iNum[x];
        }
        System.out.println("Sum of the Values is: "+ iSum);
        System.out.println("INSERTING:");
        do{
            System.out.print("Enter a value in the array to insert:");
            iNewNum= oscan.nextInt();
            if(iNewNum<=iSum){
                System.out.println("Your inputted value is less than or equal to the Sum \nTry Again");
            }else{
                System.out.println("Thank for entering a valid value");
            }
            
        }while(iNewNum<=iSum);
        //Assigning the element
        System.out.println("\nNEXT: Assigning where");
        do{
            System.out.print("\nEnter the element number where you want to insert: ");
            iWhere= oscan.nextInt();
            //loop to insert    
            for(int x=(iSi-1); x>=(iWhere-1);x--){
            iNum[x+1]=iNum[x];
            }
            if(iWhere<=(iSi+1)){
                System.out.println("\nThank you for entering a valid value");   
            }else{
                System.out.println("Your inputted element number is not found \nPlease choose from:");
                for(int x=0; x<iSi+1; x++){
                System.out.print((x+1)+", ");
                }
            }            
        }while(iWhere>(iSi+1));
        // Diplay
        iNum[iWhere-1]=iNewNum;       
        System.out.println("Here is the Updated List \nNew List:");
        for(int x=0; x<iSi+1; x++){
            System.out.println((x+1) + ":" +iNum[x]);
        }      
        System.out.println("Thank you for using!");
        
    }
    
}
