package midterm21.bug;

public class Midterm21Bug {

class Node{
        int data;
        Node next;
        public Node(int element){
            this.data = element;
        }
    }
    public Node head = null;
    public Node tail = null;
    
    public void createList(){
        Node A = NEW Node(5);
        Node B = NEW Node(10);
        Node C = New Node(15);
        Node D = New Node(20);
        
        head = A;
        tail = D;
        A.next = B;
        B.next = C;
        C.next = D;
    }
    public void displayList(){
        Node current = tail;
        while(current != tail){
            System.out.print(current.next+ "->");
            current = current.data;
        }
    }
    public static void main(String[] args) {
        MExam oList = new MExam();
        
        oList.createList();
        oList.displayList();
    }
    
}
