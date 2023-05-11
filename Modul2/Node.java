public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            return;
        }
        Node current = this.head;
        while (current.next != null) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void ori(){
        Node current = this.head;
        int temp;
        while(current != null && current.next != null) {
            if (current.data > current.next.data) {
                temp = current.data;
                current.data = current.next.data;
                current.next.data = temp;
            }
            current = current.next;
        }
    }
    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode(3);
        linkedList.addNode(2);
        linkedList.addNode(6);
        linkedList.addNode(5);
        linkedList.addNode(7);
        linkedList.addNode(8);

        System.out.println("Sebelum : ");
        linkedList.printList(); 
        System.out.print("Sesudah : ");
        linkedList.ori();
        linkedList.printList();
        
    }
}
