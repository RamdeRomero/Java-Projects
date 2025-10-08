package linkedlistdelete;
import java.util.Scanner;
public class LinkedListDelete {
    
    public static Scanner oscan = new Scanner(System.in);
    class Node{
        int data;
        Node next;
        public Node(int Element){
            this.data=Element;
        }
    }
    public Node head = null;
    public Node tail = null; 
    
    public void createNodeList(int s){
        int iInput;
        System.out.print("Enter The Numbers");
        System.out.print("\n1: ");
        iInput = oscan.nextInt();
        Node newNode = new Node(iInput);
        head = newNode;
        tail = newNode;
        
        for(int x=2; x<=s; x++){
            System.out.print( x +": ");
            iInput = oscan.nextInt();
            Node tempo = new Node(iInput);
            tail.next=tempo;
            tail=tempo;
        }
        tail.next = null;
        System.out.println("\nCREATION DONE!");
    }
    public void displayList(){
        System.out.println("\nHERE IS THE DISPLAY:");
        Node present = head;
        while(present != null){
            System.out.print(present.data + "->");
            present = present.next;
        }
        System.out.println(tail.next);
        System.out.println("First Number:"+ head.data);
        System.out.println("Last Number"+ tail.data); 
        System.out.println("\nEND OF DISPLAY");
    }
        public void deleteMid(int sizz){
        System.out.println("Welcome to Delete at the Middle!");
        System.out.print("What method would you like to choose \n1-DELETE USING POSITION \n2-DELETE USING THE DATA\nEnter here: ");
        int ichoice= oscan.nextInt();
        
        switch(ichoice){
            case 1:{
                System.out.println("You Are using Position");
                int icount=0;
                if(sizz%2==0){
                    icount= sizz/2;
                }else{
                    icount= (sizz+1)/2;
                }
                System.out.println("Your middle is in position: "+ icount);
                Node tempo, current;
                tempo = head;
                current = null; 
                for(int x=0; x<(icount-1); x++){
                    current=tempo;
                    tempo= tempo.next;                     
                }
                current.next= tempo.next;
                tempo= null;        
                System.out.println("Deletion Success");
                break;
                
            }
            case 2:{
                System.out.println("You Are using Data");
                Node temp = head;
                Node current = null; 
                Node delete = head;
                int ideleteData=0;
                int icount=0, icount2=0;
                System.out.print("Press 1 - To let program calculate the middle data\nPress 2 - To enter the middle Data\nEnter Here: ");
                icount2 = oscan.nextInt();
                switch(icount2){
                    case 1:{
                       if(sizz%2==0){
                        icount= sizz/2;
                       }else{
                        icount= (sizz+1)/2;
                       }
                       for(int x=0; x<(icount-1); x++){
                        ideleteData= delete.data;
                        delete = delete.next;
                    
                       }
                       ideleteData = delete.data; 
                       break;
                    }
                    case 2:{
                        System.out.print("Enter the middle data: ");
                        ideleteData = oscan.nextInt();
                        break;
                    }
                    default:{
                        System.out.print("Input Error ");
                        break;
                    }
                }
                while (temp.data != ideleteData){ 
                    current = temp; 
                    temp = temp.next; 
                }     

                current.next = temp.next; 
                System.out.print("Deletion Success");
                break;
            }
            default:{
                System.out.println("Input Error!");
                break;
            }
        }
    }
        public void deleteStart(){
       System.out.println("Welcome to Delete at Start!");
       //Node delete = head;
       head = head.next;
       System.out.println("Deletion Success!");
    }
    public void deleteEnd(){
       System.out.println("Welcome to Delete at End!");
       Node current = head;
       while(current.next!=tail){
           current=current.next;
       }
       tail = current;
       tail.next = null;
       System.out.println("Deletion Success!");
    }
    public static void main(String[] args) {
        LinkedListDelete oObj= new LinkedListDelete();
        System.out.println("Welcome to Delete Operation using Linked List Program");
        System.out.print("Enter the size/number of your List: ");
        int size = oscan.nextInt();
        oObj.createNodeList(size);
        oObj.displayList();
        System.out.print("Pick what method to use:\n1 - Delete at the beginning of the list\n2 - Delete at the middle of the list \n3 - Delete at the end of the list \nEnter here: ");
        int ichoice = oscan.nextInt();
        
        switch (ichoice){
            case 1:{
                oObj.deleteStart();
                oObj.displayList();
                break;
            }
            case 2:{
                oObj.deleteMid(size);
                oObj.displayList();
                break;
            }
            case 3:{
                oObj.deleteEnd();
                oObj.displayList();
                break;
            }
            default:{
                System.out.println("Input Error!");
                break;
            }
        }
        System.out.println("THANK YOU FOR USING!");
    }
    
}
