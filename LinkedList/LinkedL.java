
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
        
        while (cur != null ) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            //System.out.println("Excecuted");
        }
        linkl.head = prev;
        
    } 
    // public static void circular(LinkedL linkl){
    //     Node fast = linkl.head;
    //     Node slow = linkl.head;
    //     while(slow.next!=null && fast.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //         if(slow == fast){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        LinkedL linkl = new LinkedL();
        linkl.addNode(1);
        linkl.addNode(2);
        linkl.addNode(3);
        linkl.addNode(4);
        rev(linkl);
        linkl.display();

        // circular(linkl);
        // linkl.display();
        LinkedL list1 = new LinkedL();
        LinkedL list2 =  new LinkedL();

        // list1.addNode(1);
        // list1.addNode(2);
        // list1.addNode(4);
        list2.addNode(1);
        list2.addNode(3);
        list2.addNode(4);
        // Node ans = mergeTwoList(list1.head,list2.head);
        // list1.head = ans;
        //list1.display();
        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(2);
        list1.addNode(1);
        // list1.addNode(3);
        // list1.addNode(4);
        // list1.addNode(5);
        //removeNth(list1.head, 2);
        // swapNodes(list1.head,3);
        //list1.display();

    }
    public static void swapNodes(Node head, int k){
        Node curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        int len = (count+1)-k;
        curr = head;
        Node rev = head;
        for(int i=0;i<count;i++){
            curr = curr.next;
            if(i==k-1){
                break;
            }
        }
        for(int i=0;i<count;i++){
            rev = rev.next;
            if(i == len){
                break;
            }
        }
        int temp = curr.data;
        curr.data = rev.data;
        rev.data = temp;

        
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

    public static Node removeNth(Node head, int n){
        Node tex = head;
        int count=0;
        while(tex != null){
            tex = tex.next;
            count++;
        }
        Node curr = head;
        int len  = count-n+1;
        while (count-n>=0 && curr.next != null) {
            if(count-n==1 ){
                //System.out.println("Value in testing1 :"+curr.data);
                curr.next = curr.next.next;
                // System.out.println("Exec");
                //System.out.println("Value in testing2 :"+curr.next.data);
                return curr;
            }
            else if(count==n){
                
            }
            else{
                //System.out.println("Before :"+curr.data);
                curr = curr.next;
                count--;
                //System.out.println("Exec2");
                //System.out.println("After :"+curr.data);
            }
        }
        return curr;
    }
    public static boolean isPali(Node head){
        Node trav = head;
        String val =""; 
        
        while(trav != null){
            val += Integer.toString(trav.data);
            trav = trav.next;
        }
        String rev = "";
        StringBuilder sb = new StringBuilder(val);
        sb.reverse();
        rev = sb.toString();
        if(val==sb.toString()){
            return true;
        }
        return false;
    }
}