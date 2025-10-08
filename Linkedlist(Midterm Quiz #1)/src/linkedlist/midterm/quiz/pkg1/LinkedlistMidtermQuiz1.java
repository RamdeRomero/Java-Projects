package linkedlist.midterm.quiz.pkg1;
import java.util.Scanner;
public class LinkedlistMidtermQuiz1 {

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
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
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

    } 
    public void insertEnd(){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
            System.out.println("Welcome to Insert in the End!");
            int newNode;
            System.out.print("Enter a new Value at the End: ");
            newNode = oscan.nextInt();
            if(head == null){
                System.out.println("The list is Empty!");
            }
            else{
                Node insertNode = new Node(newNode);
                tail.next = insertNode;
                tail = insertNode;
            }
            System.out.println("\nINSERT AT THE END DONE!");
        }
    }
    public void insertBegin(){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
            System.out.println("Welcome to Insert in the Beginning!");
            int newNode;
            System.out.print("Enter a new Value at the Beginning: ");
            newNode = oscan.nextInt();
            if(head == null){
                System.out.println("The list is Empty!");
            }
            else{
                Node insertNode = new Node(newNode);
                insertNode.next = head;
                head = insertNode;
            }
            System.out.println("\nINSERT AT THE BEGINNING DONE!");
        }
    }
    public void insertMiddle(int siz){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
            System.out.println("Welcome to Insert in the Middle!");
            int newNode;
            System.out.print("Enter a new Value at the Middle: ");
            newNode = oscan.nextInt();
            int icount=0;
            if(siz%2==0){
                icount= siz/2;
            }else{
                icount= (siz+1)/2;
            }
            
            if(head == null){
                System.out.println("The list is Empty!");
            }
            else{
                Node insertNode = new Node(newNode);
                Node tempo, current;
                tempo = head;
                current = null;                      
                for(int x=0; x<icount; x++){
                    current=tempo;
                    tempo=tempo.next;
                }
                current.next= insertNode;
                insertNode.next = tempo;
            }
            System.out.println("\nINSERT AT THE MIDDLE DONE!");
        }
    }
    public void deleteStart(){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
       }
        else{
            System.out.println("Welcome to Delete at Start!");
            head = head.next;
            System.out.println("Deletion Success!");
       }
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
            System.out.println("Welcome to Delete at End!");
            Node current = head;
            while(current.next!=tail){
                current=current.next;
            }
            tail = current;
            tail.next = null;
            System.out.println("Deletion Success!");
        }
    }
    public void deleteMid(int sizz){
        if(head==null){
            System.out.println("List is Empty\nPlease create A Node List First!");
        }
        else{
            System.out.println("Welcome to Delete at the Middle!");
            System.out.print("What method would you like to choose \n1-DELETE USING POSITION \n2-DELETE USING THE DATA\nEnter here: ");
            int dchoice= oscan.nextInt();
        
            switch(dchoice){
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
                        System.out.print("Enter the data: ");
                        int ideleteData = oscan.nextInt();
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
    }

  
    
    public static void main(String[] args) {
        LinkedlistMidtermQuiz1 oObj= new LinkedlistMidtermQuiz1();
        System.out.println("Welcome to Insert and Delete Operation using Linked List Program");
        int ichoice=0, size=0;
        do{
            System.out.print("\nPick what Action to do:"
                + "\n1 - CREATE NODE LIST  "
                + "\n2 - INSERT NODE AT START"
                + "\n3 - INSERT NODE AT END"
                + "\n4 - INSERT NODE AT MIDDLE"
                + "\n5 - DELETE NODE AT START"
                + "\n6 - DELETE NODE AT END"
                + "\n7 - DELETE NODE AT MIDDLE"
                + "\n\t - DELETE USING THE POSITION"
                + "\n\t - DELETE USING THE DATA"
                + "\n8 - DISPLAY"
                + "\n9 - EXIT"
                + "\nENTER HERE: "               
            );
            ichoice = oscan.nextInt();
        
            switch (ichoice){
                case 1:{
                    System.out.println("\nWELCOME TO CREATE NODE LIST");
                    System.out.print("Enter the size/number of your List: ");
                    size = oscan.nextInt();
                    oObj.createNodeList(size);
                    break;
                }
                case 2:{
                    oObj.insertBegin();
                    size++;
                    break;
                }
                case 3:{
                    oObj.insertEnd();
                    size++;
                    break;
                }
                case 4:{
                    oObj.insertMiddle(size);
                    size++;
                    break;
                }
                case 5:{
                    oObj.deleteStart();
                    size--;
                    break;
                }
                case 6:{
                    oObj.deleteEnd();
                    size--;
                    break;
                }
                case 7:{
                    oObj.deleteMid(size);
                    size--;
                    break;
                }
                case 8:{
                    oObj.displayList();
                    break;
                }
                case 9:{
                    System.out.println("THANK YOU FOR USING!");
                    break;
                }
                default:{
                    System.out.println("Input Error!");
                    break;
                }
            }
        }while(ichoice!=9);
        
    }
    
}
