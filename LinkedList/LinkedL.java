
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
        while (pres.next !=null) {
            pres = pres.next;
            System.out.println("here");
        }
        pres.next = linkl.head;
    }

    public static void main(String[] args) {
        LinkedL linkl = new LinkedL();
        linkl.addNode(3);
        linkl.addNode(7);
        linkl.addNode(1);

        //linkl.display();

        // circular(linkl);
        // linkl.display();
        LinkedL list1 = new LinkedL();
        LinkedL list2 =  new LinkedL();

        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(4);
        list2.addNode(1);
        list2.addNode(3);
        list2.addNode(4);
        Node ans = mergeTwoList(list1.head,list2.head);
        list1.head = ans;
        list1.display();

    }
    public static Node mergeTwoList(Node list1, Node list2){
        Node finalist;
        if(list1 == null){
            finalist = list2;
            return finalist;
        }
        if(list2 == null){
            finalist = list1;
            return finalist;
        }

        if(list1.data<list2.data){
            System.out.println("Exec");
            finalist = list1;
            finalist.next = mergeTwoList(list1.next, list2);
        }
        else {
            finalist = list2;
            finalist.next = mergeTwoList(list1, list2.next);
        }
        return finalist;
    }

    
}