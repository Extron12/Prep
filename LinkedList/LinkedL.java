class LinkedL{


    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    
    public void addNode(int data){
        Node newN = new Node(data);

        if (head == null){
            head = newN;
            tail = newN;
        }

        else{
            tail.next = newN;
            tail = newN;
        }
    }

    public void display(){
        Node curr = head;
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        while (curr != null) {
            System.out.println(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }

    public static void rev(LinkedL linkl){
        Node prev = null;
        Node cur = linkl.head;
        Node next = null; 
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            System.out.println("Excecuted");
        }
        linkl.head = prev;
        
    } 

    public static void circular(LinkedL linkl){
        Node pres = linkl.head;
        while (pres !=null) {
            
        }
    }

    public static void main(String[] args) {
        LinkedL linkl = new LinkedL();
        linkl.addNode(3);
        linkl.addNode(7);
        linkl.addNode(1);

        linkl.display();

        rev(linkl);
        linkl.display();

    }

    
}