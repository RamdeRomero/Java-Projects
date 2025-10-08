package midtermexam;

public class MidtermExam{
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
        Node A = new Node(5);
        Node B = new Node(10);
        Node C = new Node(15);
        Node D = new Node(20);
        
        head = D;
        tail = A;
        D.next = C;
        B.next = A;
        C.next = B;
    }
    public void displayList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+ "->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        MidtermExam oList = new MidtermExam();
        
        oList.createList();
        oList.displayList();
    }
    
}
