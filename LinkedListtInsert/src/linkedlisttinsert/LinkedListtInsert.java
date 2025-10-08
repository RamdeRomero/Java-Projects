package linkedlisttinsert;
import java.util.Scanner;
public class LinkedListtInsert {

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
    
    public void NodeList(int s){
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
    }
    public void displayList(){
        Node present = head;
        while(present != null){
            System.out.print(present.data + "->");
            present = present.next;
        }
        System.out.println(tail.next);
        System.out.println("First Number:"+ head.data);
        System.out.println("Last Number"+ tail.data);  
    } 
    public void insertEnd(){
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
    }
    public void insertBegin(){
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
    }
    public void insertMiddle(int siz){
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
        
    }
    
    
    public static void main(String[] args) {
        LinkedListtInsert oObj= new LinkedListtInsert();
        System.out.println("Welcome to Insert Operation using Linked List Program");
        System.out.print("Enter the size/number of your List: ");
        int size = oscan.nextInt();
        oObj.NodeList(size);
        oObj.displayList();
        System.out.print("Pick what method to use:\n1 - Insert at the beginning of the list\n2 - Insert at the middle of the list \n3 - Insert at the end of the list \nEnter here: ");
        int ichoice = oscan.nextInt();
        
        switch (ichoice){
            case 1:{
                oObj.insertBegin();
                oObj.displayList();
                break;
            }
            case 2:{
                oObj.insertMiddle(size);
                oObj.displayList();
                break;
            }
            case 3:{
                oObj.insertEnd();
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
