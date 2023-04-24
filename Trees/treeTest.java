package Trees;

class Node{
    int data;
    Node right;
    Node left;

    public Node(int data){
        this.data = data;
    }
}
public class treeTest {
    Node root;

    public static void main(String[] args) {
        treeTest tree = new treeTest();
        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(12);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);

        tree.preOrder(tree.root);
    }
    public void addNode(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }
        else{
            Node curr = root;
            Node parent;

            while (true){
                parent = curr;

                if(data<curr.data){
                    curr= curr.left;
                    if(curr==null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    curr=curr.right;
                    if(curr==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void preOrder(Node curr){
        if(curr!=null){
            System.out.print(curr.data+" ");
            preOrder(curr.left);
            preOrder(curr.right);
        }
    }

}
